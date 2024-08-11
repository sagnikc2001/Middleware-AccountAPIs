package com.alahli.middleware.account.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import javax.sql.DataSource;

import org.apache.camel.Exchange;
import org.apache.camel.language.simple.Simple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;

import oracle.jdbc.OracleTypes;
import oracle.jdbc.internal.OracleCallableStatement;

@Lazy
@Component
public class ODSDBConnectorImplDao {

	@Autowired
	private DataSource dataSource;

	/**
	 * Executes a stored procedure to retrieve cumulativeBalance based on provided
	 * parameters.
	 * 
	 * @param body The JSON body containing request data from client, including
	 *             shortCIF
	 * @param ex   The Exchange object for handling exceptions
	 * @return JSON response containing cumulativeBalance retrieved from the database
	 * @throws Exception If there is an error during database connection or
	 *                   procedure execution
	 */
	public ObjectNode CallProcedureToGetCustAcctCumulativeBalance(
			@Simple("${body[CustAcctsCumulativeBalRequest][cifNumber]}") String cifNumber, Exchange ex)
			throws Exception {

		Connection conn = null;
		OracleCallableStatement ocStatement = null;
		ResultSet rs = null;

		try {
			
			conn = dataSource.getConnection();
			
			String strProcedure = "CALL GETCUSTCUMLBAL (?,?)";

			ocStatement = (OracleCallableStatement) conn.prepareCall(strProcedure);
			
			ocStatement.setString(1, cifNumber);
			ocStatement.registerOutParameter(2, OracleTypes.CURSOR);
			
			ocStatement.execute();

			rs = (ResultSet) ocStatement.getObject(2);
			ResultSetMetaData rsMetadata = null;
			rsMetadata = rs.getMetaData();
			
			ObjectNode oCustAcctsCumulativeBalResponseNode = JsonNodeFactory.instance.objectNode();
			ObjectNode oCustAcctsCumulativeBalResponse = oCustAcctsCumulativeBalResponseNode.putObject("CustAcctsCumulativeBalResponse");
			ObjectNode oSuccess = oCustAcctsCumulativeBalResponse.putObject("success");
			
			while (rs.next()) {
				
				oSuccess.put("CUMULATIVEBALANCE", rs.getDouble(3));
			}
			return oCustAcctsCumulativeBalResponseNode;

		} catch (Exception e) {

			e.printStackTrace();
			ex.getIn().setBody(e.getMessage());
		} finally {

			try {

				if (rs != null) {
					rs.close();
				}

				if (ocStatement != null) {
					ocStatement.close();
				}

				if (null != conn) {
					conn.close();
				}

			} catch (Exception e) {

				e.printStackTrace();
				ex.getIn().setBody(e.getMessage());
			}
		}

		return null;
	}

}
