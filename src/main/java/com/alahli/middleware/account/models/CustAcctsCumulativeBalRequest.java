
package com.alahli.middleware.account.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "cifNumber",
    "type"
})
public class CustAcctsCumulativeBalRequest {

    @JsonProperty("cifNumber")
    private String cifNumber;
    @JsonProperty("type")
    private CustAcctsCumulativeBalType type;

    @JsonProperty("cifNumber")
    public String getCifNumber() {
        return cifNumber;
    }

    @JsonProperty("cifNumber")
    public void setCifNumber(String cifNumber) {
        this.cifNumber = cifNumber;
    }

    @JsonProperty("type")
    public CustAcctsCumulativeBalType getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(CustAcctsCumulativeBalType type) {
        this.type = type;
    }

	@Override
	public String toString() {
		return "CustAcctsCumulativeBalRequest [cifNumber=" + cifNumber + ", type=" + type + "]";
	}

}
