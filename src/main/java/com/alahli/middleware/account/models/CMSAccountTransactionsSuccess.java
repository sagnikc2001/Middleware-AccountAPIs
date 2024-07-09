
package com.alahli.middleware.account.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "statusCode",
    "statusDescription",
    "notes",
    "transaction"
})
public class CMSAccountTransactionsSuccess {

    @JsonProperty("statusCode")
    private String statusCode;
    
    @JsonProperty("statusDescription")
    private String statusDescription;
    
    @JsonProperty("notes")
    private String notes;
    
    @JsonProperty("transaction")
    private List<Transaction> transaction = new ArrayList<Transaction>();

    @JsonProperty("statusCode")
    public String getStatusCode() {
        return statusCode;
    }

    @JsonProperty("statusCode")
    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    @JsonProperty("statusDescription")
    public String getStatusDescription() {
        return statusDescription;
    }

    @JsonProperty("statusDescription")
    public void setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
    }

    @JsonProperty("notes")
    public String getNotes() {
        return notes;
    }

    @JsonProperty("notes")
    public void setNotes(String notes) {
        this.notes = notes;
    }

    @JsonProperty("transaction")
    public List<Transaction> getTransaction() {
        return transaction;
    }

    @JsonProperty("transaction")
    public void setTransaction(List<Transaction> transaction) {
        this.transaction = transaction;
    }

	@Override
	public String toString() {
		return "CMSAccountTransactionsSuccess [statusCode=" + statusCode + ", statusDescription=" + statusDescription
				+ ", notes=" + notes + ", transaction=" + transaction + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(notes, statusCode, statusDescription, transaction);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CMSAccountTransactionsSuccess other = (CMSAccountTransactionsSuccess) obj;
		return Objects.equals(notes, other.notes) && Objects.equals(statusCode, other.statusCode)
				&& Objects.equals(statusDescription, other.statusDescription)
				&& Objects.equals(transaction, other.transaction);
	}

}
