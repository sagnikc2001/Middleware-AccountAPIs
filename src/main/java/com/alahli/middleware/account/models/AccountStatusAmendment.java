package com.alahli.middleware.account.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "CMSAccountsRequest",
    "CMSAccountMaintenanceResponse"
})
public class AccountStatusAmendment {
	
	@JsonProperty("AccountStatusAmendmentRequest")
	private AccountStatusAmendmentRequest oAccountStatusAmendmentRequest;
	
	@JsonProperty("AccountStatusAmendmentResponse")
	private AccountStatusAmendmentResponse oAccountStatusAmendmentResponse;

	public AccountStatusAmendmentRequest getoAccountStatusAmendmentRequest() {
		return oAccountStatusAmendmentRequest;
	}

	public void setoAccountStatusAmendmentRequest(AccountStatusAmendmentRequest oAccountStatusAmendmentRequest) {
		this.oAccountStatusAmendmentRequest = oAccountStatusAmendmentRequest;
	}

	public AccountStatusAmendmentResponse getoAccountStatusAmendmentResponse() {
		return oAccountStatusAmendmentResponse;
	}

	public void setoAccountStatusAmendmentResponse(AccountStatusAmendmentResponse oAccountStatusAmendmentResponse) {
		this.oAccountStatusAmendmentResponse = oAccountStatusAmendmentResponse;
	}

	@Override
	public String toString() {
		return "AccountStatusAmendment [oAccountStatusAmendmentRequest=" + oAccountStatusAmendmentRequest
				+ ", oAccountStatusAmendmentResponse=" + oAccountStatusAmendmentResponse + "]";
	}
	
}
