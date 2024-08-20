
package com.alahli.middleware.account.models.backends.bancs;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "success"
})
public class InquireAccountStatusResponseType {

    @JsonProperty("success")
    private InquireAccountStatusSuccess success;

    @JsonProperty("success")
    public InquireAccountStatusSuccess getSuccess() {
        return success;
    }

    @JsonProperty("success")
    public void setSuccess(InquireAccountStatusSuccess success) {
        this.success = success;
    }

	@Override
	public String toString() {
		return "InquireAccountStatusResponseType [success=" + success + "]";
	}
    
}
