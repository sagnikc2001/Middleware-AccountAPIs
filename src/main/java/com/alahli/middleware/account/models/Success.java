
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
    "account"
})
public class Success {

    @JsonProperty("statusCode")
    private String statusCode;
    @JsonProperty("statusDescription")
    private String statusDescription;
    @JsonProperty("notes")
    private String notes;
    @JsonProperty("account")
    private List<Account> account = new ArrayList<Account>();
	public String getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
	public String getStatusDescription() {
		return statusDescription;
	}
	public void setStatusDescription(String statusDescription) {
		this.statusDescription = statusDescription;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public List<Account> getAccount() {
		return account;
	}
	public void setAccount(List<Account> account) {
		this.account = account;
	}
	
	@Override
	public String toString() {
		return "Success [statusCode=" + statusCode + ", statusDescription=" + statusDescription + ", notes=" + notes
				+ ", account=" + account + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(account, notes, statusCode, statusDescription);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Success other = (Success) obj;
		return Objects.equals(account, other.account) && Objects.equals(notes, other.notes)
				&& Objects.equals(statusCode, other.statusCode)
				&& Objects.equals(statusDescription, other.statusDescription);
	}
	
}
