package com.alahli.middleware.account.bean;

import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathFactory;

import org.apache.camel.Exchange;
import org.apache.camel.Header;
import org.apache.camel.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alahli.middleware.account.models.CMSAccountTransactions;
import com.alahli.middleware.account.models.CMSAccountTransactionsRequest;
import com.alahli.middleware.account.models.CMSAccountTransactionsResponse;
import com.alahli.middleware.account.models.CMSAccountTransactionsSuccess;
import com.alahli.middleware.account.models.ServiceHeader;
import com.alahli.middleware.account.models.Transaction;
import com.alahli.middleware.account.models.backends.cms.CseBusinessBean;
import com.alahli.middleware.account.models.backends.cms.GetCMSAccountTransactionsProcessRequest;
import com.alahli.middleware.account.utils.AccountUtils;
import com.alahli.middleware.utility.Utils.StringUtil;
import com.alahli.middleware.utility.Utils.Utils;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class GetCMSAccountTransactionsService {

	@Autowired
	ObjectMapper objectMapper;

	@Autowired
	AccountUtils oAccountUtils;

	@Autowired
	StringUtil oStringUtil;

	@Autowired
	Utils oUtils;

	private String logContextToken = "675ebf23-f04a-11ef-e44c-0c46d111dd26:af8a2d61-3c41-11ef-e44c-0c1ed6f19489:1.003.001:";

	private String serviceID = "IOMSRV99127";

	// storing incoming CMSAccountTransactions data
	private CMSAccountTransactions oCMSAccountTransactions;

	// storing incoming cmsAccountTransactionsRequest data
	private CMSAccountTransactionsRequest cmsAccountTransactionsRequest;

	// storing the incoming service header
	private ServiceHeader oServiceHeader;

	XPath xPath = XPathFactory.newInstance().newXPath();

	/**
	 * 
	 * @param cmsAccountTransactions
	 * @param serviceHeader
	 * @throws Exception
	 */
	public void setCMSAccountTransactionsRequestIn(CMSAccountTransactions cmsAccountTransactions,
			@Header("ServiceHeader") String serviceHeader) throws Exception {

		this.oServiceHeader = objectMapper.readValue(serviceHeader, ServiceHeader.class);
		this.oCMSAccountTransactions = cmsAccountTransactions;
		this.cmsAccountTransactionsRequest = cmsAccountTransactions.getoCMSAccountTransactionsRequest();

	}

	/**
	 * Prepare request for the external api in XML format
	 * 
	 * @return GetCMSAccountTransactionsProcessRequest class
	 * @throws Exception
	 */
	public GetCMSAccountTransactionsProcessRequest processRequest() throws Exception {

		String inputMessage = oCMSAccountTransactions.toString();

		CseBusinessBean oCseBusinessBean = new CseBusinessBean();

		oCseBusinessBean.setLogContextToken(logContextToken);
		oCseBusinessBean.setiNPUTMESSAGE(inputMessage);
		oCseBusinessBean.setsERVICEID(serviceID);

		GetCMSAccountTransactionsProcessRequest oGetCMSAccountTransactionsProcessRequest = new GetCMSAccountTransactionsProcessRequest();
		oGetCMSAccountTransactionsProcessRequest.setLogContextToken(logContextToken);
		oGetCMSAccountTransactionsProcessRequest.setArg0(oCseBusinessBean);

		return oGetCMSAccountTransactionsProcessRequest;
	}

	/**
	 * Prepare final processResponse by mapping the retrieved response from the external
	 * api
	 * 
	 * @param ex Exchange body
	 * @throws Exception
	 */
	public void processResponse(Exchange ex) throws Exception {

		Message message = ex.getIn();

		String responseStringXML = ex.getIn().getBody(String.class);

		// removing %17, %3D and %2C charecters
		String decodedResponseStringXML = URLDecoder.decode(responseStringXML, "CP1256");

		String returnCode = this.oAccountUtils.getValueFromCMSResponse("RETURNCODE", decodedResponseStringXML);

		if (returnCode.equals("0000")) {

			CMSAccountTransactions oCMSAccountTransactions = new CMSAccountTransactions();
			CMSAccountTransactionsResponse oCMSAccountTransactionsResponse = new CMSAccountTransactionsResponse();
			CMSAccountTransactionsSuccess oCMSAccountTransactionsSuccess = new CMSAccountTransactionsSuccess();
			List<Transaction> transaction = new ArrayList<Transaction>();

			oCMSAccountTransactions.setoCMSAccountTransactionsResponse(oCMSAccountTransactionsResponse);
			oCMSAccountTransactionsResponse.setSuccess(oCMSAccountTransactionsSuccess);
			oCMSAccountTransactionsSuccess.setTransaction(transaction);

			oCMSAccountTransactionsSuccess
					.setStatusCode(this.oAccountUtils.getValueFromCMSResponse("RETURNCODE", decodedResponseStringXML));
			oCMSAccountTransactionsSuccess.setStatusDescription(
					this.oAccountUtils.getValueFromCMSResponse("DESCRIPTION", decodedResponseStringXML));
			oCMSAccountTransactionsSuccess
					.setNotes(this.oAccountUtils.getValueFromCMSResponse("NOTES", decodedResponseStringXML));

			message.setBody(oCMSAccountTransactions);

		} else {

			String nativeDescription = oAccountUtils.getValueFromCMSResponse("DESCRIPTION", decodedResponseStringXML);

			message.setBody(oUtils.prepareFaultNodeStr("CMSAccountsResponse", "CMS", "", returnCode, nativeDescription,
					"sysOrAppWithBkndError", ex));
		}

	}

}
