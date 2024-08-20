
package com.alahli.middleware.account.models.backends.bancs;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "status"
})
public class UpdateAccountStatusResponseType {

    @JsonProperty("status")
    private UpdateAccountStatusStatus status;

    @JsonProperty("status")
    public UpdateAccountStatusStatus getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(UpdateAccountStatusStatus status) {
        this.status = status;
    }

	@Override
	public String toString() {
		return "UpdateAccountStatusResponseType [status=" + status + "]";
	}

}
