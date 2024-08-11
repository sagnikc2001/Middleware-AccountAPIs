
package com.alahli.middleware.account.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "success"
})
public class CustAcctsCumulativeBalResponse {

    @JsonProperty("success")
    private GetCustAcctsCumulativeBalSuccess success;

    @JsonProperty("success")
    public GetCustAcctsCumulativeBalSuccess getSuccess() {
        return success;
    }

    @JsonProperty("success")
    public void setSuccess(GetCustAcctsCumulativeBalSuccess success) {
        this.success = success;
    }

	@Override
	public String toString() {
		return "CustAcctsCumulativeBalResponse [success=" + success + "]";
	}

}
