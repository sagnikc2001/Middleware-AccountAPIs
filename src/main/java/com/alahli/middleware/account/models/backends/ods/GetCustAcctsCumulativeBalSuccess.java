
package com.alahli.middleware.account.models.backends.ods;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "cumulativeBalance"
})
public class GetCustAcctsCumulativeBalSuccess {

    @JsonProperty("cumulativeBalance")
    private Double cumulativeBalance;

    @JsonProperty("cumulativeBalance")
    public Double getCumulativeBalance() {
        return cumulativeBalance;
    }

    @JsonProperty("cumulativeBalance")
    public void setCumulativeBalance(Double cumulativeBalance) {
        this.cumulativeBalance = cumulativeBalance;
    }

    
}
