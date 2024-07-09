
package com.alahli.middleware.account.models.backends.cms;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import java.util.Objects;

import javax.xml.bind.annotation.XmlAccessType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CMSAccountMaintenanceRequest", propOrder = {"requestMode","accountNumber","omniAccountNumber","englishNickName","arabicNickName","currency","omniMappedCode","externalLinkCode1","externalLinkCode2","referenceNumber1","referenceNumber2","notes1","notes2","remitterId","blockedTransactions","transactionNotificationFlag","debitFlag","creditFlag","minimumAccountBalanceLimit","maximumAccountBalanceLimit","subscriptionFlag","accountResetFlag","uniqueReference","skipCapLimit","serviceHeader","startedBy"})
@XmlRootElement(name = "CMSAccountMaintenanceRequest", namespace = "")
public class CMSAccountMaintenanceRequest {
	
	@XmlAttribute(name = "logcontexttoken")
    protected String logContextToken;
	
	@XmlElement(name = "requestMode", required = true)
    protected String requestMode;
	
	@XmlElement(name = "accountNumber", required = true)
    protected String accountNumber;
	
	@XmlElement(name = "omniAccountNumber", required = true)
    protected String omniAccountNumber;
	
	@XmlElement(name = "englishNickName")
    protected String englishNickName;
	
	@XmlElement(name = "arabicNickName")
    protected String arabicNickName;
	
	@XmlElement(name = "currency")
    protected String currency;
	
	@XmlElement(name = "omniMappedCode")
    protected String omniMappedCode;
	
	@XmlElement(name = "externalLinkCode1")
    protected String externalLinkCode1;
	
	@XmlElement(name = "externalLinkCode2")
    protected String externalLinkCode2;
	
	@XmlElement(name = "referenceNumber1")
    protected String referenceNumber1;
	
	@XmlElement(name = "referenceNumber2")
    protected String referenceNumber2;
	
	@XmlElement(name = "notes1")
    protected String notes1;
	
	@XmlElement(name = "notes2")
    protected String notes2;
	
	@XmlElement(name = "remitterId")
    protected String remitterId;
	
	@XmlElement(name = "blockedTransactions")
    protected String blockedTransactions;
	
	@XmlElement(name = "transactionNotificationFlag")
    protected String transactionNotificationFlag;
	
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
	
	@XmlElement(name = "uniqueReference")
    protected String uniqueReference;
	
	@XmlElement(name = "skipCapLimit")
    protected String skipCapLimit;
	
	@XmlElement(name = "ServiceHeader")
    protected ServiceHeader serviceHeader;
	
	@XmlElement(name = "startedBy")
    protected String startedBy;
	
	public String getLogContextToken() {
		return logContextToken;
	}
	public void setLogContextToken(String logContextToken) {
		this.logContextToken = logContextToken;
	}
	public String getRequestMode() {
		return requestMode;
	}
	public void setRequestMode(String requestMode) {
		this.requestMode = requestMode;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getOmniAccountNumber() {
		return omniAccountNumber;
	}
	public void setOmniAccountNumber(String omniAccountNumber) {
		this.omniAccountNumber = omniAccountNumber;
	}
	public String getEnglishNickName() {
		return englishNickName;
	}
	public void setEnglishNickName(String englishNickName) {
		this.englishNickName = englishNickName;
	}
	public String getArabicNickName() {
		return arabicNickName;
	}
	public void setArabicNickName(String arabicNickName) {
		this.arabicNickName = arabicNickName;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getOmniMappedCode() {
		return omniMappedCode;
	}
	public void setOmniMappedCode(String omniMappedCode) {
		this.omniMappedCode = omniMappedCode;
	}
	public String getExternalLinkCode1() {
		return externalLinkCode1;
	}
	public void setExternalLinkCode1(String externalLinkCode1) {
		this.externalLinkCode1 = externalLinkCode1;
	}
	public String getExternalLinkCode2() {
		return externalLinkCode2;
	}
	public void setExternalLinkCode2(String externalLinkCode2) {
		this.externalLinkCode2 = externalLinkCode2;
	}
	public String getReferenceNumber1() {
		return referenceNumber1;
	}
	public void setReferenceNumber1(String referenceNumber1) {
		this.referenceNumber1 = referenceNumber1;
	}
	public String getReferenceNumber2() {
		return referenceNumber2;
	}
	public void setReferenceNumber2(String referenceNumber2) {
		this.referenceNumber2 = referenceNumber2;
	}
	public String getNotes1() {
		return notes1;
	}
	public void setNotes1(String notes1) {
		this.notes1 = notes1;
	}
	public String getNotes2() {
		return notes2;
	}
	public void setNotes2(String notes2) {
		this.notes2 = notes2;
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
	public String getTransactionNotificationFlag() {
		return transactionNotificationFlag;
	}
	public void setTransactionNotificationFlag(String transactionNotificationFlag) {
		this.transactionNotificationFlag = transactionNotificationFlag;
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
	public String getUniqueReference() {
		return uniqueReference;
	}
	public void setUniqueReference(String uniqueReference) {
		this.uniqueReference = uniqueReference;
	}
	public String getSkipCapLimit() {
		return skipCapLimit;
	}
	public void setSkipCapLimit(String skipCapLimit) {
		this.skipCapLimit = skipCapLimit;
	}
	public ServiceHeader getServiceHeader() {
		return serviceHeader;
	}
	public void setServiceHeader(ServiceHeader serviceHeader) {
		this.serviceHeader = serviceHeader;
	}
	public String getStartedBy() {
		return startedBy;
	}
	public void setStartedBy(String startedBy) {
		this.startedBy = startedBy;
	}
	@Override
	public String toString() {
		return "CMSAccountMaintenanceRequest [logContextToken=" + logContextToken + ", requestMode=" + requestMode
				+ ", accountNumber=" + accountNumber + ", omniAccountNumber=" + omniAccountNumber + ", englishNickName="
				+ englishNickName + ", arabicNickName=" + arabicNickName + ", currency=" + currency
				+ ", omniMappedCode=" + omniMappedCode + ", externalLinkCode1=" + externalLinkCode1
				+ ", externalLinkCode2=" + externalLinkCode2 + ", referenceNumber1=" + referenceNumber1
				+ ", referenceNumber2=" + referenceNumber2 + ", notes1=" + notes1 + ", notes2=" + notes2
				+ ", remitterId=" + remitterId + ", blockedTransactions=" + blockedTransactions
				+ ", transactionNotificationFlag=" + transactionNotificationFlag + ", debitFlag=" + debitFlag
				+ ", creditFlag=" + creditFlag + ", minimumAccountBalanceLimit=" + minimumAccountBalanceLimit
				+ ", maximumAccountBalanceLimit=" + maximumAccountBalanceLimit + ", subscriptionFlag="
				+ subscriptionFlag + ", accountResetFlag=" + accountResetFlag + ", uniqueReference=" + uniqueReference
				+ ", skipCapLimit=" + skipCapLimit + ", serviceHeader=" + serviceHeader + ", startedBy=" + startedBy
				+ "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(accountNumber, accountResetFlag, arabicNickName, blockedTransactions, creditFlag, currency,
				debitFlag, englishNickName, externalLinkCode1, externalLinkCode2, logContextToken,
				maximumAccountBalanceLimit, minimumAccountBalanceLimit, notes1, notes2, omniAccountNumber,
				omniMappedCode, referenceNumber1, referenceNumber2, remitterId, requestMode, serviceHeader,
				skipCapLimit, startedBy, subscriptionFlag, transactionNotificationFlag, uniqueReference);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CMSAccountMaintenanceRequest other = (CMSAccountMaintenanceRequest) obj;
		return Objects.equals(accountNumber, other.accountNumber)
				&& Objects.equals(accountResetFlag, other.accountResetFlag)
				&& Objects.equals(arabicNickName, other.arabicNickName)
				&& Objects.equals(blockedTransactions, other.blockedTransactions)
				&& Objects.equals(creditFlag, other.creditFlag) && Objects.equals(currency, other.currency)
				&& Objects.equals(debitFlag, other.debitFlag) && Objects.equals(englishNickName, other.englishNickName)
				&& Objects.equals(externalLinkCode1, other.externalLinkCode1)
				&& Objects.equals(externalLinkCode2, other.externalLinkCode2)
				&& Objects.equals(logContextToken, other.logContextToken)
				&& Objects.equals(maximumAccountBalanceLimit, other.maximumAccountBalanceLimit)
				&& Objects.equals(minimumAccountBalanceLimit, other.minimumAccountBalanceLimit)
				&& Objects.equals(notes1, other.notes1) && Objects.equals(notes2, other.notes2)
				&& Objects.equals(omniAccountNumber, other.omniAccountNumber)
				&& Objects.equals(omniMappedCode, other.omniMappedCode)
				&& Objects.equals(referenceNumber1, other.referenceNumber1)
				&& Objects.equals(referenceNumber2, other.referenceNumber2)
				&& Objects.equals(remitterId, other.remitterId) && Objects.equals(requestMode, other.requestMode)
				&& Objects.equals(serviceHeader, other.serviceHeader)
				&& Objects.equals(skipCapLimit, other.skipCapLimit) && Objects.equals(startedBy, other.startedBy)
				&& Objects.equals(subscriptionFlag, other.subscriptionFlag)
				&& Objects.equals(transactionNotificationFlag, other.transactionNotificationFlag)
				&& Objects.equals(uniqueReference, other.uniqueReference);
	}

}
