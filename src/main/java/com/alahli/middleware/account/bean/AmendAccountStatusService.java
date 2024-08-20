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
import com.alahli.middleware.account.models.backends.bancs.InquireAccountStatusResponse;
import com.alahli.middleware.account.models.backends.bancs.InquireAccountStatusResponseType;
import com.alahli.middleware.account.models.backends.bancs.InquireAccountStatusSuccess;
import com.alahli.middleware.account.models.backends.bancs.UpdateAccountStatusRequest;
import com.alahli.middleware.account.models.backends.bancs.UpdateAccountStatusRequestType;
import com.alahli.middleware.account.models.backends.bancs.UpdateAccountStatusResponse;
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
	 * @param InquireAccountStatusResponse class
	 * @return AccountStatusAmendment class
	 * @throws Exception
	 */
	public AccountStatusAmendment prepareInquireAccountStatusAmendmentFinalResponse(InquireAccountStatusResponse oInquireAccountStatusResponse) throws Exception {
		
		InquireAccountStatusResponseType oInquireAccountStatusResponseType = oInquireAccountStatusResponse.getInquireAccountStatusResponse();
		InquireAccountStatusSuccess oInquireAccountStatusSuccess = oInquireAccountStatusResponseType.getSuccess();

		AccountStatusAmendment oAccountStatusAmendment = new AccountStatusAmendment();
		AccountStatusAmendmentResponse oAccountStatusAmendmentResponse = new AccountStatusAmendmentResponse();
		AccountStatusAmendmentSuccess success = new AccountStatusAmendmentSuccess();

		oAccountStatusAmendment.setoAccountStatusAmendmentResponse(oAccountStatusAmendmentResponse);
		oAccountStatusAmendmentResponse.setSuccess(success);

		success.setAccountNumber(oInquireAccountStatusSuccess.getAccntNumber());
		success.setCurrentStatus(oInquireAccountStatusSuccess.getCurrentStatus());
		success.setNewStatus(oInquireAccountStatusSuccess.getNewStatus());
		success.setCurrentKYCStatus(oInquireAccountStatusSuccess.getCurrKycStatus());
		success.setNewKYCStatus(oInquireAccountStatusSuccess.getNewKycStatus());
		success.setCurrentSamaStatus(oInquireAccountStatusSuccess.getCurrSamaStatus());
		success.setNewSamaStatus(oInquireAccountStatusSuccess.getNewSamaStatus());
		success.setReasonAccountStatus(oInquireAccountStatusSuccess.getReasonAcctStatus());
		success.setReasonSamaStatus(oInquireAccountStatusSuccess.getReasonSamaStatus());
		success.setReasonKYCStatus(oInquireAccountStatusSuccess.getReasonKycStatus());
		success.setKycUnfreezeDate(oInquireAccountStatusSuccess.getKycUnfreezeDate());
		success.setLetterNumber(oInquireAccountStatusSuccess.getLetterNo());
		success.setLetterDate(oInquireAccountStatusSuccess.getLetterDate());
		success.setBlockDate(oInquireAccountStatusSuccess.getBlockDate());
		success.setNote(oInquireAccountStatusSuccess.getNote());
		success.setInacStat(oInquireAccountStatusSuccess.getInacStat());
		success.setEnfBlockStatus(oInquireAccountStatusSuccess.getEnfBlockStatus());
		success.setSsuBlockStatus(oInquireAccountStatusSuccess.getSsuBlockStatus());
		success.setLegalBlockStatus(oInquireAccountStatusSuccess.getLegalBlockStatus());
		success.setEffENFBlockDate(oInquireAccountStatusSuccess.getEffEnfBlockDate());
		success.setEffENFBlockDateFlag(oInquireAccountStatusSuccess.getEffEnfBlockDateFlag());
		success.setEffSSUBlockDate(oInquireAccountStatusSuccess.getEffSsuBlockDate());
		success.setEffSSUBlockDateFlag(oInquireAccountStatusSuccess.getEffSsuBlockDateFlag());
		success.setEffLegalBlockDate(oInquireAccountStatusSuccess.getEffLegalBlockDate());
		success.setEffLegalBlockDateFlag(oInquireAccountStatusSuccess.getEffLegalBlockDateFlag());
		success.setEnfBlockReasonStat(oInquireAccountStatusSuccess.getEnfBlockReasonStat());
		success.setSsuBlockReasonStat(oInquireAccountStatusSuccess.getSsuBlockReasonStat());
		success.setLegalBlockReasonStat(oInquireAccountStatusSuccess.getLegalBlockReasonStat());
		success.setEnfStopPeriod(oInquireAccountStatusSuccess.getEnfStopPeriod());
		success.setSsuStopPeriod(oInquireAccountStatusSuccess.getSsuStopPeriod());
		success.setEnfBlockDate(oInquireAccountStatusSuccess.getEnfBlockDate());
		success.setSsuBlockLetterNumber(oInquireAccountStatusSuccess.getSsuBlockLetterNo());
		success.setLegalBlockLetterNumber(oInquireAccountStatusSuccess.getLegalBlockLetterNo());
		success.setSsuBlockLetterDate(oInquireAccountStatusSuccess.getSsuBlockLttrDate());
		success.setLegalBlockLetterDate(oInquireAccountStatusSuccess.getLegalBlockLttrDate());
		success.setSsuBlockNote(oInquireAccountStatusSuccess.getSsuBlockNote());
		success.setLegalBlockNote(oInquireAccountStatusSuccess.getLegalBlockNote());
		success.setLastAccountStatDate(oInquireAccountStatusSuccess.getLstAcctStatDate());
		success.setHighRiskAccount(oInquireAccountStatusSuccess.getHighRiskAcct());
		success.setFatcaFreeze(oInquireAccountStatusSuccess.getFatcaFreze());
		success.setWorkFlowFlag(oInquireAccountStatusSuccess.getWorkFlowFlag());

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
	 * @param Exchange
	 * @return AccountStatusAmendment class
	 * @throws Exception
	 */
	public AccountStatusAmendment prepareUpdateAccountStatusAmendmentFinalResponse(Exchange ex) throws Exception {
		
		AccountStatusAmendment oAccountStatusAmendment = new AccountStatusAmendment();
		AccountStatusAmendmentResponse oAccountStatusAmendmentResponse = new AccountStatusAmendmentResponse();
		AccountStatusAmendmentSuccess success = new AccountStatusAmendmentSuccess();
		
		oAccountStatusAmendment.setoAccountStatusAmendmentResponse(oAccountStatusAmendmentResponse);
		oAccountStatusAmendmentResponse.setSuccess(success);
		
		return oAccountStatusAmendment;
	}
	
	

}
