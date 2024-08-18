
package com.alahli.middleware.account.models.backends.bancs;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "InquireAccountStatusResponse"
})
public class InquireAccountStatusResponse {

    @JsonProperty("InquireAccountStatusResponse")
    private InquireAccountStatusResponseType inquireAccountStatusResponse;

    @JsonProperty("InquireAccountStatusResponse")
    public InquireAccountStatusResponseType getInquireAccountStatusResponse() {
        return inquireAccountStatusResponse;
    }

    @JsonProperty("InquireAccountStatusResponse")
    public void setInquireAccountStatusResponse(InquireAccountStatusResponseType inquireAccountStatusResponse) {
        this.inquireAccountStatusResponse = inquireAccountStatusResponse;
    }

	@Override
	public String toString() {
		return "InquireAccountStatusResponse [inquireAccountStatusResponse=" + inquireAccountStatusResponse + "]";
	}
    
}
