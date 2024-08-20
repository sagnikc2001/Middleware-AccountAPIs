
package com.alahli.middleware.account.models.backends.bancs;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "updateStatus",
    "accntNumber1"
})
public class UpdateAccountStatusStatus {

    @JsonProperty("updateStatus")
    private Boolean updateStatus;
    
    @JsonProperty("accntNumber1")
    private String accntNumber1;

    @JsonProperty("updateStatus")
    public Boolean getUpdateStatus() {
        return updateStatus;
    }

    @JsonProperty("updateStatus")
    public void setUpdateStatus(Boolean updateStatus) {
        this.updateStatus = updateStatus;
    }

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
		return "UpdateAccountStatusStatus [updateStatus=" + updateStatus + ", accntNumber1=" + accntNumber1 + "]";
	}
    
}
