package com.alahli.middleware.account.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "CMSAccountsRequest",
    "CMSAccountMaintenanceResponse"
})
public class GetCustAcctsCumulativeBal {
	
	@JsonProperty("CustAcctsCumulativeBalRequest")
	private CustAcctsCumulativeBalRequest oCustAcctsCumulativeBalRequest;
	
	@JsonProperty("CustAcctsCumulativeBalResponse")
	private CustAcctsCumulativeBalResponse oCustAcctsCumulativeBalResponse;

	public CustAcctsCumulativeBalRequest getoCustAcctsCumulativeBalRequest() {
		return oCustAcctsCumulativeBalRequest;
	}

	public void setoCustAcctsCumulativeBalRequest(CustAcctsCumulativeBalRequest oCustAcctsCumulativeBalRequest) {
		this.oCustAcctsCumulativeBalRequest = oCustAcctsCumulativeBalRequest;
	}

	public CustAcctsCumulativeBalResponse getoCustAcctsCumulativeBalResponse() {
		return oCustAcctsCumulativeBalResponse;
	}

	public void setoCustAcctsCumulativeBalResponse(CustAcctsCumulativeBalResponse oCustAcctsCumulativeBalResponse) {
		this.oCustAcctsCumulativeBalResponse = oCustAcctsCumulativeBalResponse;
	}

	@Override
	public String toString() {
		return "GetCustAcctsCumulativeBal [oCustAcctsCumulativeBalRequest=" + oCustAcctsCumulativeBalRequest
				+ ", oCustAcctsCumulativeBalResponse=" + oCustAcctsCumulativeBalResponse + "]";
	}
	
}
