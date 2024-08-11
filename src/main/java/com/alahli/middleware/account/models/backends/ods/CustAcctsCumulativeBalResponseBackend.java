package com.alahli.middleware.account.models.backends.ods;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "CustAcctsCumulativeBalResponse"
})
public class CustAcctsCumulativeBalResponseBackend {
	
	@JsonProperty("CustAcctsCumulativeBalResponse")
	private CustAcctsCumulativeBalResponse custAcctsCumulativeBalResponse;

	public CustAcctsCumulativeBalResponse getCustAcctsCumulativeBalResponse() {
		return custAcctsCumulativeBalResponse;
	}

	public void setCustAcctsCumulativeBalResponse(CustAcctsCumulativeBalResponse custAcctsCumulativeBalResponse) {
		this.custAcctsCumulativeBalResponse = custAcctsCumulativeBalResponse;
	}

	@Override
	public String toString() {
		return "CustAcctsCumulativeBalResponseBackend [custAcctsCumulativeBalResponse=" + custAcctsCumulativeBalResponse
				+ "]";
	}
	
}
