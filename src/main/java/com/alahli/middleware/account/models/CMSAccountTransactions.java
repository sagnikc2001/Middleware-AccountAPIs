package com.alahli.middleware.account.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "CMSAccountsRequest",
    "CMSAccountTransactionsResponse"
})
public class CMSAccountTransactions {
	
	@JsonProperty("CMSAccountsRequest")
	private CMSAccountTransactionsRequest oCMSAccountTransactionsRequest;
	
	@JsonProperty("CMSAccountTransactionsResponse")
	private CMSAccountTransactionsResponse oCMSAccountTransactionsResponse;

	public CMSAccountTransactionsRequest getoCMSAccountTransactionsRequest() {
		return oCMSAccountTransactionsRequest;
	}

	public void setoCMSAccountTransactionsRequest(CMSAccountTransactionsRequest oCMSAccountTransactionsRequest) {
		this.oCMSAccountTransactionsRequest = oCMSAccountTransactionsRequest;
	}

	public CMSAccountTransactionsResponse getoCMSAccountTransactionsResponse() {
		return oCMSAccountTransactionsResponse;
	}

	public void setoCMSAccountTransactionsResponse(CMSAccountTransactionsResponse oCMSAccountTransactionsResponse) {
		this.oCMSAccountTransactionsResponse = oCMSAccountTransactionsResponse;
	}

	@Override
	public String toString() {
		
		if(oCMSAccountTransactionsRequest == null) {
			
			return "{\"CMSAccountsRequest\": null}";
		}
		
		return "{" + "\"CMSAccountsRequest\": {" + "\"omniMappedCode\": \"" + this.oCMSAccountTransactionsRequest.getOmniMappedCode()
		+ "\"," + "\"accountNumber\": \"" + this.oCMSAccountTransactionsRequest.getAccountNumber() + "\","
		+ "\"omniAccountNumber\": \"" + this.oCMSAccountTransactionsRequest.getOmniAccountNumber() + "\","
		+ "\"messageStartDate\": \"" + this.oCMSAccountTransactionsRequest.getMessageStartDate() + "\"," + "\"messageEndDate\": \""
		+ this.oCMSAccountTransactionsRequest.getMessageEndDate() + "\"," + "\"transactionStartDate\": \""
		+ this.oCMSAccountTransactionsRequest.getTransactionStartDate() + "\"," + "\"transactionEndDate\": \""
		+ this.oCMSAccountTransactionsRequest.getTransactionEndDate() + "\"," + "\"debitCreditFlag\": \""
		+ this.oCMSAccountTransactionsRequest.getDebitCreditFlag() + "\"," + "\"fromAmount\": \""
		+ this.oCMSAccountTransactionsRequest.getFromAmount() + "\"," + "\"toAmount\": \""
		+ this.oCMSAccountTransactionsRequest.getToAmount() + "\"," + "\"returnCode\": \""
		+ this.oCMSAccountTransactionsRequest.getReturnCode() + "\"," + "\"mainStatus\": \""
		+ this.oCMSAccountTransactionsRequest.getMainStatus() + "\"," + "\"createDate\": \""
		+ this.oCMSAccountTransactionsRequest.getCreateDate() + "\"," + "\"createStartDate\": \""
		+ this.oCMSAccountTransactionsRequest.getCreateStartDate() + "\"," + "\"createEndDate\": \""
		+ this.oCMSAccountTransactionsRequest.getCreateEndDate() + "\"," + "\"approveDate\": \""
		+ this.oCMSAccountTransactionsRequest.getApproveDate() + "\"," + "\"approveStartDate\": \""
		+ this.oCMSAccountTransactionsRequest.getApproveStartDate() + "\"," + "\"approveEndDate\": \""
		+ this.oCMSAccountTransactionsRequest.getApproveEndDate() + "\"," + "\"getBasicData\": \""
		+ this.oCMSAccountTransactionsRequest.getGetBasicData() + "\"," + "\"accountStartSeq\": \""
		+ this.oCMSAccountTransactionsRequest.getAccountStartSeq() + "\"," + "\"accountEndSeq\": \""
		+ this.oCMSAccountTransactionsRequest.getAccountEndSeq() + "\"," + "\"ibanAccountNumber\": \""
		+ this.oCMSAccountTransactionsRequest.getIbanAccountNumber() + "\"," + "\"reference1\": \""
		+ this.oCMSAccountTransactionsRequest.getReference1() + "\"," + "\"reference2\": \""
		+ this.oCMSAccountTransactionsRequest.getReference2() + "\"," + "\"reference3\": \""
		+ this.oCMSAccountTransactionsRequest.getReference3() + "\"," + "\"reference4\": \""
		+ this.oCMSAccountTransactionsRequest.getReference4() + "\"," + "\"reference5\": \""
		+ this.oCMSAccountTransactionsRequest.getReference5() + "\"," + "\"sourceReference\": \""
		+ this.oCMSAccountTransactionsRequest.getSourceReference() + "\"," + "\"uniqueReference\": \""
		+ this.oCMSAccountTransactionsRequest.getUniqueReference() + "\"" + "}" + "}";
	}
	
	
	
	
}
