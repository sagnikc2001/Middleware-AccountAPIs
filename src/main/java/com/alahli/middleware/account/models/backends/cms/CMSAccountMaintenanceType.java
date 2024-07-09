
package com.alahli.middleware.account.models.backends.cms;

import java.util.Objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"accountNumber", "ibanAccountNumber", "remitterId", "blockedTransactions", "debitFlag", "creditFlag", "minimumAccountBalanceLimit", "maximumAccountBalanceLimit", "subscriptionFlag", "accountResetFlag"})
@XmlRootElement(name = "account")
public class CMSAccountMaintenanceType {

	@XmlElement(name = "accountNumber")
    protected String accountNumber;
	
	@XmlElement(name = "ibanAccountNumber")
    protected String ibanAccountNumber;
	
	@XmlElement(name = "remitterId")
    protected String remitterId;
	
	@XmlElement(name = "blockedTransactions")
    protected String blockedTransactions;
	
	@XmlElement(name = "debitFlag")
    protected String debitFlag;
	
	@XmlElement(name = "creditFlag")
    protected String creditFlag;
	
	@XmlElement(name = "minimumAccountBalanceLimit")
    protected Integer minimumAccountBalanceLimit;
	
	@XmlElement(name = "maximumAccountBalanceLimit")
    protected Integer maximumAccountBalanceLimit;
	
	@XmlElement(name = "subscriptionFlag")
    protected String subscriptionFlag;
	
	@XmlElement(name = "accountResetFlag")
    protected String accountResetFlag;
	
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getIbanAccountNumber() {
		return ibanAccountNumber;
	}
	public void setIbanAccountNumber(String ibanAccountNumber) {
		this.ibanAccountNumber = ibanAccountNumber;
	}
	public String getRemitterId() {
		return remitterId;
	}
	public void setRemitterId(String remitterId) {
		this.remitterId = remitterId;
	}
	public String getBlockedTransactions() {
		return blockedTransactions;
	}
	public void setBlockedTransactions(String blockedTransactions) {
		this.blockedTransactions = blockedTransactions;
	}
	public String getDebitFlag() {
		return debitFlag;
	}
	public void setDebitFlag(String debitFlag) {
		this.debitFlag = debitFlag;
	}
	public String getCreditFlag() {
		return creditFlag;
	}
	public void setCreditFlag(String creditFlag) {
		this.creditFlag = creditFlag;
	}
	public Integer getMinimumAccountBalanceLimit() {
		return minimumAccountBalanceLimit;
	}
	public void setMinimumAccountBalanceLimit(Integer minimumAccountBalanceLimit) {
		this.minimumAccountBalanceLimit = minimumAccountBalanceLimit;
	}
	public Integer getMaximumAccountBalanceLimit() {
		return maximumAccountBalanceLimit;
	}
	public void setMaximumAccountBalanceLimit(Integer maximumAccountBalanceLimit) {
		this.maximumAccountBalanceLimit = maximumAccountBalanceLimit;
	}
	public String getSubscriptionFlag() {
		return subscriptionFlag;
	}
	public void setSubscriptionFlag(String subscriptionFlag) {
		this.subscriptionFlag = subscriptionFlag;
	}
	public String getAccountResetFlag() {
		return accountResetFlag;
	}
	public void setAccountResetFlag(String accountResetFlag) {
		this.accountResetFlag = accountResetFlag;
	}
	@Override
	public String toString() {
		return "CMSAccountMaintenanceType [accountNumber=" + accountNumber + ", ibanAccountNumber=" + ibanAccountNumber
				+ ", remitterId=" + remitterId + ", blockedTransactions=" + blockedTransactions + ", debitFlag="
				+ debitFlag + ", creditFlag=" + creditFlag + ", minimumAccountBalanceLimit="
				+ minimumAccountBalanceLimit + ", maximumAccountBalanceLimit=" + maximumAccountBalanceLimit
				+ ", subscriptionFlag=" + subscriptionFlag + ", accountResetFlag=" + accountResetFlag + "]";
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
		CMSAccountMaintenanceType other = (CMSAccountMaintenanceType) obj;
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
