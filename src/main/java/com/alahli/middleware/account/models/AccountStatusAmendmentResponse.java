
package com.alahli.middleware.account.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "success"
})
public class AccountStatusAmendmentResponse {

    @JsonProperty("success")
    private AccountStatusAmendmentSuccess success;

    @JsonProperty("success")
    public AccountStatusAmendmentSuccess getSuccess() {
        return success;
    }

    @JsonProperty("success")
    public void setSuccess(AccountStatusAmendmentSuccess success) {
        this.success = success;
    }

	@Override
	public String toString() {
		return "AccountStatusAmendmentResponse [success=" + success + "]";
	}
    
}
