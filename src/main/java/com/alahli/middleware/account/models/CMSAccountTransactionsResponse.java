
package com.alahli.middleware.account.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "success"
})
public class CMSAccountTransactionsResponse {

    @JsonProperty("success")
    private CMSAccountTransactionsSuccess success;

    @JsonProperty("success")
    public CMSAccountTransactionsSuccess getSuccess() {
        return success;
    }

    @JsonProperty("success")
    public void setSuccess(CMSAccountTransactionsSuccess success) {
        this.success = success;
    }

	@Override
	public String toString() {
		return "CMSAccountTransactionsResponse [success=" + success + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(success);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CMSAccountTransactionsResponse other = (CMSAccountTransactionsResponse) obj;
		return Objects.equals(success, other.success);
	}

}
