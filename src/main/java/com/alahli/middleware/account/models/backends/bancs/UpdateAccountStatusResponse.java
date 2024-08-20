
package com.alahli.middleware.account.models.backends.bancs;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UpdateAccountStatusResponse"
})
public class UpdateAccountStatusResponse {

    @JsonProperty("UpdateAccountStatusResponse")
    private UpdateAccountStatusResponseType updateAccountStatusResponse;

    @JsonProperty("UpdateAccountStatusResponse")
    public UpdateAccountStatusResponseType getUpdateAccountStatusResponse() {
        return updateAccountStatusResponse;
    }

    @JsonProperty("UpdateAccountStatusResponse")
    public void setUpdateAccountStatusResponse(UpdateAccountStatusResponseType updateAccountStatusResponse) {
        this.updateAccountStatusResponse = updateAccountStatusResponse;
    }

	@Override
	public String toString() {
		return "UpdateAccountStatusResponse [updateAccountStatusResponse=" + updateAccountStatusResponse + "]";
	}

}
