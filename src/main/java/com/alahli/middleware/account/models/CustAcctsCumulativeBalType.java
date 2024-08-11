
package com.alahli.middleware.account.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "isDep"
})
public class CustAcctsCumulativeBalType {

    @JsonProperty("isDep")
    private String isDep;

    @JsonProperty("isDep")
    public String getIsDep() {
        return isDep;
    }

    @JsonProperty("isDep")
    public void setIsDep(String isDep) {
        this.isDep = isDep;
    }

	@Override
	public String toString() {
		return "Type [isDep=" + isDep + "]";
	}

}
