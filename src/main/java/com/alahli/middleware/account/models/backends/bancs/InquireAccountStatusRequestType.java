
package com.alahli.middleware.account.models.backends.bancs;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "accntNumber1"
})
public class InquireAccountStatusRequestType {

    @JsonProperty("accntNumber1")
    private String accntNumber1;

    @JsonProperty("accntNumber1")
    public String getAccntNumber1() {
        return accntNumber1;
    }

    @JsonProperty("accntNumber1")
    public void setAccntNumber1(String accntNumber1) {
        this.accntNumber1 = accntNumber1;
    }

	@Override
	public String toString() {
		return "InquireAccountStatusRequestType [accntNumber1=" + accntNumber1 + "]";
	}

}
