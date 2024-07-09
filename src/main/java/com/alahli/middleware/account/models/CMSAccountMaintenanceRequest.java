
package com.alahli.middleware.account.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "requestMode",
    "accountNumber",
    "omniAccountNumber",
    "englishNickName",
    "arabicNickName",
    "currency",
    "omniMappedCode",
    "externalLinkCode1",
    "externalLinkCode2",
    "referenceNumber1",
    "referenceNumber2",
    "notes1",
    "notes2",
    "remitterId",
    "blockedTransactions",
    "transactionNotificationFlag",
    "debitFlag",
    "creditFlag",
    "minimumAccountBalanceLimit",
    "maximumAccountBalanceLimit",
    "subscriptionFlag",
    "accountResetFlag",
    "uniqueReference",
    "skipCapLimit"
})
public class CMSAccountMaintenanceRequest {

    @JsonProperty("requestMode")
    private String requestMode;
    @JsonProperty("accountNumber")
    private String accountNumber;
    @JsonProperty("omniAccountNumber")
    private String omniAccountNumber;
    @JsonProperty("englishNickName")
    private String englishNickName;
    @JsonProperty("arabicNickName")
    private String arabicNickName;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("omniMappedCode")
    private String omniMappedCode;
    @JsonProperty("externalLinkCode1")
    private String externalLinkCode1;
    @JsonProperty("externalLinkCode2")
    private String externalLinkCode2;
    @JsonProperty("referenceNumber1")
    private String referenceNumber1;
    @JsonProperty("referenceNumber2")
    private String referenceNumber2;
    @JsonProperty("notes1")
    private String notes1;
    @JsonProperty("notes2")
    private String notes2;
    @JsonProperty("remitterId")
    private String remitterId;
    @JsonProperty("blockedTransactions")
    private String blockedTransactions;
    @JsonProperty("transactionNotificationFlag")
    private String transactionNotificationFlag;
    @JsonProperty("debitFlag")
    private String debitFlag;
    @JsonProperty("creditFlag")
    private String creditFlag;
    @JsonProperty("minimumAccountBalanceLimit")
    private Integer minimumAccountBalanceLimit;
    @JsonProperty("maximumAccountBalanceLimit")
    private Integer maximumAccountBalanceLimit;
    @JsonProperty("subscriptionFlag")
    private String subscriptionFlag;
    @JsonProperty("accountResetFlag")
    private String accountResetFlag;
    @JsonProperty("uniqueReference")
    private String uniqueReference;
    @JsonProperty("skipCapLimit")
    private String skipCapLimit;

    @JsonProperty("requestMode")
    public String getRequestMode() {
        return requestMode;
    }

    @JsonProperty("requestMode")
    public void setRequestMode(String requestMode) {
        this.requestMode = requestMode;
    }

    @JsonProperty("accountNumber")
    public String getAccountNumber() {
        return accountNumber;
    }

    @JsonProperty("accountNumber")
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @JsonProperty("omniAccountNumber")
    public String getOmniAccountNumber() {
        return omniAccountNumber;
    }

    @JsonProperty("omniAccountNumber")
    public void setOmniAccountNumber(String omniAccountNumber) {
        this.omniAccountNumber = omniAccountNumber;
    }

    @JsonProperty("englishNickName")
    public String getEnglishNickName() {
        return englishNickName;
    }

    @JsonProperty("englishNickName")
    public void setEnglishNickName(String englishNickName) {
        this.englishNickName = englishNickName;
    }

    @JsonProperty("arabicNickName")
    public String getArabicNickName() {
        return arabicNickName;
    }

    @JsonProperty("arabicNickName")
    public void setArabicNickName(String arabicNickName) {
        this.arabicNickName = arabicNickName;
    }

    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @JsonProperty("omniMappedCode")
    public String getOmniMappedCode() {
        return omniMappedCode;
    }

    @JsonProperty("omniMappedCode")
    public void setOmniMappedCode(String omniMappedCode) {
        this.omniMappedCode = omniMappedCode;
    }

    @JsonProperty("externalLinkCode1")
    public String getExternalLinkCode1() {
        return externalLinkCode1;
    }

    @JsonProperty("externalLinkCode1")
    public void setExternalLinkCode1(String externalLinkCode1) {
        this.externalLinkCode1 = externalLinkCode1;
    }

    @JsonProperty("externalLinkCode2")
    public String getExternalLinkCode2() {
        return externalLinkCode2;
    }

    @JsonProperty("externalLinkCode2")
    public void setExternalLinkCode2(String externalLinkCode2) {
        this.externalLinkCode2 = externalLinkCode2;
    }

    @JsonProperty("referenceNumber1")
    public String getReferenceNumber1() {
        return referenceNumber1;
    }

    @JsonProperty("referenceNumber1")
    public void setReferenceNumber1(String referenceNumber1) {
        this.referenceNumber1 = referenceNumber1;
    }

    @JsonProperty("referenceNumber2")
    public String getReferenceNumber2() {
        return referenceNumber2;
    }

    @JsonProperty("referenceNumber2")
    public void setReferenceNumber2(String referenceNumber2) {
        this.referenceNumber2 = referenceNumber2;
    }

    @JsonProperty("notes1")
    public String getNotes1() {
        return notes1;
    }

    @JsonProperty("notes1")
    public void setNotes1(String notes1) {
        this.notes1 = notes1;
    }

    @JsonProperty("notes2")
    public String getNotes2() {
        return notes2;
    }

    @JsonProperty("notes2")
    public void setNotes2(String notes2) {
        this.notes2 = notes2;
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

    @JsonProperty("transactionNotificationFlag")
    public String getTransactionNotificationFlag() {
        return transactionNotificationFlag;
    }

    @JsonProperty("transactionNotificationFlag")
    public void setTransactionNotificationFlag(String transactionNotificationFlag) {
        this.transactionNotificationFlag = transactionNotificationFlag;
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

    @JsonProperty("accountResetFlag")
    public String getAccountResetFlag() {
        return accountResetFlag;
    }

    @JsonProperty("accountResetFlag")
    public void setAccountResetFlag(String accountResetFlag) {
        this.accountResetFlag = accountResetFlag;
    }

    @JsonProperty("uniqueReference")
    public String getUniqueReference() {
        return uniqueReference;
    }

    @JsonProperty("uniqueReference")
    public void setUniqueReference(String uniqueReference) {
        this.uniqueReference = uniqueReference;
    }

    @JsonProperty("skipCapLimit")
    public String getSkipCapLimit() {
        return skipCapLimit;
    }

    @JsonProperty("skipCapLimit")
    public void setSkipCapLimit(String skipCapLimit) {
        this.skipCapLimit = skipCapLimit;
    }

	public CMSAccountMaintenanceRequest() {
		super();
	}

	public CMSAccountMaintenanceRequest(String requestMode, String accountNumber, String omniAccountNumber,
			String englishNickName, String arabicNickName, String currency, String omniMappedCode,
			String externalLinkCode1, String externalLinkCode2, String referenceNumber1, String referenceNumber2,
			String notes1, String notes2, String remitterId, String blockedTransactions,
			String transactionNotificationFlag, String debitFlag, String creditFlag, Integer minimumAccountBalanceLimit,
			Integer maximumAccountBalanceLimit, String subscriptionFlag, String accountResetFlag,
			String uniqueReference, String skipCapLimit) {
		super();
		this.requestMode = requestMode;
		this.accountNumber = accountNumber;
		this.omniAccountNumber = omniAccountNumber;
		this.englishNickName = englishNickName;
		this.arabicNickName = arabicNickName;
		this.currency = currency;
		this.omniMappedCode = omniMappedCode;
		this.externalLinkCode1 = externalLinkCode1;
		this.externalLinkCode2 = externalLinkCode2;
		this.referenceNumber1 = referenceNumber1;
		this.referenceNumber2 = referenceNumber2;
		this.notes1 = notes1;
		this.notes2 = notes2;
		this.remitterId = remitterId;
		this.blockedTransactions = blockedTransactions;
		this.transactionNotificationFlag = transactionNotificationFlag;
		this.debitFlag = debitFlag;
		this.creditFlag = creditFlag;
		this.minimumAccountBalanceLimit = minimumAccountBalanceLimit;
		this.maximumAccountBalanceLimit = maximumAccountBalanceLimit;
		this.subscriptionFlag = subscriptionFlag;
		this.accountResetFlag = accountResetFlag;
		this.uniqueReference = uniqueReference;
		this.skipCapLimit = skipCapLimit;
	}

	@Override
	public String toString() {
		return "CMSAccountMaintenanceRequest [requestMode=" + requestMode + ", accountNumber=" + accountNumber
				+ ", omniAccountNumber=" + omniAccountNumber + ", englishNickName=" + englishNickName
				+ ", arabicNickName=" + arabicNickName + ", currency=" + currency + ", omniMappedCode=" + omniMappedCode
				+ ", externalLinkCode1=" + externalLinkCode1 + ", externalLinkCode2=" + externalLinkCode2
				+ ", referenceNumber1=" + referenceNumber1 + ", referenceNumber2=" + referenceNumber2 + ", notes1="
				+ notes1 + ", notes2=" + notes2 + ", remitterId=" + remitterId + ", blockedTransactions="
				+ blockedTransactions + ", transactionNotificationFlag=" + transactionNotificationFlag + ", debitFlag="
				+ debitFlag + ", creditFlag=" + creditFlag + ", minimumAccountBalanceLimit="
				+ minimumAccountBalanceLimit + ", maximumAccountBalanceLimit=" + maximumAccountBalanceLimit
				+ ", subscriptionFlag=" + subscriptionFlag + ", accountResetFlag=" + accountResetFlag
				+ ", uniqueReference=" + uniqueReference + ", skipCapLimit=" + skipCapLimit + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(accountNumber, accountResetFlag, arabicNickName, blockedTransactions, creditFlag, currency,
				debitFlag, englishNickName, externalLinkCode1, externalLinkCode2, maximumAccountBalanceLimit,
				minimumAccountBalanceLimit, notes1, notes2, omniAccountNumber, omniMappedCode, referenceNumber1,
				referenceNumber2, remitterId, requestMode, skipCapLimit, subscriptionFlag, transactionNotificationFlag,
				uniqueReference);
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
				&& Objects.equals(maximumAccountBalanceLimit, other.maximumAccountBalanceLimit)
				&& Objects.equals(minimumAccountBalanceLimit, other.minimumAccountBalanceLimit)
				&& Objects.equals(notes1, other.notes1) && Objects.equals(notes2, other.notes2)
				&& Objects.equals(omniAccountNumber, other.omniAccountNumber)
				&& Objects.equals(omniMappedCode, other.omniMappedCode)
				&& Objects.equals(referenceNumber1, other.referenceNumber1)
				&& Objects.equals(referenceNumber2, other.referenceNumber2)
				&& Objects.equals(remitterId, other.remitterId) && Objects.equals(requestMode, other.requestMode)
				&& Objects.equals(skipCapLimit, other.skipCapLimit)
				&& Objects.equals(subscriptionFlag, other.subscriptionFlag)
				&& Objects.equals(transactionNotificationFlag, other.transactionNotificationFlag)
				&& Objects.equals(uniqueReference, other.uniqueReference);
	}

}
