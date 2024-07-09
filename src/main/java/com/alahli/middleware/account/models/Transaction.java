
package com.alahli.middleware.account.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "messageID",
    "accountNumber",
    "omniMappedCode",
    "messageDate",
    "omniAccountNumber",
    "transactionDate",
    "currency",
    "valueDate",
    "amount",
    "debitCreditFlag",
    "debitCreditDescription",
    "mainStatus",
    "mainStatusDesciption",
    "channel",
    "requestUser",
    "omniName",
    "nickName",
    "reference1",
    "reference2",
    "reference3",
    "reference4",
    "reference5",
    "reference6",
    "sourceReference",
    "uniqueReference",
    "englishLine1",
    "englishLine2",
    "arabicLine1",
    "arabicLine2",
    "returnCode",
    "notes1",
    "notes2",
    "createUserCode",
    "createDate",
    "approveUserCode",
    "approveDate",
    "tagDetails",
    "ibanAccountNumber",
    "transactionFeeAmount",
    "transactionTaxAmount",
    "transactionTotalAmount"
})
public class Transaction {

    @JsonProperty("messageID")
    private String messageID;
    
    @JsonProperty("accountNumber")
    private String accountNumber;
    
    @JsonProperty("omniMappedCode")
    private String omniMappedCode;
    
    @JsonProperty("messageDate")
    private String messageDate;
    
    @JsonProperty("omniAccountNumber")
    private String omniAccountNumber;
    
    @JsonProperty("transactionDate")
    private String transactionDate;
    
    @JsonProperty("currency")
    private String currency;
    
    @JsonProperty("valueDate")
    private String valueDate;
    
    @JsonProperty("amount")
    private Integer amount;
    
    @JsonProperty("debitCreditFlag")
    private String debitCreditFlag;
    
    @JsonProperty("debitCreditDescription")
    private String debitCreditDescription;
    
    @JsonProperty("mainStatus")
    private String mainStatus;
    
    @JsonProperty("mainStatusDesciption")
    private String mainStatusDesciption;
    
    @JsonProperty("channel")
    private String channel;
    
    @JsonProperty("requestUser")
    private String requestUser;
    
    @JsonProperty("omniName")
    private String omniName;
    
    @JsonProperty("nickName")
    private String nickName;
    
    @JsonProperty("reference1")
    private String reference1;
    
    @JsonProperty("reference2")
    private String reference2;
    
    @JsonProperty("reference3")
    private String reference3;
    
    @JsonProperty("reference4")
    private String reference4;
    
    @JsonProperty("reference5")
    private String reference5;
    
    @JsonProperty("reference6")
    private String reference6;
    
    @JsonProperty("sourceReference")
    private String sourceReference;
    
    @JsonProperty("uniqueReference")
    private String uniqueReference;
    
    @JsonProperty("englishLine1")
    private String englishLine1;
    
    @JsonProperty("englishLine2")
    private String englishLine2;
    
    @JsonProperty("arabicLine1")
    private String arabicLine1;
    
    @JsonProperty("arabicLine2")
    private String arabicLine2;
    
    @JsonProperty("returnCode")
    private String returnCode;
    
    @JsonProperty("notes1")
    private String notes1;
    
    @JsonProperty("notes2")
    private String notes2;
    
    @JsonProperty("createUserCode")
    private String createUserCode;
    
    @JsonProperty("createDate")
    private String createDate;
    
    @JsonProperty("approveUserCode")
    private String approveUserCode;
    
    @JsonProperty("approveDate")
    private String approveDate;
    
    @JsonProperty("tagDetails")
    private String tagDetails;
    
    @JsonProperty("ibanAccountNumber")
    private String ibanAccountNumber;
    
    @JsonProperty("transactionFeeAmount")
    private Integer transactionFeeAmount;
    
    @JsonProperty("transactionTaxAmount")
    private Integer transactionTaxAmount;
    
    @JsonProperty("transactionTotalAmount")
    private Integer transactionTotalAmount;

    @JsonProperty("messageID")
    public String getMessageID() {
        return messageID;
    }

    @JsonProperty("messageID")
    public void setMessageID(String messageID) {
        this.messageID = messageID;
    }

    @JsonProperty("accountNumber")
    public String getAccountNumber() {
        return accountNumber;
    }

    @JsonProperty("accountNumber")
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @JsonProperty("omniMappedCode")
    public String getOmniMappedCode() {
        return omniMappedCode;
    }

    @JsonProperty("omniMappedCode")
    public void setOmniMappedCode(String omniMappedCode) {
        this.omniMappedCode = omniMappedCode;
    }

    @JsonProperty("messageDate")
    public String getMessageDate() {
        return messageDate;
    }

    @JsonProperty("messageDate")
    public void setMessageDate(String messageDate) {
        this.messageDate = messageDate;
    }

    @JsonProperty("omniAccountNumber")
    public String getOmniAccountNumber() {
        return omniAccountNumber;
    }

    @JsonProperty("omniAccountNumber")
    public void setOmniAccountNumber(String omniAccountNumber) {
        this.omniAccountNumber = omniAccountNumber;
    }

    @JsonProperty("transactionDate")
    public String getTransactionDate() {
        return transactionDate;
    }

    @JsonProperty("transactionDate")
    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @JsonProperty("valueDate")
    public String getValueDate() {
        return valueDate;
    }

    @JsonProperty("valueDate")
    public void setValueDate(String valueDate) {
        this.valueDate = valueDate;
    }

    @JsonProperty("amount")
    public Integer getAmount() {
        return amount;
    }

    @JsonProperty("amount")
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @JsonProperty("debitCreditFlag")
    public String getDebitCreditFlag() {
        return debitCreditFlag;
    }

    @JsonProperty("debitCreditFlag")
    public void setDebitCreditFlag(String debitCreditFlag) {
        this.debitCreditFlag = debitCreditFlag;
    }

    @JsonProperty("debitCreditDescription")
    public String getDebitCreditDescription() {
        return debitCreditDescription;
    }

    @JsonProperty("debitCreditDescription")
    public void setDebitCreditDescription(String debitCreditDescription) {
        this.debitCreditDescription = debitCreditDescription;
    }

    @JsonProperty("mainStatus")
    public String getMainStatus() {
        return mainStatus;
    }

    @JsonProperty("mainStatus")
    public void setMainStatus(String mainStatus) {
        this.mainStatus = mainStatus;
    }

    @JsonProperty("mainStatusDesciption")
    public String getMainStatusDesciption() {
        return mainStatusDesciption;
    }

    @JsonProperty("mainStatusDesciption")
    public void setMainStatusDesciption(String mainStatusDesciption) {
        this.mainStatusDesciption = mainStatusDesciption;
    }

    @JsonProperty("channel")
    public String getChannel() {
        return channel;
    }

    @JsonProperty("channel")
    public void setChannel(String channel) {
        this.channel = channel;
    }

    @JsonProperty("requestUser")
    public String getRequestUser() {
        return requestUser;
    }

    @JsonProperty("requestUser")
    public void setRequestUser(String requestUser) {
        this.requestUser = requestUser;
    }

    @JsonProperty("omniName")
    public String getOmniName() {
        return omniName;
    }

    @JsonProperty("omniName")
    public void setOmniName(String omniName) {
        this.omniName = omniName;
    }

    @JsonProperty("nickName")
    public String getNickName() {
        return nickName;
    }

    @JsonProperty("nickName")
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @JsonProperty("reference1")
    public String getReference1() {
        return reference1;
    }

    @JsonProperty("reference1")
    public void setReference1(String reference1) {
        this.reference1 = reference1;
    }

    @JsonProperty("reference2")
    public String getReference2() {
        return reference2;
    }

    @JsonProperty("reference2")
    public void setReference2(String reference2) {
        this.reference2 = reference2;
    }

    @JsonProperty("reference3")
    public String getReference3() {
        return reference3;
    }

    @JsonProperty("reference3")
    public void setReference3(String reference3) {
        this.reference3 = reference3;
    }

    @JsonProperty("reference4")
    public String getReference4() {
        return reference4;
    }

    @JsonProperty("reference4")
    public void setReference4(String reference4) {
        this.reference4 = reference4;
    }

    @JsonProperty("reference5")
    public String getReference5() {
        return reference5;
    }

    @JsonProperty("reference5")
    public void setReference5(String reference5) {
        this.reference5 = reference5;
    }

    @JsonProperty("reference6")
    public String getReference6() {
        return reference6;
    }

    @JsonProperty("reference6")
    public void setReference6(String reference6) {
        this.reference6 = reference6;
    }

    @JsonProperty("sourceReference")
    public String getSourceReference() {
        return sourceReference;
    }

    @JsonProperty("sourceReference")
    public void setSourceReference(String sourceReference) {
        this.sourceReference = sourceReference;
    }

    @JsonProperty("uniqueReference")
    public String getUniqueReference() {
        return uniqueReference;
    }

    @JsonProperty("uniqueReference")
    public void setUniqueReference(String uniqueReference) {
        this.uniqueReference = uniqueReference;
    }

    @JsonProperty("englishLine1")
    public String getEnglishLine1() {
        return englishLine1;
    }

    @JsonProperty("englishLine1")
    public void setEnglishLine1(String englishLine1) {
        this.englishLine1 = englishLine1;
    }

    @JsonProperty("englishLine2")
    public String getEnglishLine2() {
        return englishLine2;
    }

    @JsonProperty("englishLine2")
    public void setEnglishLine2(String englishLine2) {
        this.englishLine2 = englishLine2;
    }

    @JsonProperty("arabicLine1")
    public String getArabicLine1() {
        return arabicLine1;
    }

    @JsonProperty("arabicLine1")
    public void setArabicLine1(String arabicLine1) {
        this.arabicLine1 = arabicLine1;
    }

    @JsonProperty("arabicLine2")
    public String getArabicLine2() {
        return arabicLine2;
    }

    @JsonProperty("arabicLine2")
    public void setArabicLine2(String arabicLine2) {
        this.arabicLine2 = arabicLine2;
    }

    @JsonProperty("returnCode")
    public String getReturnCode() {
        return returnCode;
    }

    @JsonProperty("returnCode")
    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
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

    @JsonProperty("createUserCode")
    public String getCreateUserCode() {
        return createUserCode;
    }

    @JsonProperty("createUserCode")
    public void setCreateUserCode(String createUserCode) {
        this.createUserCode = createUserCode;
    }

    @JsonProperty("createDate")
    public String getCreateDate() {
        return createDate;
    }

    @JsonProperty("createDate")
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    @JsonProperty("approveUserCode")
    public String getApproveUserCode() {
        return approveUserCode;
    }

    @JsonProperty("approveUserCode")
    public void setApproveUserCode(String approveUserCode) {
        this.approveUserCode = approveUserCode;
    }

    @JsonProperty("approveDate")
    public String getApproveDate() {
        return approveDate;
    }

    @JsonProperty("approveDate")
    public void setApproveDate(String approveDate) {
        this.approveDate = approveDate;
    }

    @JsonProperty("tagDetails")
    public String getTagDetails() {
        return tagDetails;
    }

    @JsonProperty("tagDetails")
    public void setTagDetails(String tagDetails) {
        this.tagDetails = tagDetails;
    }

    @JsonProperty("ibanAccountNumber")
    public String getIbanAccountNumber() {
        return ibanAccountNumber;
    }

    @JsonProperty("ibanAccountNumber")
    public void setIbanAccountNumber(String ibanAccountNumber) {
        this.ibanAccountNumber = ibanAccountNumber;
    }

    @JsonProperty("transactionFeeAmount")
    public Integer getTransactionFeeAmount() {
        return transactionFeeAmount;
    }

    @JsonProperty("transactionFeeAmount")
    public void setTransactionFeeAmount(Integer transactionFeeAmount) {
        this.transactionFeeAmount = transactionFeeAmount;
    }

    @JsonProperty("transactionTaxAmount")
    public Integer getTransactionTaxAmount() {
        return transactionTaxAmount;
    }

    @JsonProperty("transactionTaxAmount")
    public void setTransactionTaxAmount(Integer transactionTaxAmount) {
        this.transactionTaxAmount = transactionTaxAmount;
    }

    @JsonProperty("transactionTotalAmount")
    public Integer getTransactionTotalAmount() {
        return transactionTotalAmount;
    }

    @JsonProperty("transactionTotalAmount")
    public void setTransactionTotalAmount(Integer transactionTotalAmount) {
        this.transactionTotalAmount = transactionTotalAmount;
    }

	@Override
	public String toString() {
		return "Transaction [messageID=" + messageID + ", accountNumber=" + accountNumber + ", omniMappedCode="
				+ omniMappedCode + ", messageDate=" + messageDate + ", omniAccountNumber=" + omniAccountNumber
				+ ", transactionDate=" + transactionDate + ", currency=" + currency + ", valueDate=" + valueDate
				+ ", amount=" + amount + ", debitCreditFlag=" + debitCreditFlag + ", debitCreditDescription="
				+ debitCreditDescription + ", mainStatus=" + mainStatus + ", mainStatusDesciption="
				+ mainStatusDesciption + ", channel=" + channel + ", requestUser=" + requestUser + ", omniName="
				+ omniName + ", nickName=" + nickName + ", reference1=" + reference1 + ", reference2=" + reference2
				+ ", reference3=" + reference3 + ", reference4=" + reference4 + ", reference5=" + reference5
				+ ", reference6=" + reference6 + ", sourceReference=" + sourceReference + ", uniqueReference="
				+ uniqueReference + ", englishLine1=" + englishLine1 + ", englishLine2=" + englishLine2
				+ ", arabicLine1=" + arabicLine1 + ", arabicLine2=" + arabicLine2 + ", returnCode=" + returnCode
				+ ", notes1=" + notes1 + ", notes2=" + notes2 + ", createUserCode=" + createUserCode + ", createDate="
				+ createDate + ", approveUserCode=" + approveUserCode + ", approveDate=" + approveDate + ", tagDetails="
				+ tagDetails + ", ibanAccountNumber=" + ibanAccountNumber + ", transactionFeeAmount="
				+ transactionFeeAmount + ", transactionTaxAmount=" + transactionTaxAmount + ", transactionTotalAmount="
				+ transactionTotalAmount + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(accountNumber, amount, approveDate, approveUserCode, arabicLine1, arabicLine2, channel,
				createDate, createUserCode, currency, debitCreditDescription, debitCreditFlag, englishLine1,
				englishLine2, ibanAccountNumber, mainStatus, mainStatusDesciption, messageDate, messageID, nickName,
				notes1, notes2, omniAccountNumber, omniMappedCode, omniName, reference1, reference2, reference3,
				reference4, reference5, reference6, requestUser, returnCode, sourceReference, tagDetails,
				transactionDate, transactionFeeAmount, transactionTaxAmount, transactionTotalAmount, uniqueReference,
				valueDate);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Transaction other = (Transaction) obj;
		return Objects.equals(accountNumber, other.accountNumber) && Objects.equals(amount, other.amount)
				&& Objects.equals(approveDate, other.approveDate)
				&& Objects.equals(approveUserCode, other.approveUserCode)
				&& Objects.equals(arabicLine1, other.arabicLine1) && Objects.equals(arabicLine2, other.arabicLine2)
				&& Objects.equals(channel, other.channel) && Objects.equals(createDate, other.createDate)
				&& Objects.equals(createUserCode, other.createUserCode) && Objects.equals(currency, other.currency)
				&& Objects.equals(debitCreditDescription, other.debitCreditDescription)
				&& Objects.equals(debitCreditFlag, other.debitCreditFlag)
				&& Objects.equals(englishLine1, other.englishLine1) && Objects.equals(englishLine2, other.englishLine2)
				&& Objects.equals(ibanAccountNumber, other.ibanAccountNumber)
				&& Objects.equals(mainStatus, other.mainStatus)
				&& Objects.equals(mainStatusDesciption, other.mainStatusDesciption)
				&& Objects.equals(messageDate, other.messageDate) && Objects.equals(messageID, other.messageID)
				&& Objects.equals(nickName, other.nickName) && Objects.equals(notes1, other.notes1)
				&& Objects.equals(notes2, other.notes2) && Objects.equals(omniAccountNumber, other.omniAccountNumber)
				&& Objects.equals(omniMappedCode, other.omniMappedCode) && Objects.equals(omniName, other.omniName)
				&& Objects.equals(reference1, other.reference1) && Objects.equals(reference2, other.reference2)
				&& Objects.equals(reference3, other.reference3) && Objects.equals(reference4, other.reference4)
				&& Objects.equals(reference5, other.reference5) && Objects.equals(reference6, other.reference6)
				&& Objects.equals(requestUser, other.requestUser) && Objects.equals(returnCode, other.returnCode)
				&& Objects.equals(sourceReference, other.sourceReference)
				&& Objects.equals(tagDetails, other.tagDetails)
				&& Objects.equals(transactionDate, other.transactionDate)
				&& Objects.equals(transactionFeeAmount, other.transactionFeeAmount)
				&& Objects.equals(transactionTaxAmount, other.transactionTaxAmount)
				&& Objects.equals(transactionTotalAmount, other.transactionTotalAmount)
				&& Objects.equals(uniqueReference, other.uniqueReference) && Objects.equals(valueDate, other.valueDate);
	}

}
