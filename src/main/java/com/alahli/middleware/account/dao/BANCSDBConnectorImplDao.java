package com.alahli.middleware.account.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Types;

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
public class BANCSDBConnectorImplDao {

	@Autowired
	private DataSource dataSource;

	/**
	 * Executes a stored procedure to Inquire Account Status based on provided
	 * parameters.
	 * 
	 * @param body The JSON body containing request data from client, including
	 *             accntNumber1
	 * @param ex   The Exchange object for handling exceptions
	 * @return JSON response containing Inquire Account Response retrieved from the
	 *         database
	 * @throws Exception If there is an error during database connection or
	 *                   procedure execution
	 */
	public ObjectNode InquiryAccountStatusProcedure(
			@Simple("${body[InquireAccountStatusRequest][accntNumber1]}") String accntNumber1, Exchange ex)
			throws Exception {

		Connection conn = null;
		OracleCallableStatement ocStatement = null;
		ResultSet rs = null;

		try {

			conn = dataSource.getConnection();

			String strProcedure = "CALL INQ_ACC_STAT (?,?)";

			ocStatement = (OracleCallableStatement) conn.prepareCall(strProcedure);

			ocStatement.setString(1, accntNumber1);
			ocStatement.registerOutParameter(2, OracleTypes.CURSOR);

			ocStatement.execute();

			rs = (ResultSet) ocStatement.getObject(2);
			ResultSetMetaData rsMetadata = null;
			rsMetadata = rs.getMetaData();
			int noOfColumns = rsMetadata.getColumnCount();

			ObjectNode oInquiryAccountStatusResponseNode = JsonNodeFactory.instance.objectNode();
			ObjectNode oInquiryAccountStatusResponse = oInquiryAccountStatusResponseNode
					.putObject("InquireAccountStatusResponse");
			ObjectNode oSuccess = oInquiryAccountStatusResponse.putObject("success");

			while (rs.next()) {

				for (int i = 1; i <= noOfColumns; i++) {
					String columnName = rsMetadata.getColumnName(i);
					String columnValue = rs.getString(i);

					oSuccess.put(columnName, columnValue);
				}
			}

			if (oSuccess.size() < 1) {
				oInquiryAccountStatusResponse.remove("success");
				ObjectNode oError = oInquiryAccountStatusResponse.putObject("ERROR");
				oError.put("errorMsg", "ERROR");
			}

			return oInquiryAccountStatusResponseNode;

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

				if (null != conn)
					conn.close();

			} catch (SQLException e) {
				e.printStackTrace();
				ex.getIn().setBody(e.getMessage());
			}
		}
		return null;
	}

	/**
	 * Executes a stored procedure to UPdate Account Status based on provided
	 * parameters.
	 * 
	 * @param body The JSON body containing update data from client, including
	 *             accntNumber1, etc.
	 * @param ex   The Exchange object for handling exceptions
	 * @return JSON response containing Inquire Account Response containing
	 *         updateStatus
	 * @throws Exception If there is an error during database connection or
	 *                   procedure execution
	 */
	public ObjectNode UpdateAccountStatusProcedure(
			@Simple("${body[UpdateAccountStatusRequest][accntNumber1]}") String accntNumber1,
			@Simple("${body[UpdateAccountStatusRequest][currentStatus]}") String currentStatus,
			@Simple("${body[UpdateAccountStatusRequest][newStatus]}") String newStatus,
			@Simple("${body[UpdateAccountStatusRequest][currKycStatus]}") String currKycStatus,
			@Simple("${body[UpdateAccountStatusRequest][newKycStatus]}") String newKycStatus,
			@Simple("${body[UpdateAccountStatusRequest][currSamaStatus]}") String currSamaStatus,
			@Simple("${body[UpdateAccountStatusRequest][newSamaStatus]}") String newSamaStatus,
			@Simple("${body[UpdateAccountStatusRequest][reasonAcctStatus]}") String reasonAcctStatus,
			@Simple("${body[UpdateAccountStatusRequest][reasonSamaStatus]}") String reasonSamaStatus,
			@Simple("${body[UpdateAccountStatusRequest][reasonKycStatus]}") String reasonKycStatus,
			@Simple("${body[UpdateAccountStatusRequest][kycUnfreezeDate]}") String kycUnfreezeDate,
			@Simple("${body[UpdateAccountStatusRequest][letterNo]}") String letterNo,
			@Simple("${body[UpdateAccountStatusRequest][letterDate]}") String letterDate,
			@Simple("${body[UpdateAccountStatusRequest][blockDate]}") String blockDate,
			@Simple("${body[UpdateAccountStatusRequest][note]}") String note,
			@Simple("${body[UpdateAccountStatusRequest][inacStat]}") String inacStat,
			@Simple("${body[UpdateAccountStatusRequest][enfBlockStatus]}") String enfBlockStatus,
			@Simple("${body[UpdateAccountStatusRequest][ssuBlockStatus]}") String ssuBlockStatus,
			@Simple("${body[UpdateAccountStatusRequest][legalBlockStatus]}") String legalBlockStatus,
			@Simple("${body[UpdateAccountStatusRequest][effEnfBlockDate]}") String effEnfBlockDate,
			@Simple("${body[UpdateAccountStatusRequest][effEnfBlockDateFlag]}") String effEnfBlockDateFlag,
			@Simple("${body[UpdateAccountStatusRequest][effSsuBlockDate]}") String effSsuBlockDate,
			@Simple("${body[UpdateAccountStatusRequest][effSsuBlockDateFlag]}") String effSsuBlockDateFlag,
			@Simple("${body[UpdateAccountStatusRequest][effLegalBlockDate]}") String effLegalBlockDate,
			@Simple("${body[UpdateAccountStatusRequest][effLegalBlockDateFlag]}") String effLegalBlockDateFlag,
			@Simple("${body[UpdateAccountStatusRequest][enfBlockReasonStat]}") String enfBlockReasonStat,
			@Simple("${body[UpdateAccountStatusRequest][ssuBlockReasonStat]}") String ssuBlockReasonStat,
			@Simple("${body[UpdateAccountStatusRequest][legalBlockReasonStat]}") String legalBlockReasonStat,
			@Simple("${body[UpdateAccountStatusRequest][enfStopPeriod]}") String enfStopPeriod,
			@Simple("${body[UpdateAccountStatusRequest][ssuStopPeriod]}") String ssuStopPeriod,
			@Simple("${body[UpdateAccountStatusRequest][enfBlockDate]}") String enfBlockDate,
			@Simple("${body[UpdateAccountStatusRequest][ssuBlockLetterNo]}") String ssuBlockLetterNo,
			@Simple("${body[UpdateAccountStatusRequest][legalBlockLetterNo]}") String legalBlockLetterNo,
			@Simple("${body[UpdateAccountStatusRequest][ssuBlockLttrDate]}") String ssuBlockLttrDate,
			@Simple("${body[UpdateAccountStatusRequest][legalBlockLttrDate]}") String legalBlockLttrDate,
			@Simple("${body[UpdateAccountStatusRequest][ssuBlockNote]}") String ssuBlockNote,
			@Simple("${body[UpdateAccountStatusRequest][legalBlockNote]}") String legalBlockNote,
			@Simple("${body[UpdateAccountStatusRequest][lstAcctStatDate]}") String lstAcctStatDate,
			@Simple("${body[UpdateAccountStatusRequest][fatcaFreze]}") String fatcaFreze,
			@Simple("${body[UpdateAccountStatusRequest][workFlowFlag]}") String workFlowFlag,
			@Simple("${body[UpdateAccountStatusRequest][reasonPendActiveStat]}") String reasonPendActiveStat,
			@Simple("${body[UpdateAccountStatusRequest][kyccriteriaFlag]}") String kyccriteriaFlag,
			@Simple("${body[UpdateAccountStatusRequest][identifierFlag]}") String identifierFlag, Exchange ex)
			throws Exception {

		Connection conn = null;
		OracleCallableStatement ocStatement = null;

		try {
			conn = dataSource.getConnection();

			String strProcedure = "CALL UPDT_ACC_STAT(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			ocStatement = (OracleCallableStatement) conn.prepareCall(strProcedure);

			// Set IN parameters
			ocStatement.setString(1, accntNumber1);
			ocStatement.setString(2, currentStatus);
			ocStatement.setString(3, newStatus);
			ocStatement.setString(4, currKycStatus);
			ocStatement.setString(5, newKycStatus);
			ocStatement.setString(6, currSamaStatus);
			ocStatement.setString(7, newSamaStatus);
			ocStatement.setString(8, reasonAcctStatus);
			ocStatement.setString(9, reasonSamaStatus);
			ocStatement.setString(10, reasonKycStatus);
			ocStatement.setString(11, kycUnfreezeDate);
			ocStatement.setString(12, letterNo);
			ocStatement.setString(13, letterDate);
			ocStatement.setString(14, blockDate);
			ocStatement.setString(15, note);
			ocStatement.setString(16, inacStat);
			ocStatement.setString(17, enfBlockStatus);
			ocStatement.setString(18, ssuBlockStatus);
			ocStatement.setString(19, legalBlockStatus);
			ocStatement.setString(20, effEnfBlockDate);
			ocStatement.setString(21, effEnfBlockDateFlag);
			ocStatement.setString(22, effSsuBlockDate);
			ocStatement.setString(23, effSsuBlockDateFlag);
			ocStatement.setString(24, effLegalBlockDate);
			ocStatement.setString(25, effLegalBlockDateFlag);
			ocStatement.setString(26, enfBlockReasonStat);
			ocStatement.setString(27, ssuBlockReasonStat);
			ocStatement.setString(28, legalBlockReasonStat);
			ocStatement.setString(29, enfStopPeriod);
			ocStatement.setString(30, ssuStopPeriod);
			ocStatement.setString(31, enfBlockDate);
			ocStatement.setString(32, ssuBlockLetterNo);
			ocStatement.setString(33, legalBlockLetterNo);
			ocStatement.setString(34, ssuBlockLttrDate);
			ocStatement.setString(35, legalBlockLttrDate);
			ocStatement.setString(36, ssuBlockNote);
			ocStatement.setString(37, legalBlockNote);
			ocStatement.setString(38, lstAcctStatDate);
			ocStatement.setString(39, fatcaFreze);
			ocStatement.setString(40, workFlowFlag);
			ocStatement.setString(41, reasonPendActiveStat);
			ocStatement.setString(42, kyccriteriaFlag);
			ocStatement.setString(43, identifierFlag);

			ocStatement.registerOutParameter(44, Types.INTEGER);

			ocStatement.execute();

			// Retrieve the number of rows affected
			int rowsAffected = ocStatement.getInt(44);

			ObjectNode oUpdateAccountStatusResponseNode = JsonNodeFactory.instance.objectNode();
			ObjectNode oUpdateAccountStatusResponse = oUpdateAccountStatusResponseNode
					.putObject("UpdateAccountStatusResponse");

			if (rowsAffected > 0) {
				ObjectNode oSuccess = oUpdateAccountStatusResponse.putObject("success");
				oSuccess.put("updateStatus", true);
				oSuccess.put("accntNumber1", accntNumber1);
			} else {
				ObjectNode oError = oUpdateAccountStatusResponse.putObject("ERROR");
				oError.put("updateStatus", false);
				oError.put("accntNumber1", accntNumber1);
			}

			return oUpdateAccountStatusResponseNode;

		} catch (Exception e) {
			e.printStackTrace();
			ex.getIn().setBody(e.getMessage());
		} finally {
			try {
				if (ocStatement != null) {
					ocStatement.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
				ex.getIn().setBody(e.getMessage());
			}
		}
		return null;
	}

}
