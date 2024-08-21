package com.alahli.middleware.account.bean;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathFactory;

import org.apache.camel.Exchange;
import org.apache.camel.Header;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alahli.middleware.account.models.AccountStatusAmendment;
import com.alahli.middleware.account.models.AccountStatusAmendmentRequest;
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
import com.alahli.middleware.account.utils.AccountUtils;
import com.alahli.middleware.utility.Utils.StringUtil;
import com.alahli.middleware.utility.Utils.Utils;
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
	private AccountStatusAmendmentRequest accountStatusAmendmentRequest = new AccountStatusAmendmentRequest();

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
	public InquireAccountStatusRequest setInquireAccountStatusRequestBackendOut() throws Exception {

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
	public AccountStatusAmendment setInquireAccountStatusAmendmentResponseOut(InquireAccountStatusResponse oInquireAccountStatusResponse) throws Exception {
		
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
	public UpdateAccountStatusRequest setUpdateAccountStatusRequestBackendOut() throws Exception{
		
		UpdateAccountStatusRequest oUpdateAccountStatusRequest = new UpdateAccountStatusRequest();
		UpdateAccountStatusRequestType oUpdateAccountStatusRequestType = new UpdateAccountStatusRequestType();
		
		oUpdateAccountStatusRequest.setUpdateAccountStatusRequest(oUpdateAccountStatusRequestType);
		
		oUpdateAccountStatusRequestType.setAccntNumber1(oStringUtil.setDefaultValue(accountStatusAmendmentRequest.getAccountNumber(), ""));
		oUpdateAccountStatusRequestType.setCurrentStatus(accountStatusAmendmentRequest.getCurrentStatus());
		oUpdateAccountStatusRequestType.setNewStatus(accountStatusAmendmentRequest.getNewStatus());
		oUpdateAccountStatusRequestType.setCurrKycStatus(accountStatusAmendmentRequest.getCurrentKYCStatus());
		oUpdateAccountStatusRequestType.setNewKycStatus(accountStatusAmendmentRequest.getNewKYCStatus());
		oUpdateAccountStatusRequestType.setCurrSamaStatus(accountStatusAmendmentRequest.getCurrentSamaStatus());
		oUpdateAccountStatusRequestType.setNewSamaStatus(accountStatusAmendmentRequest.getNewSamaStatus());
		oUpdateAccountStatusRequestType.setReasonAcctStatus(accountStatusAmendmentRequest.getReasonAccountStatus());
		oUpdateAccountStatusRequestType.setReasonSamaStatus(accountStatusAmendmentRequest.getReasonSamaStatus());
		oUpdateAccountStatusRequestType.setReasonKycStatus(accountStatusAmendmentRequest.getReasonKYCStatus());
		oUpdateAccountStatusRequestType.setKycUnfreezeDate(accountStatusAmendmentRequest.getKycUnfreezeDate());
		oUpdateAccountStatusRequestType.setLetterNo(accountStatusAmendmentRequest.getLetterNumber());
		oUpdateAccountStatusRequestType.setLetterDate(accountStatusAmendmentRequest.getLetterDate());
		oUpdateAccountStatusRequestType.setBlockDate(accountStatusAmendmentRequest.getBlockDate());
		oUpdateAccountStatusRequestType.setNote(accountStatusAmendmentRequest.getNote());
		oUpdateAccountStatusRequestType.setInacStat(accountStatusAmendmentRequest.getInacStat());
		oUpdateAccountStatusRequestType.setEnfBlockStatus(accountStatusAmendmentRequest.getEnfBlockStatus());
		oUpdateAccountStatusRequestType.setSsuBlockStatus(accountStatusAmendmentRequest.getSsuBlockStatus());
		oUpdateAccountStatusRequestType.setLegalBlockStatus(accountStatusAmendmentRequest.getLegalBlockStatus());
		oUpdateAccountStatusRequestType.setEffEnfBlockDate(accountStatusAmendmentRequest.getEffENFBlockDate());
		oUpdateAccountStatusRequestType.setEffEnfBlockDateFlag(accountStatusAmendmentRequest.getEffENFBlockDateFlag());
		oUpdateAccountStatusRequestType.setEffSsuBlockDate(accountStatusAmendmentRequest.getEffSSUBlockDate());
		oUpdateAccountStatusRequestType.setEffSsuBlockDateFlag(accountStatusAmendmentRequest.getEffSSUBlockDateFlag());
		oUpdateAccountStatusRequestType.setEffLegalBlockDate(accountStatusAmendmentRequest.getEffLegalBlockDate());
		oUpdateAccountStatusRequestType.setEffLegalBlockDateFlag(accountStatusAmendmentRequest.getEffLegalBlockDateFlag());
		oUpdateAccountStatusRequestType.setEnfBlockReasonStat(accountStatusAmendmentRequest.getEnfBlockReasonStat());
		oUpdateAccountStatusRequestType.setSsuBlockReasonStat(accountStatusAmendmentRequest.getSsuBlockReasonStat());
		oUpdateAccountStatusRequestType.setLegalBlockReasonStat(accountStatusAmendmentRequest.getLegalBlockReasonStat());
		oUpdateAccountStatusRequestType.setEnfStopPeriod(accountStatusAmendmentRequest.getEnfStopPeriod());
		oUpdateAccountStatusRequestType.setSsuStopPeriod(accountStatusAmendmentRequest.getSsuStopPeriod());
		oUpdateAccountStatusRequestType.setEnfBlockDate(accountStatusAmendmentRequest.getEnfBlockDate());
		oUpdateAccountStatusRequestType.setSsuBlockLetterNo(accountStatusAmendmentRequest.getSsuBlockLetterNumber());
		oUpdateAccountStatusRequestType.setLegalBlockLetterNo(accountStatusAmendmentRequest.getLegalBlockLetterNumber());
		oUpdateAccountStatusRequestType.setSsuBlockLttrDate(accountStatusAmendmentRequest.getSsuBlockLetterDate());
		oUpdateAccountStatusRequestType.setLegalBlockLttrDate(accountStatusAmendmentRequest.getLegalBlockLetterDate());
		oUpdateAccountStatusRequestType.setSsuBlockNote(accountStatusAmendmentRequest.getSsuBlockNote());
		oUpdateAccountStatusRequestType.setLegalBlockNote(accountStatusAmendmentRequest.getLegalBlockNote());
		oUpdateAccountStatusRequestType.setLstAcctStatDate(accountStatusAmendmentRequest.getLastAccountStatDate());
		oUpdateAccountStatusRequestType.setFatcaFreze(accountStatusAmendmentRequest.getFatcaFreeze());
		oUpdateAccountStatusRequestType.setWorkFlowFlag(accountStatusAmendmentRequest.getWorkFlowFlag());
		oUpdateAccountStatusRequestType.setReasonPendActiveStat("");
		oUpdateAccountStatusRequestType.setKyccriteriaFlag("");
		oUpdateAccountStatusRequestType.setIdentifierFlag("");

		
		return oUpdateAccountStatusRequest;
	}
	
	/**
	 * Prepare final response by mapping the retrieved response from the external api
	 * 
	 * @param Exchange
	 * @return AccountStatusAmendment class
	 * @throws Exception
	 */
	public AccountStatusAmendment setUpdateAccountStatusAmendmentResponseOut(Exchange ex) throws Exception {
		
		AccountStatusAmendment oAccountStatusAmendment = new AccountStatusAmendment();
		AccountStatusAmendmentResponse oAccountStatusAmendmentResponse = new AccountStatusAmendmentResponse();
		AccountStatusAmendmentSuccess success = new AccountStatusAmendmentSuccess();
		
		oAccountStatusAmendment.setoAccountStatusAmendmentResponse(oAccountStatusAmendmentResponse);
		oAccountStatusAmendmentResponse.setSuccess(success);
		
		return oAccountStatusAmendment;
	}
	
}
