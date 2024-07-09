
package com.alahli.middleware.account.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "omniMappedCode",
    "accountNumber",
    "omniAccountNumber",
    "messageStartDate",
    "messageEndDate",
    "transactionStartDate",
    "transactionEndDate",
    "debitCreditFlag",
    "fromAmount",
    "toAmount",
    "returnCode",
    "mainStatus",
    "createDate",
    "createStartDate",
    "createEndDate",
    "approveDate",
    "approveStartDate",
    "approveEndDate",
    "getBasicData",
    "accountStartSeq",
    "accountEndSeq",
    "ibanAccountNumber",
    "reference1",
    "reference2",
    "reference3",
    "reference4",
    "reference5",
    "sourceReference",
    "uniqueReference"
})
public class CMSAccountTransactionsRequest {

    @JsonProperty("omniMappedCode")
    private String omniMappedCode;
    @JsonProperty("accountNumber")
    private String accountNumber;
    @JsonProperty("omniAccountNumber")
    private String omniAccountNumber;
    @JsonProperty("messageStartDate")
    private String messageStartDate;
    @JsonProperty("messageEndDate")
    private String messageEndDate;
    @JsonProperty("transactionStartDate")
    private String transactionStartDate;
    @JsonProperty("transactionEndDate")
    private String transactionEndDate;
    @JsonProperty("debitCreditFlag")
    private String debitCreditFlag;
    @JsonProperty("fromAmount")
    private Integer fromAmount;
    @JsonProperty("toAmount")
    private Integer toAmount;
    @JsonProperty("returnCode")
    private String returnCode;
    @JsonProperty("mainStatus")
    private String mainStatus;
    @JsonProperty("createDate")
    private String createDate;
    @JsonProperty("createStartDate")
    private String createStartDate;
    @JsonProperty("createEndDate")
    private String createEndDate;
    @JsonProperty("approveDate")
    private String approveDate;
    @JsonProperty("approveStartDate")
    private String approveStartDate;
    @JsonProperty("approveEndDate")
    private String approveEndDate;
    @JsonProperty("getBasicData")
    private String getBasicData;
    @JsonProperty("accountStartSeq")
    private String accountStartSeq;
    @JsonProperty("accountEndSeq")
    private String accountEndSeq;
    @JsonProperty("ibanAccountNumber")
    private String ibanAccountNumber;
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
    @JsonProperty("sourceReference")
    private String sourceReference;
    @JsonProperty("uniqueReference")
    private String uniqueReference;

    @JsonProperty("omniMappedCode")
    public String getOmniMappedCode() {
        return omniMappedCode;
    }

    @JsonProperty("omniMappedCode")
    public void setOmniMappedCode(String omniMappedCode) {
        this.omniMappedCode = omniMappedCode;
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

    @JsonProperty("messageStartDate")
    public String getMessageStartDate() {
        return messageStartDate;
    }

    @JsonProperty("messageStartDate")
    public void setMessageStartDate(String messageStartDate) {
        this.messageStartDate = messageStartDate;
    }

    @JsonProperty("messageEndDate")
    public String getMessageEndDate() {
        return messageEndDate;
    }

    @JsonProperty("messageEndDate")
    public void setMessageEndDate(String messageEndDate) {
        this.messageEndDate = messageEndDate;
    }

    @JsonProperty("transactionStartDate")
    public String getTransactionStartDate() {
        return transactionStartDate;
    }

    @JsonProperty("transactionStartDate")
    public void setTransactionStartDate(String transactionStartDate) {
        this.transactionStartDate = transactionStartDate;
    }

    @JsonProperty("transactionEndDate")
    public String getTransactionEndDate() {
        return transactionEndDate;
    }

    @JsonProperty("transactionEndDate")
    public void setTransactionEndDate(String transactionEndDate) {
        this.transactionEndDate = transactionEndDate;
    }

    @JsonProperty("debitCreditFlag")
    public String getDebitCreditFlag() {
        return debitCreditFlag;
    }

    @JsonProperty("debitCreditFlag")
    public void setDebitCreditFlag(String debitCreditFlag) {
        this.debitCreditFlag = debitCreditFlag;
    }

    @JsonProperty("fromAmount")
    public Integer getFromAmount() {
        return fromAmount;
    }

    @JsonProperty("fromAmount")
    public void setFromAmount(Integer fromAmount) {
        this.fromAmount = fromAmount;
    }

    @JsonProperty("toAmount")
    public Integer getToAmount() {
        return toAmount;
    }

    @JsonProperty("toAmount")
    public void setToAmount(Integer toAmount) {
        this.toAmount = toAmount;
    }

    @JsonProperty("returnCode")
    public String getReturnCode() {
        return returnCode;
    }

    @JsonProperty("returnCode")
    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    @JsonProperty("mainStatus")
    public String getMainStatus() {
        return mainStatus;
    }

    @JsonProperty("mainStatus")
    public void setMainStatus(String mainStatus) {
        this.mainStatus = mainStatus;
    }

    @JsonProperty("createDate")
    public String getCreateDate() {
        return createDate;
    }

    @JsonProperty("createDate")
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    @JsonProperty("createStartDate")
    public String getCreateStartDate() {
        return createStartDate;
    }

    @JsonProperty("createStartDate")
    public void setCreateStartDate(String createStartDate) {
        this.createStartDate = createStartDate;
    }

    @JsonProperty("createEndDate")
    public String getCreateEndDate() {
        return createEndDate;
    }

    @JsonProperty("createEndDate")
    public void setCreateEndDate(String createEndDate) {
        this.createEndDate = createEndDate;
    }

    @JsonProperty("approveDate")
    public String getApproveDate() {
        return approveDate;
    }

    @JsonProperty("approveDate")
    public void setApproveDate(String approveDate) {
        this.approveDate = approveDate;
    }

    @JsonProperty("approveStartDate")
    public String getApproveStartDate() {
        return approveStartDate;
    }

    @JsonProperty("approveStartDate")
    public void setApproveStartDate(String approveStartDate) {
        this.approveStartDate = approveStartDate;
    }

    @JsonProperty("approveEndDate")
    public String getApproveEndDate() {
        return approveEndDate;
    }

    @JsonProperty("approveEndDate")
    public void setApproveEndDate(String approveEndDate) {
        this.approveEndDate = approveEndDate;
    }

    @JsonProperty("getBasicData")
    public String getGetBasicData() {
        return getBasicData;
    }

    @JsonProperty("getBasicData")
    public void setGetBasicData(String getBasicData) {
        this.getBasicData = getBasicData;
    }

    @JsonProperty("accountStartSeq")
    public String getAccountStartSeq() {
        return accountStartSeq;
    }

    @JsonProperty("accountStartSeq")
    public void setAccountStartSeq(String accountStartSeq) {
        this.accountStartSeq = accountStartSeq;
    }

    @JsonProperty("accountEndSeq")
    public String getAccountEndSeq() {
        return accountEndSeq;
    }

    @JsonProperty("accountEndSeq")
    public void setAccountEndSeq(String accountEndSeq) {
        this.accountEndSeq = accountEndSeq;
    }

    @JsonProperty("ibanAccountNumber")
    public String getIbanAccountNumber() {
        return ibanAccountNumber;
    }

    @JsonProperty("ibanAccountNumber")
    public void setIbanAccountNumber(String ibanAccountNumber) {
        this.ibanAccountNumber = ibanAccountNumber;
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

	@Override
	public String toString() {
		return "CMSAccountTransactionsRequest [omniMappedCode=" + omniMappedCode + ", accountNumber=" + accountNumber
				+ ", omniAccountNumber=" + omniAccountNumber + ", messageStartDate=" + messageStartDate
				+ ", messageEndDate=" + messageEndDate + ", transactionStartDate=" + transactionStartDate
				+ ", transactionEndDate=" + transactionEndDate + ", debitCreditFlag=" + debitCreditFlag
				+ ", fromAmount=" + fromAmount + ", toAmount=" + toAmount + ", returnCode=" + returnCode
				+ ", mainStatus=" + mainStatus + ", createDate=" + createDate + ", createStartDate=" + createStartDate
				+ ", createEndDate=" + createEndDate + ", approveDate=" + approveDate + ", approveStartDate="
				+ approveStartDate + ", approveEndDate=" + approveEndDate + ", getBasicData=" + getBasicData
				+ ", accountStartSeq=" + accountStartSeq + ", accountEndSeq=" + accountEndSeq + ", ibanAccountNumber="
				+ ibanAccountNumber + ", reference1=" + reference1 + ", reference2=" + reference2 + ", reference3="
				+ reference3 + ", reference4=" + reference4 + ", reference5=" + reference5 + ", sourceReference="
				+ sourceReference + ", uniqueReference=" + uniqueReference + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(accountEndSeq, accountNumber, accountStartSeq, approveDate, approveEndDate,
				approveStartDate, createDate, createEndDate, createStartDate, debitCreditFlag, fromAmount, getBasicData,
				ibanAccountNumber, mainStatus, messageEndDate, messageStartDate, omniAccountNumber, omniMappedCode,
				reference1, reference2, reference3, reference4, reference5, returnCode, sourceReference, toAmount,
				transactionEndDate, transactionStartDate, uniqueReference);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CMSAccountTransactionsRequest other = (CMSAccountTransactionsRequest) obj;
		return Objects.equals(accountEndSeq, other.accountEndSeq) && Objects.equals(accountNumber, other.accountNumber)
				&& Objects.equals(accountStartSeq, other.accountStartSeq)
				&& Objects.equals(approveDate, other.approveDate)
				&& Objects.equals(approveEndDate, other.approveEndDate)
				&& Objects.equals(approveStartDate, other.approveStartDate)
				&& Objects.equals(createDate, other.createDate) && Objects.equals(createEndDate, other.createEndDate)
				&& Objects.equals(createStartDate, other.createStartDate)
				&& Objects.equals(debitCreditFlag, other.debitCreditFlag)
				&& Objects.equals(fromAmount, other.fromAmount) && Objects.equals(getBasicData, other.getBasicData)
				&& Objects.equals(ibanAccountNumber, other.ibanAccountNumber)
				&& Objects.equals(mainStatus, other.mainStatus) && Objects.equals(messageEndDate, other.messageEndDate)
				&& Objects.equals(messageStartDate, other.messageStartDate)
				&& Objects.equals(omniAccountNumber, other.omniAccountNumber)
				&& Objects.equals(omniMappedCode, other.omniMappedCode) && Objects.equals(reference1, other.reference1)
				&& Objects.equals(reference2, other.reference2) && Objects.equals(reference3, other.reference3)
				&& Objects.equals(reference4, other.reference4) && Objects.equals(reference5, other.reference5)
				&& Objects.equals(returnCode, other.returnCode)
				&& Objects.equals(sourceReference, other.sourceReference) && Objects.equals(toAmount, other.toAmount)
				&& Objects.equals(transactionEndDate, other.transactionEndDate)
				&& Objects.equals(transactionStartDate, other.transactionStartDate)
				&& Objects.equals(uniqueReference, other.uniqueReference);
	}
	
}
