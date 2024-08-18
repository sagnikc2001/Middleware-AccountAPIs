
package com.alahli.middleware.account.models.backends.bancs;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "InquireAccountStatusRequest"
})
public class InquireAccountStatusRequest {

    @JsonProperty("InquireAccountStatusRequest")
    private InquireAccountStatusRequestType inquireAccountStatusRequest;

    @JsonProperty("InquireAccountStatusRequest")
    public InquireAccountStatusRequestType getInquireAccountStatusRequest() {
        return inquireAccountStatusRequest;
    }

    @JsonProperty("InquireAccountStatusRequest")
    public void setInquireAccountStatusRequest(InquireAccountStatusRequestType inquireAccountStatusRequest) {
        this.inquireAccountStatusRequest = inquireAccountStatusRequest;
    }

	@Override
	public String toString() {
		return "InquireAccountStatusRequest [inquireAccountStatusRequest=" + inquireAccountStatusRequest + "]";
	}

}
