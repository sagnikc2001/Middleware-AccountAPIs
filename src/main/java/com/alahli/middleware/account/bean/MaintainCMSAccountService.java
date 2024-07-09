package com.alahli.middleware.account.bean;

import java.io.InputStream;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;

import org.apache.camel.Exchange;
import org.apache.camel.Header;
import org.apache.camel.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.alahli.middleware.account.models.Account;
import com.alahli.middleware.account.models.CMSAccountMaintainance;
import com.alahli.middleware.account.models.CMSAccountMaintenanceResponse;
import com.alahli.middleware.account.models.ServiceHeader;
import com.alahli.middleware.account.models.CMSAccountTransactionsSuccess;
import com.alahli.middleware.account.models.backends.cms.Arg0;
import com.alahli.middleware.account.models.backends.cms.CMSAccountMaintenanceRequest;
import com.alahli.middleware.account.models.backends.cms.CMSAccountMaintenanceType;
import com.alahli.middleware.account.models.backends.cms.CMSMaintenanceSuccessType;
import com.alahli.middleware.account.models.backends.cms.InputMessage;
import com.alahli.middleware.account.models.backends.cms.LoggerContext;
import com.alahli.middleware.account.models.backends.cms.ProcessRequest;
import com.alahli.middleware.account.models.backends.cms.ProcessRequestResponse;
import com.alahli.middleware.account.utils.AccountUtils;
import com.alahli.middleware.utility.Utils.StringUtil;
import com.alahli.middleware.utility.Utils.Utils;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class MaintainCMSAccountService {

	@Autowired
	ObjectMapper objectMapper;

	@Autowired
	AccountUtils oAccountUtils;

	@Autowired
	StringUtil oStringUtil;
	
	@Autowired
	Utils oUtils;

	private String serviceID = "IOMSRV99126";

	private String logContextToken = "376d277a-b5ad-11ef-e300-b4be40531dd2:b7187323-d02b-11ef-e300-b4cc069817fe:1.003.001:";

	private String headerTimestamp = "1716359800979";

	private String startedBy = "cn=newb2bGen,cn=organizational users,o=NextGen,cn=cordys,cn=UATEnv,o=alahli.com";

	// storing incoming CMSAccountMaintenanceRequest data
	private com.alahli.middleware.account.models.CMSAccountMaintenanceRequest cmsAccountMaintenanceRequest;

	// storing the incoming service header
	private ServiceHeader oServiceHeader;

	XPath xPath = XPathFactory.newInstance().newXPath();

	/**
	 * 
	 * @param cmsAccountMaintainance
	 * @param serviceHeader
	 * @throws Exception
	 */
	public void setCMSAccountMaintenanceRequestIn(CMSAccountMaintainance cmsAccountMaintainance,
			@Header("ServiceHeader") String serviceHeader) throws Exception {

		this.oServiceHeader = objectMapper.readValue(serviceHeader, ServiceHeader.class);
		this.cmsAccountMaintenanceRequest = cmsAccountMaintainance.getcMSAccountMaintenanceRequest();

	}

	/**
	 * Prepare request for the external api in XML format
	 * 
	 * @return ProcessRequest class
	 * @throws Exception
	 */
	public ProcessRequest prepareProcessRequest() throws Exception {

		ProcessRequest oProcessRequest = new ProcessRequest();
		Arg0 oArg0 = new Arg0();
		InputMessage oInputMessage = new InputMessage();
		com.alahli.middleware.account.models.backends.cms.CMSAccountMaintenanceRequest oCMSAccountMaintenanceRequest = new com.alahli.middleware.account.models.backends.cms.CMSAccountMaintenanceRequest();
		com.alahli.middleware.account.models.backends.cms.ServiceHeader oServiceHeaderBknd = new com.alahli.middleware.account.models.backends.cms.ServiceHeader();
		LoggerContext oLoggerContext = new LoggerContext();

		oProcessRequest.setArg0(oArg0);
		oArg0.setiNPUTMESSAGE(oInputMessage);
		oInputMessage.setcMSAccountMaintenanceRequest(oCMSAccountMaintenanceRequest);
		oCMSAccountMaintenanceRequest.setServiceHeader(oServiceHeaderBknd);
		oServiceHeaderBknd.setLoggerContext(oLoggerContext);

		oArg0.setLogContextToken(logContextToken);
		oArg0.setsERVICEID(serviceID);

		oProcessRequest.setLogContextToken(logContextToken);

		oCMSAccountMaintenanceRequest.setLogContextToken(logContextToken);
		oCMSAccountMaintenanceRequest
				.setRequestMode(oStringUtil.setDefaultValue(cmsAccountMaintenanceRequest.getRequestMode(), ""));
		oCMSAccountMaintenanceRequest
				.setAccountNumber(oStringUtil.setDefaultValue(cmsAccountMaintenanceRequest.getAccountNumber(), ""));
		oCMSAccountMaintenanceRequest.setOmniAccountNumber(
				oStringUtil.setDefaultValue(cmsAccountMaintenanceRequest.getOmniAccountNumber(), ""));
		oCMSAccountMaintenanceRequest.setEnglishNickName(cmsAccountMaintenanceRequest.getEnglishNickName());
		oCMSAccountMaintenanceRequest.setArabicNickName(cmsAccountMaintenanceRequest.getArabicNickName());
		oCMSAccountMaintenanceRequest.setCurrency(cmsAccountMaintenanceRequest.getCurrency());
		oCMSAccountMaintenanceRequest.setOmniMappedCode(cmsAccountMaintenanceRequest.getOmniMappedCode());
		oCMSAccountMaintenanceRequest.setExternalLinkCode1(cmsAccountMaintenanceRequest.getExternalLinkCode1());
		oCMSAccountMaintenanceRequest.setExternalLinkCode2(cmsAccountMaintenanceRequest.getExternalLinkCode2());
		oCMSAccountMaintenanceRequest.setReferenceNumber1(cmsAccountMaintenanceRequest.getReferenceNumber1());
		oCMSAccountMaintenanceRequest.setReferenceNumber2(cmsAccountMaintenanceRequest.getReferenceNumber2());
		oCMSAccountMaintenanceRequest.setNotes1(cmsAccountMaintenanceRequest.getNotes1());
		oCMSAccountMaintenanceRequest.setNotes2(cmsAccountMaintenanceRequest.getNotes2());
		oCMSAccountMaintenanceRequest.setRemitterId(cmsAccountMaintenanceRequest.getRemitterId());
		oCMSAccountMaintenanceRequest.setBlockedTransactions(cmsAccountMaintenanceRequest.getBlockedTransactions());
		oCMSAccountMaintenanceRequest
				.setTransactionNotificationFlag(cmsAccountMaintenanceRequest.getTransactionNotificationFlag());
		oCMSAccountMaintenanceRequest.setDebitFlag(cmsAccountMaintenanceRequest.getDebitFlag());
		oCMSAccountMaintenanceRequest.setCreditFlag(cmsAccountMaintenanceRequest.getCreditFlag());
		oCMSAccountMaintenanceRequest
				.setMinimumAccountBalanceLimit(cmsAccountMaintenanceRequest.getMinimumAccountBalanceLimit());
		oCMSAccountMaintenanceRequest
				.setMaximumAccountBalanceLimit(cmsAccountMaintenanceRequest.getMaximumAccountBalanceLimit());
		oCMSAccountMaintenanceRequest.setSubscriptionFlag(cmsAccountMaintenanceRequest.getSubscriptionFlag());
		oCMSAccountMaintenanceRequest.setAccountResetFlag(cmsAccountMaintenanceRequest.getAccountResetFlag());
		oCMSAccountMaintenanceRequest.setUniqueReference(cmsAccountMaintenanceRequest.getUniqueReference());
		oCMSAccountMaintenanceRequest.setSkipCapLimit(cmsAccountMaintenanceRequest.getSkipCapLimit());

		oLoggerContext.setHeaderTimestamp(headerTimestamp);
		oLoggerContext.setContext(logContextToken);

		oServiceHeaderBknd.setTransactionCode(oServiceHeader.getTransactionCode());
		oServiceHeaderBknd.setRetryTransaction(oServiceHeader.isRetryTransaction());
		oServiceHeaderBknd.setTellerId(oServiceHeader.getTellerId());
		oServiceHeaderBknd.setTerminalId(oServiceHeader.getTerminalId());
		oServiceHeaderBknd.setWorkstationId(oServiceHeader.getWorkstationId());
		oServiceHeaderBknd.setOverride(oServiceHeader.getOverrideCode());
		oServiceHeaderBknd.setCorrection(oServiceHeader.getCorrection());
		oServiceHeaderBknd.setCorrection(oServiceHeader.getCorrection());
		oServiceHeaderBknd.setSupervisor(oServiceHeader.getSupervisor());
		oServiceHeaderBknd.setSupervisorId(oServiceHeader.getSupervisorId());
		oServiceHeaderBknd.setOverrideCode(oServiceHeader.getOverrideCode());
		oServiceHeaderBknd.setEmployeeId(oServiceHeader.getEmployeeId());
		oServiceHeaderBknd.setBranchId(oServiceHeader.getBranchId());
		oServiceHeaderBknd.setFunctionId(oServiceHeader.getFunctionId());
		oServiceHeaderBknd.setChannelId(oServiceHeader.getChannelId());
		oServiceHeaderBknd.setBancsPwd(oServiceHeader.getBancsPwd());
		oServiceHeaderBknd.setLanguageCode(oServiceHeader.getLanguageCode());
		oServiceHeaderBknd.setAuthenticationType(oServiceHeader.getAuthenticationType());

		oCMSAccountMaintenanceRequest.setStartedBy(startedBy);

		return oProcessRequest;
	}

	/**
	 * Prepare final response by mapping the retrieved response from the external
	 * api
	 * 
	 * @param ex Exchange body
	 * @throws Exception
	 */
	public void prepareCMSAccountMaintainanceFinalResponse(Exchange ex) throws Exception {

		Message message = ex.getIn();

		Document oDocument = oAccountUtils.getDomObject((InputStream) ex.getIn().getBody(InputStream.class));

		String responseStringXML = ex.getIn().getBody(String.class);
		
		// removing %17, %3D and %2C charecters
		String decodedResponseStringXML = URLDecoder.decode(responseStringXML,"CP1256");
				
		String returnCode = this.oAccountUtils.getValueFromCMSResponse("RETURNCODE", decodedResponseStringXML);
		
		NodeList processRequestResponseNode = (NodeList) xPath.compile("//processRequestResponse/success")
				.evaluate(oDocument, XPathConstants.NODE);

		NodeList accountListNode = (NodeList) xPath.compile("//processRequestResponse/success/account")
				.evaluate(oDocument, XPathConstants.NODESET);

//		String statusCode = (String) xPath.evaluate("statusCode", processRequestResponseNode, XPathConstants.STRING);

		if (returnCode.equals("1113")) {

			CMSAccountMaintainance oCMSAccountMaintainance = new CMSAccountMaintainance();
			CMSAccountMaintenanceResponse oCMSAccountMaintenanceResponse = new CMSAccountMaintenanceResponse();
			com.alahli.middleware.account.models.Success oSuccess = new com.alahli.middleware.account.models.Success();

			oCMSAccountMaintainance.setcMSAccountMaintenanceResponse(oCMSAccountMaintenanceResponse);
			oCMSAccountMaintenanceResponse.setSuccess(oSuccess);

			oSuccess.setStatusCode(
					(String) xPath.evaluate("statusCode", processRequestResponseNode, XPathConstants.STRING));
			oSuccess.setStatusDescription(
					(String) xPath.evaluate("statusDescription", processRequestResponseNode, XPathConstants.STRING));
			oSuccess.setNotes((String) xPath.evaluate("notes", processRequestResponseNode, XPathConstants.STRING));

			List<Account> account = new ArrayList<>();
			oSuccess.setAccount(account);

			// Iterate through the NodeList
			for (int i = 0; i < accountListNode.getLength(); i++) {

				Node accountNode = accountListNode.item(i);

				Account oAccount = new Account();

				oAccount.setAccountNumber((String) xPath.evaluate("accountNumber", accountNode, XPathConstants.STRING));
				oAccount.setIbanAccountNumber(
						(String) xPath.evaluate("ibanAccountNumber", accountNode, XPathConstants.STRING));
				oAccount.setRemitterId((String) xPath.evaluate("remitterId", accountNode, XPathConstants.STRING));
				oAccount.setBlockedTransactions(
						(String) xPath.evaluate("blockedTransactions", accountNode, XPathConstants.STRING));
				oAccount.setDebitFlag((String) xPath.evaluate("debitFlag", accountNode, XPathConstants.STRING));
				oAccount.setCreditFlag((String) xPath.evaluate("creditFlag", accountNode, XPathConstants.STRING));
				oAccount.setMinimumAccountBalanceLimit(
						((Double) xPath.evaluate("minimumAccountBalanceLimit", accountNode, XPathConstants.NUMBER))
								.intValue());
				oAccount.setMaximumAccountBalanceLimit(
						((Double) xPath.evaluate("maximumAccountBalanceLimit", accountNode, XPathConstants.NUMBER))
								.intValue());
				oAccount.setSubscriptionFlag(
						(String) xPath.evaluate("subscriptionFlag", accountNode, XPathConstants.STRING));
				oAccount.setAccountResetFlag(
						(String) xPath.evaluate("accountResetFlag", accountNode, XPathConstants.STRING));

				account.add(oAccount);
			}

			message.setBody(oCMSAccountMaintainance);

		}
		else {
			
//			String nativeDescription = (String) xPath.evaluate("statusDescription", processRequestResponseNode, XPathConstants.STRING);
			
			String nativeDescription = oAccountUtils.getValueFromCMSResponse("DESCRIPTION", decodedResponseStringXML);
			
			message.setBody(oUtils.prepareFaultNodeStr("CMSAccountsResponse", "CMS", "", returnCode, nativeDescription,
					"sysOrAppWithBkndError", ex));
			
		}
	}

}
