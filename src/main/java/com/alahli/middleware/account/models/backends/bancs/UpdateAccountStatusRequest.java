
package com.alahli.middleware.account.models.backends.bancs;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UpdateAccountStatusRequest"
})
public class UpdateAccountStatusRequest {

    @JsonProperty("UpdateAccountStatusRequest")
    private UpdateAccountStatusRequestType updateAccountStatusRequest;

    @JsonProperty("UpdateAccountStatusRequest")
    public UpdateAccountStatusRequestType getUpdateAccountStatusRequest() {
        return updateAccountStatusRequest;
    }

    @JsonProperty("UpdateAccountStatusRequest")
    public void setUpdateAccountStatusRequest(UpdateAccountStatusRequestType updateAccountStatusRequest) {
        this.updateAccountStatusRequest = updateAccountStatusRequest;
    }

	@Override
	public String toString() {
		return "UpdateAccountStatusRequest [updateAccountStatusRequest=" + updateAccountStatusRequest + "]";
	}
    
}
