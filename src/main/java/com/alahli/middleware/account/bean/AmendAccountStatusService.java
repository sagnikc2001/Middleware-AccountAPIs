package com.alahli.middleware.account.bean;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathFactory;

import org.apache.camel.Exchange;
import org.apache.camel.Header;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alahli.middleware.account.models.AccountStatusAmendment;
import com.alahli.middleware.account.models.AccountStatusAmendmentResponse;
import com.alahli.middleware.account.models.AccountStatusAmendmentSuccess;
import com.alahli.middleware.account.models.ServiceHeader;
import com.alahli.middleware.account.models.backends.bancs.InquireAccountStatusRequest;
import com.alahli.middleware.account.models.backends.bancs.InquireAccountStatusRequestType;
import com.alahli.middleware.account.models.backends.bancs.UpdateAccountStatusRequest;
import com.alahli.middleware.account.models.backends.bancs.UpdateAccountStatusRequestType;
import com.alahli.middleware.account.utils.AccountUtils;
import com.alahli.middleware.utility.Utils.StringUtil;
import com.alahli.middleware.utility.Utils.Utils;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class AmendAccountStatusService {

	@Autowired
	ObjectMapper objectMapper;

	@Autowired
	AccountUtils oAccountUtils;

	@Autowired
	StringUtil oStringUtil;

	@Autowired
	Utils oUtils;

	// storing incoming AccountStatusAmendmentRequest data
	private com.alahli.middleware.account.models.AccountStatusAmendmentRequest accountStatusAmendmentRequest = new com.alahli.middleware.account.models.AccountStatusAmendmentRequest();

	// storing the incoming service header
	private ServiceHeader oServiceHeader;

	XPath xPath = XPathFactory.newInstance().newXPath();

	/**
	 * 
	 * @param accountStatusAmendment
	 * @param serviceHeader
	 * @throws Exception
	 */
	public void setAccountStatusAmendmentRequestIn(AccountStatusAmendment accountStatusAmendment,
			@Header("ServiceHeader") String serviceHeader) throws Exception {

		this.oServiceHeader = objectMapper.readValue(serviceHeader, ServiceHeader.class);
		this.accountStatusAmendmentRequest = accountStatusAmendment.getoAccountStatusAmendmentRequest();
	}

	/**
	 * Prepare request for the external api
	 * 
	 * @return InquireAccountStatusRequest class
	 * @throws Exception
	 */
	public InquireAccountStatusRequest prepareInquireAccountStatusRequestBackend() throws Exception {

		InquireAccountStatusRequest oInquireAccountStatusRequest = new InquireAccountStatusRequest();
		InquireAccountStatusRequestType oInquireAccountStatusRequestType = new InquireAccountStatusRequestType();

		oInquireAccountStatusRequest.setInquireAccountStatusRequest(oInquireAccountStatusRequestType);

		oInquireAccountStatusRequestType.setAccntNumber1(oStringUtil.setDefaultValue(accountStatusAmendmentRequest.getAccountNumber(), ""));

		return oInquireAccountStatusRequest;
	}

	/**
	 * Prepare final response by mapping the retrieved response from the external api
	 * 
	 * @param ex Exchange body
	 * @return AccountStatusAmendment class
	 * @throws Exception
	 */
	public AccountStatusAmendment prepareInquireAccountStatusAmendmentFinalResponse(Exchange ex) throws Exception {

		JsonNode oInquiryAccountStatusResponseNode = objectMapper.readTree(ex.getIn().getBody(String.class));

		JsonNode oInquiryAccountStatusResponseJson = oInquiryAccountStatusResponseNode
				.get("InquiryAccountStatusResponse");
		
		JsonNode oSuccessNode = oInquiryAccountStatusResponseJson.get("success");

		AccountStatusAmendment oAccountStatusAmendment = new AccountStatusAmendment();
		AccountStatusAmendmentResponse oAccountStatusAmendmentResponse = new AccountStatusAmendmentResponse();
		AccountStatusAmendmentSuccess success = new AccountStatusAmendmentSuccess();

		oAccountStatusAmendment.setoAccountStatusAmendmentResponse(oAccountStatusAmendmentResponse);
		oAccountStatusAmendmentResponse.setSuccess(success);

		success.setAccountNumber(oSuccessNode.get("ACCNT_NUMBER").asText());
		success.setCurrentStatus(oSuccessNode.get("CURRENT_STATUS").asText());
		success.setNewStatus(oSuccessNode.get("NEW_STATUS").asText());
		success.setCurrentKYCStatus(oSuccessNode.get("CURR_KYC_STATUS").asText());
		success.setNewKYCStatus(oSuccessNode.get("NEW_KYC_STATUS").asText());
		success.setCurrentSamaStatus(oSuccessNode.get("CURR_SAMA_STATUS").asText());
		success.setNewSamaStatus(oSuccessNode.get("NEW_SAMA_STATUS").asText());
		success.setReasonAccountStatus(oSuccessNode.get("REASON_ACCT_STATUS").asText());
		success.setReasonSamaStatus(oSuccessNode.get("REASON_SAMA_STATUS").asText());
		success.setReasonKYCStatus(oSuccessNode.get("REASON_KYC_STATUS").asText());
		success.setKycUnfreezeDate(oSuccessNode.get("KYC_UNFREEZE_DATE").asText());
		success.setLetterNumber(oSuccessNode.get("LETTER_NO").asText());
		success.setLetterDate(oSuccessNode.get("LETTER_DATE").asText());
		success.setBlockDate(oSuccessNode.get("BLOCK_DATE").asText());
		success.setNote(oSuccessNode.get("NOTE").asText());
		success.setInacStat(oSuccessNode.get("INAC_STAT").asText());
		success.setEnfBlockStatus(oSuccessNode.get("ENF_BLOCK_STATUS").asText());
		success.setSsuBlockStatus(oSuccessNode.get("SSU_BLOCK_STATUS").asText());
		success.setLegalBlockStatus(oSuccessNode.get("LEGAL_BLOCK_STATUS").asText());
		success.setEffENFBlockDate(oSuccessNode.get("EFF_ENF_BLOCK_DATE").asText());
		success.setEffENFBlockDateFlag(oSuccessNode.get("EFF_ENF_BLOCK_DATE_FLAG").asText());
		success.setEffSSUBlockDate(oSuccessNode.get("EFF_SSU_BLOCK_DATE").asText());
		success.setEffSSUBlockDateFlag(oSuccessNode.get("EFF_SSU_BLOCK_DATE_FLAG").asText());
		success.setEffLegalBlockDate(oSuccessNode.get("EFF_LEGAL_BLOCK_DATE").asText());
		success.setEffLegalBlockDateFlag(oSuccessNode.get("EFF_LEGAL_BLOCK_DATE_FLAG").asText());
		success.setEnfBlockReasonStat(oSuccessNode.get("ENF_BLOCK_REASON_STAT").asText());
		success.setSsuBlockReasonStat(oSuccessNode.get("SSU_BLOCK_REASON_STAT").asText());
		success.setLegalBlockReasonStat(oSuccessNode.get("LEGAL_BLOCK_REASON_STAT").asText());
		success.setEnfStopPeriod(oSuccessNode.get("ENF_STOP_PERIOD").asText());
		success.setSsuStopPeriod(oSuccessNode.get("SSU_STOP_PERIOD").asText());
		success.setEnfBlockDate(oSuccessNode.get("ENF_BLOCK_DATE").asText());
		success.setSsuBlockLetterNumber(oSuccessNode.get("SSU_BLOCK_LETTER_NO").asText());
		success.setLegalBlockLetterNumber(oSuccessNode.get("LEGAL_BLOCK_LETTER_NO").asText());
		success.setSsuBlockLetterDate(oSuccessNode.get("SSU_BLOCK_LTTR_DATE").asText());
		success.setLegalBlockLetterDate(oSuccessNode.get("LEGAL_BLOCK_LTTR_DATE").asText());
		success.setSsuBlockNote(oSuccessNode.get("SSU_BLOCK_NOTE").asText());
		success.setLegalBlockNote(oSuccessNode.get("LEGAL_BLOCK_NOTE").asText());
		success.setLastAccountStatDate(oSuccessNode.get("LST_ACCT_STAT_DATE").asText());
		success.setHighRiskAccount(oSuccessNode.get("HIGH_RISK_ACCT").asText());
		success.setFatcaFreeze(oSuccessNode.get("FATCA_FREZE").asText());
		success.setWorkFlowFlag(oSuccessNode.get("WORK_FLOW_FLAG").asText());

		return oAccountStatusAmendment;
	}
	
	/**
	 * Prepare request for the external api
	 * 
	 * @return UpdateAccountStatusRequest class
	 * @throws Exception
	 */
	public UpdateAccountStatusRequest prepareUpdateAccountStatusRequestBackend() throws Exception{
		
		UpdateAccountStatusRequest oUpdateAccountStatusRequest = new UpdateAccountStatusRequest();
		UpdateAccountStatusRequestType oUpdateAccountStatusRequestType = new UpdateAccountStatusRequestType();
		
		oUpdateAccountStatusRequest.setUpdateAccountStatusRequest(oUpdateAccountStatusRequestType);
		
		oUpdateAccountStatusRequestType.setAccntNumber1(oStringUtil.setDefaultValue(accountStatusAmendmentRequest.getAccountNumber(), ""));
		oUpdateAccountStatusRequestType.setCurrentStatus(oStringUtil.setDefaultValue(accountStatusAmendmentRequest.getCurrentStatus(), ""));
		oUpdateAccountStatusRequestType.setNewStatus(oStringUtil.setDefaultValue(accountStatusAmendmentRequest.getNewStatus(), ""));
		oUpdateAccountStatusRequestType.setCurrKycStatus(oStringUtil.setDefaultValue(accountStatusAmendmentRequest.getCurrentKYCStatus(), ""));
		oUpdateAccountStatusRequestType.setNewKycStatus(oStringUtil.setDefaultValue(accountStatusAmendmentRequest.getNewKYCStatus(), ""));
		oUpdateAccountStatusRequestType.setCurrSamaStatus(oStringUtil.setDefaultValue(accountStatusAmendmentRequest.getCurrentSamaStatus(), ""));
		oUpdateAccountStatusRequestType.setNewSamaStatus(oStringUtil.setDefaultValue(accountStatusAmendmentRequest.getNewSamaStatus(), ""));
		oUpdateAccountStatusRequestType.setReasonAcctStatus(oStringUtil.setDefaultValue(accountStatusAmendmentRequest.getReasonAccountStatus(), ""));
		oUpdateAccountStatusRequestType.setReasonSamaStatus(oStringUtil.setDefaultValue(accountStatusAmendmentRequest.getReasonSamaStatus(), ""));
		oUpdateAccountStatusRequestType.setReasonKycStatus(oStringUtil.setDefaultValue(accountStatusAmendmentRequest.getReasonKYCStatus(), ""));
		oUpdateAccountStatusRequestType.setKycUnfreezeDate(oStringUtil.setDefaultValue(accountStatusAmendmentRequest.getKycUnfreezeDate(), ""));
		oUpdateAccountStatusRequestType.setLetterNo(oStringUtil.setDefaultValue(accountStatusAmendmentRequest.getLetterNumber(), ""));
		oUpdateAccountStatusRequestType.setLetterDate(oStringUtil.setDefaultValue(accountStatusAmendmentRequest.getLetterDate(), ""));
		oUpdateAccountStatusRequestType.setBlockDate(oStringUtil.setDefaultValue(accountStatusAmendmentRequest.getBlockDate(), ""));
		oUpdateAccountStatusRequestType.setNote(oStringUtil.setDefaultValue(accountStatusAmendmentRequest.getNote(), ""));
		oUpdateAccountStatusRequestType.setInacStat(oStringUtil.setDefaultValue(accountStatusAmendmentRequest.getInacStat(), ""));
		oUpdateAccountStatusRequestType.setEnfBlockStatus(oStringUtil.setDefaultValue(accountStatusAmendmentRequest.getEnfBlockStatus(), ""));
		oUpdateAccountStatusRequestType.setSsuBlockStatus(oStringUtil.setDefaultValue(accountStatusAmendmentRequest.getSsuBlockStatus(), ""));
		oUpdateAccountStatusRequestType.setLegalBlockStatus(oStringUtil.setDefaultValue(accountStatusAmendmentRequest.getLegalBlockStatus(), ""));
		oUpdateAccountStatusRequestType.setEffEnfBlockDate(oStringUtil.setDefaultValue(accountStatusAmendmentRequest.getEffENFBlockDate(), ""));
		oUpdateAccountStatusRequestType.setEffEnfBlockDateFlag(oStringUtil.setDefaultValue(accountStatusAmendmentRequest.getEffENFBlockDateFlag(), ""));
		oUpdateAccountStatusRequestType.setEffSsuBlockDate(oStringUtil.setDefaultValue(accountStatusAmendmentRequest.getEffSSUBlockDate(), ""));
		oUpdateAccountStatusRequestType.setEffSsuBlockDateFlag(oStringUtil.setDefaultValue(accountStatusAmendmentRequest.getEffSSUBlockDateFlag(), ""));
		oUpdateAccountStatusRequestType.setEffLegalBlockDate(oStringUtil.setDefaultValue(accountStatusAmendmentRequest.getEffLegalBlockDate(), ""));
		oUpdateAccountStatusRequestType.setEffLegalBlockDateFlag(oStringUtil.setDefaultValue(accountStatusAmendmentRequest.getEffLegalBlockDateFlag(), ""));
		oUpdateAccountStatusRequestType.setEnfBlockReasonStat(oStringUtil.setDefaultValue(accountStatusAmendmentRequest.getEnfBlockReasonStat(), ""));
		oUpdateAccountStatusRequestType.setSsuBlockReasonStat(oStringUtil.setDefaultValue(accountStatusAmendmentRequest.getSsuBlockReasonStat(), ""));
		oUpdateAccountStatusRequestType.setLegalBlockReasonStat(oStringUtil.setDefaultValue(accountStatusAmendmentRequest.getLegalBlockReasonStat(), ""));
		oUpdateAccountStatusRequestType.setEnfStopPeriod(oStringUtil.setDefaultValue(accountStatusAmendmentRequest.getEnfStopPeriod(), ""));
		oUpdateAccountStatusRequestType.setSsuStopPeriod(oStringUtil.setDefaultValue(accountStatusAmendmentRequest.getSsuStopPeriod(), ""));
		oUpdateAccountStatusRequestType.setEnfBlockDate(oStringUtil.setDefaultValue(accountStatusAmendmentRequest.getEnfBlockDate(), ""));
		oUpdateAccountStatusRequestType.setSsuBlockLetterNo(oStringUtil.setDefaultValue(accountStatusAmendmentRequest.getSsuBlockLetterNumber(), ""));
		oUpdateAccountStatusRequestType.setLegalBlockLetterNo(oStringUtil.setDefaultValue(accountStatusAmendmentRequest.getLegalBlockLetterNumber(), ""));
		oUpdateAccountStatusRequestType.setSsuBlockLttrDate(oStringUtil.setDefaultValue(accountStatusAmendmentRequest.getSsuBlockLetterDate(), ""));
		oUpdateAccountStatusRequestType.setLegalBlockLttrDate(oStringUtil.setDefaultValue(accountStatusAmendmentRequest.getLegalBlockLetterDate(), ""));
		oUpdateAccountStatusRequestType.setSsuBlockNote(oStringUtil.setDefaultValue(accountStatusAmendmentRequest.getSsuBlockNote(), ""));
		oUpdateAccountStatusRequestType.setLegalBlockNote(oStringUtil.setDefaultValue(accountStatusAmendmentRequest.getLegalBlockNote(), ""));
		oUpdateAccountStatusRequestType.setLstAcctStatDate(oStringUtil.setDefaultValue(accountStatusAmendmentRequest.getLastAccountStatDate(), ""));
		oUpdateAccountStatusRequestType.setFatcaFreze(oStringUtil.setDefaultValue(accountStatusAmendmentRequest.getFatcaFreeze(), ""));
		oUpdateAccountStatusRequestType.setWorkFlowFlag(oStringUtil.setDefaultValue(accountStatusAmendmentRequest.getWorkFlowFlag(), ""));
		oUpdateAccountStatusRequestType.setReasonPendActiveStat(oStringUtil.setDefaultValue("", ""));
		oUpdateAccountStatusRequestType.setKyccriteriaFlag(oStringUtil.setDefaultValue("", ""));
		oUpdateAccountStatusRequestType.setIdentifierFlag(oStringUtil.setDefaultValue("", ""));
		
		return oUpdateAccountStatusRequest;
	}
	
	/**
	 * Prepare final response by mapping the retrieved response from the external api
	 * 
	 * @param ex Exchange body
	 * @return AccountStatusAmendment class
	 * @throws Exception
	 */
	public AccountStatusAmendment prepareUpdateAccountStatusAmendmentFinalResponse() throws Exception {
		
		AccountStatusAmendment oAccountStatusAmendment = new AccountStatusAmendment();
		AccountStatusAmendmentResponse oAccountStatusAmendmentResponse = new AccountStatusAmendmentResponse();
		AccountStatusAmendmentSuccess success = new AccountStatusAmendmentSuccess();
		
		oAccountStatusAmendment.setoAccountStatusAmendmentResponse(oAccountStatusAmendmentResponse);
		oAccountStatusAmendmentResponse.setSuccess(success);
		
		return oAccountStatusAmendment;
	}
	
	

}
