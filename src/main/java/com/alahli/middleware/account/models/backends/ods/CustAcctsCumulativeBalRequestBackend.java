package com.alahli.middleware.account.models.backends.ods;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "CustAcctsCumulativeBalRequest"
})
public class CustAcctsCumulativeBalRequestBackend {
	
	@JsonProperty("CustAcctsCumulativeBalRequest")
	private CustAcctsCumulativeBalRequest custAcctsCumulativeBalRequest;

	public CustAcctsCumulativeBalRequest getCustAcctsCumulativeBalRequest() {
		return custAcctsCumulativeBalRequest;
	}

	public void setCustAcctsCumulativeBalRequest(CustAcctsCumulativeBalRequest custAcctsCumulativeBalRequest) {
		this.custAcctsCumulativeBalRequest = custAcctsCumulativeBalRequest;
	}

	@Override
	public String toString() {
		return "CustAcctsCumulativeBalRequestBackend [custAcctsCumulativeBalRequest=" + custAcctsCumulativeBalRequest
				+ "]";
	}

}
