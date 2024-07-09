
package com.alahli.middleware.account.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "accountNumber",
    "ibanAccountNumber",
    "remitterId",
    "blockedTransactions",
    "minimumAccountBalanceLimit",
    "maximumAccountBalanceLimit",
    "subscriptionFlag",
    "debitFlag",
    "creditFlag",
    "accountResetFlag"
})
public class Account {

    @JsonProperty("accountNumber")
    private String accountNumber;
    @JsonProperty("ibanAccountNumber")
    private String ibanAccountNumber;
    @JsonProperty("remitterId")
    private String remitterId;
    @JsonProperty("blockedTransactions")
    private String blockedTransactions;
    @JsonProperty("minimumAccountBalanceLimit")
    private Integer minimumAccountBalanceLimit;
    @JsonProperty("maximumAccountBalanceLimit")
    private Integer maximumAccountBalanceLimit;
    @JsonProperty("subscriptionFlag")
    private String subscriptionFlag;
    @JsonProperty("debitFlag")
    private String debitFlag;
    @JsonProperty("creditFlag")
    private String creditFlag;
    @JsonProperty("accountResetFlag")
    private String accountResetFlag;

    @JsonProperty("accountNumber")
    public String getAccountNumber() {
        return accountNumber;
    }

    @JsonProperty("accountNumber")
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @JsonProperty("ibanAccountNumber")
    public String getIbanAccountNumber() {
        return ibanAccountNumber;
    }

    @JsonProperty("ibanAccountNumber")
    public void setIbanAccountNumber(String ibanAccountNumber) {
        this.ibanAccountNumber = ibanAccountNumber;
    }

    @JsonProperty("remitterId")
    public String getRemitterId() {
        return remitterId;
    }

    @JsonProperty("remitterId")
    public void setRemitterId(String remitterId) {
        this.remitterId = remitterId;
    }

    @JsonProperty("blockedTransactions")
    public String getBlockedTransactions() {
        return blockedTransactions;
    }

    @JsonProperty("blockedTransactions")
    public void setBlockedTransactions(String blockedTransactions) {
        this.blockedTransactions = blockedTransactions;
    }

    @JsonProperty("minimumAccountBalanceLimit")
    public Integer getMinimumAccountBalanceLimit() {
        return minimumAccountBalanceLimit;
    }

    @JsonProperty("minimumAccountBalanceLimit")
    public void setMinimumAccountBalanceLimit(Integer minimumAccountBalanceLimit) {
        this.minimumAccountBalanceLimit = minimumAccountBalanceLimit;
    }

    @JsonProperty("maximumAccountBalanceLimit")
    public Integer getMaximumAccountBalanceLimit() {
        return maximumAccountBalanceLimit;
    }

    @JsonProperty("maximumAccountBalanceLimit")
    public void setMaximumAccountBalanceLimit(Integer maximumAccountBalanceLimit) {
        this.maximumAccountBalanceLimit = maximumAccountBalanceLimit;
    }

    @JsonProperty("subscriptionFlag")
    public String getSubscriptionFlag() {
        return subscriptionFlag;
    }

    @JsonProperty("subscriptionFlag")
    public void setSubscriptionFlag(String subscriptionFlag) {
        this.subscriptionFlag = subscriptionFlag;
    }

    @JsonProperty("debitFlag")
    public String getDebitFlag() {
        return debitFlag;
    }

    @JsonProperty("debitFlag")
    public void setDebitFlag(String debitFlag) {
        this.debitFlag = debitFlag;
    }

    @JsonProperty("creditFlag")
    public String getCreditFlag() {
        return creditFlag;
    }

    @JsonProperty("creditFlag")
    public void setCreditFlag(String creditFlag) {
        this.creditFlag = creditFlag;
    }

    @JsonProperty("accountResetFlag")
    public String getAccountResetFlag() {
        return accountResetFlag;
    }

    @JsonProperty("accountResetFlag")
    public void setAccountResetFlag(String accountResetFlag) {
        this.accountResetFlag = accountResetFlag;
    }

	public Account() {
		super();
	}

	public Account(String accountNumber, String ibanAccountNumber, String remitterId, String blockedTransactions,
			Integer minimumAccountBalanceLimit, Integer maximumAccountBalanceLimit, String subscriptionFlag,
			String debitFlag, String creditFlag, String accountResetFlag) {
		super();
		this.accountNumber = accountNumber;
		this.ibanAccountNumber = ibanAccountNumber;
		this.remitterId = remitterId;
		this.blockedTransactions = blockedTransactions;
		this.minimumAccountBalanceLimit = minimumAccountBalanceLimit;
		this.maximumAccountBalanceLimit = maximumAccountBalanceLimit;
		this.subscriptionFlag = subscriptionFlag;
		this.debitFlag = debitFlag;
		this.creditFlag = creditFlag;
		this.accountResetFlag = accountResetFlag;
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", ibanAccountNumber=" + ibanAccountNumber + ", remitterId="
				+ remitterId + ", blockedTransactions=" + blockedTransactions + ", minimumAccountBalanceLimit="
				+ minimumAccountBalanceLimit + ", maximumAccountBalanceLimit=" + maximumAccountBalanceLimit
				+ ", subscriptionFlag=" + subscriptionFlag + ", debitFlag=" + debitFlag + ", creditFlag=" + creditFlag
				+ ", accountResetFlag=" + accountResetFlag + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(accountNumber, accountResetFlag, blockedTransactions, creditFlag, debitFlag,
				ibanAccountNumber, maximumAccountBalanceLimit, minimumAccountBalanceLimit, remitterId,
				subscriptionFlag);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		return Objects.equals(accountNumber, other.accountNumber)
				&& Objects.equals(accountResetFlag, other.accountResetFlag)
				&& Objects.equals(blockedTransactions, other.blockedTransactions)
				&& Objects.equals(creditFlag, other.creditFlag) && Objects.equals(debitFlag, other.debitFlag)
				&& Objects.equals(ibanAccountNumber, other.ibanAccountNumber)
				&& Objects.equals(maximumAccountBalanceLimit, other.maximumAccountBalanceLimit)
				&& Objects.equals(minimumAccountBalanceLimit, other.minimumAccountBalanceLimit)
				&& Objects.equals(remitterId, other.remitterId)
				&& Objects.equals(subscriptionFlag, other.subscriptionFlag);
	}
	
}
