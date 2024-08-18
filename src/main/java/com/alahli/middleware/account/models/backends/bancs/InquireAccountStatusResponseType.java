
package com.alahli.middleware.account.models.backends.bancs;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Transaction"
})
public class InquireAccountStatusResponseType {

    @JsonProperty("Transaction")
    private InquireAccountStatusResponseTransaction transaction;

    @JsonProperty("Transaction")
    public InquireAccountStatusResponseTransaction getTransaction() {
        return transaction;
    }

    @JsonProperty("Transaction")
    public void setTransaction(InquireAccountStatusResponseTransaction transaction) {
        this.transaction = transaction;
    }

	@Override
	public String toString() {
		return "InquireAccountStatusResponseType [transaction=" + transaction + "]";
	}
    
}
