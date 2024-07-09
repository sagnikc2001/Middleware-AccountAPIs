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
	public void setGetCMSAccountTransactionsRequestIn(CMSAccountTransactions cmsAccountTransactions,
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
	public GetCMSAccountTransactionsProcessRequest prepareProcessRequest() throws Exception {
		
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
	 * Prepare final response by mapping the retrieved response from the external
	 * api
	 * 
	 * @param ex Exchange body
	 * @throws Exception
	 */
	public void prepareCMSAccountTransactionsFinalResponse(Exchange ex) throws Exception{
		
		Message message = ex.getIn();
		
		String responseStringXML = ex.getIn().getBody(String.class);
		
		// removing %17, %3D and %2C charecters
		String decodedResponseStringXML = URLDecoder.decode(responseStringXML,"CP1256");
		
		String returnCode = this.oAccountUtils.getValueFromCMSResponse("RETURNCODE", decodedResponseStringXML);
		
		if(returnCode.equals("0000")) {
			
			CMSAccountTransactions oCMSAccountTransactions = new CMSAccountTransactions();
			CMSAccountTransactionsResponse oCMSAccountTransactionsResponse = new CMSAccountTransactionsResponse();
			CMSAccountTransactionsSuccess oCMSAccountTransactionsSuccess = new CMSAccountTransactionsSuccess();
			List<Transaction> transaction = new ArrayList<Transaction>();
			
			oCMSAccountTransactions.setoCMSAccountTransactionsResponse(oCMSAccountTransactionsResponse);
			oCMSAccountTransactionsResponse.setSuccess(oCMSAccountTransactionsSuccess);
			oCMSAccountTransactionsSuccess.setTransaction(transaction);
			
			oCMSAccountTransactionsSuccess.setStatusCode(this.oAccountUtils.getValueFromCMSResponse("RETURNCODE", decodedResponseStringXML));
			oCMSAccountTransactionsSuccess.setStatusDescription(this.oAccountUtils.getValueFromCMSResponse("DESCRIPTION", decodedResponseStringXML));
			oCMSAccountTransactionsSuccess.setNotes(this.oAccountUtils.getValueFromCMSResponse("NOTES", decodedResponseStringXML));
			
//			 String jsonString = this.oAccountUtils.getValueFromCMSResponse("XMLMSG", decodedResponseStringXML);
//			 System.out.println("jsonString " + jsonString);
//			 
//			 JsonNode root = this.objectMapper.readTree(jsonString);
//			 
//			 if(root != null) {
//				 
//				 JsonNode transactions = root.get("TRANSACTIONS");
//				 
//				 for(JsonNode transaction : transactions) {
//					 
//					 Transaction oTransaction = new Transaction();
//					 
//					 oTransaction.setMessageID(this.oStringUtil.setDefaultValue("",null));
//					 oTransaction.setAccountNumber(this.oStringUtil.setDefaultValue("",null));
//					 oTransaction.setOmniMappedCode(this.oStringUtil.setDefaultValue(transaction.get("OMNIMAPPEDCODE"),null));
//					 oTransaction.setMessageDate(this.oStringUtil.setDefaultValue(transaction.get("MESSAGETIME"),null));
//					 oTransaction.setOmniAccountNumber(this.oStringUtil.setDefaultValue(transaction.get("OMNIACCOUNTNB"),null));
//					 oTransaction.setTransactionDate(this.oStringUtil.setDefaultValue("",null));
//			         oTransaction.setCurrency(this.oStringUtil.setDefaultValue("",null));
//			         oTransaction.setValueDate(this.oStringUtil.setDefaultValue("",null));
//			         oTransaction.setAmount(null);
//			         oTransaction.setDebitCreditFlag(this.oStringUtil.setDefaultValue("",null));
//			         oTransaction.setDebitCreditDescription(this.oStringUtil.setDefaultValue("",null));
//			         oTransaction.setMainStatus(this.oStringUtil.setDefaultValue("",null));
//			         oTransaction.setMainStatusDesciption(this.oStringUtil.setDefaultValue("",null));
//			         oTransaction.setChannel(this.oStringUtil.setDefaultValue(transaction.get("CHANNEL"),null));
//			         oTransaction.setRequestUser(this.oStringUtil.setDefaultValue(transaction.get("CHANNELUSERID"),null));
//			         oTransaction.setOmniName(this.oStringUtil.setDefaultValue("",null));
//			         oTransaction.setNickName(this.oStringUtil.setDefaultValue("",null));
//			         oTransaction.setReference1(this.oStringUtil.setDefaultValue(transaction.get("REQREFERENCE1"),null));
//			         oTransaction.setReference2(this.oStringUtil.setDefaultValue(transaction.get("REQREFERENCE2"),null));
//			         oTransaction.setReference3(this.oStringUtil.setDefaultValue(transaction.get("REQREFERENCE3"),null));
//			         oTransaction.setReference4(this.oStringUtil.setDefaultValue("",null));
//			         oTransaction.setReference5(this.oStringUtil.setDefaultValue("",null));
//			         oTransaction.setReference6(this.oStringUtil.setDefaultValue("",null));
//			         oTransaction.setSourceReference(this.oStringUtil.setDefaultValue("",null));
//			         oTransaction.setUniqueReference(this.oStringUtil.setDefaultValue("",null));
//			         oTransaction.setEnglishLine1(this.oStringUtil.setDefaultValue("",null));
//			         oTransaction.setEnglishLine2(this.oStringUtil.setDefaultValue("",null));
//			         oTransaction.setArabicLine1(this.oStringUtil.setDefaultValue("",null));
//			         oTransaction.setArabicLine2(this.oStringUtil.setDefaultValue("",null));
//			         oTransaction.setReturnCode(this.oStringUtil.setDefaultValue("",null));
//			         oTransaction.setNotes1(this.oStringUtil.setDefaultValue("",null));
//			         oTransaction.setNotes2(this.oStringUtil.setDefaultValue("",null));
//			         oTransaction.setCreateUserCode(this.oStringUtil.setDefaultValue("",null));
//			         oTransaction.setCreateDate(this.oStringUtil.setDefaultValue("",null));
//			         oTransaction.setApproveUserCode(this.oStringUtil.setDefaultValue("",null));
//			         oTransaction.setApproveDate(this.oStringUtil.setDefaultValue("",null));
//			         oTransaction.setTagDetails(this.oStringUtil.setDefaultValue("",null));
//			         oTransaction.setIbanAccountNumber(this.oStringUtil.setDefaultValue("",null));
//			         oTransaction.setTransactionFeeAmount(null);
//			         oTransaction.setTransactionTaxAmount(null);
//			         oTransaction.setTransactionTotalAmount(null);
//				 }
//			 }
			
			message.setBody(oCMSAccountTransactions);
		}
		else {
			
			String nativeDescription = oAccountUtils.getValueFromCMSResponse("DESCRIPTION", decodedResponseStringXML);

			message.setBody(oUtils.prepareFaultNodeStr("CMSAccountsResponse", "CMS", "", returnCode, nativeDescription,
					"sysOrAppWithBkndError", ex));
		}
		
	}

}
