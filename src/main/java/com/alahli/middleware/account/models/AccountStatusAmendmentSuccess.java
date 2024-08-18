
package com.alahli.middleware.account.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "accountNumber",
    "currentStatus",
    "newStatus",
    "currentKYCStatus",
    "newKYCStatus",
    "currentSamaStatus",
    "newSamaStatus",
    "reasonAccountStatus",
    "reasonSamaStatus",
    "reasonKYCStatus",
    "kycUnfreezeDate",
    "letterNumber",
    "letterDate",
    "blockDate",
    "note",
    "inacStat",
    "enfBlockStatus",
    "ssuBlockStatus",
    "legalBlockStatus",
    "effENFBlockDate",
    "effENFBlockDateFlag",
    "effSSUBlockDate",
    "effSSUBlockDateFlag",
    "effLegalBlockDate",
    "effLegalBlockDateFlag",
    "enfBlockReasonStat",
    "ssuBlockReasonStat",
    "legalBlockReasonStat",
    "enfStopPeriod",
    "ssuStopPeriod",
    "enfBlockDate",
    "ssuBlockLetterNumber",
    "legalBlockLetterNumber",
    "ssuBlockLetterDate",
    "legalBlockLetterDate",
    "ssuBlockNote",
    "legalBlockNote",
    "lastAccountStatDate",
    "highRiskAccount",
    "fatcaFreeze",
    "workFlowFlag"
})
public class AccountStatusAmendmentSuccess {

    @JsonProperty("accountNumber")
    private String accountNumber;
    
    @JsonProperty("currentStatus")
    private String currentStatus;
    
    @JsonProperty("newStatus")
    private String newStatus;
    
    @JsonProperty("currentKYCStatus")
    private String currentKYCStatus;
    
    @JsonProperty("newKYCStatus")
    private String newKYCStatus;
    
    @JsonProperty("currentSamaStatus")
    private String currentSamaStatus;
    
    @JsonProperty("newSamaStatus")
    private String newSamaStatus;
    
    @JsonProperty("reasonAccountStatus")
    private String reasonAccountStatus;
    
    @JsonProperty("reasonSamaStatus")
    private String reasonSamaStatus;
    
    @JsonProperty("reasonKYCStatus")
    private String reasonKYCStatus;
    
    @JsonProperty("kycUnfreezeDate")
    private String kycUnfreezeDate;
    
    @JsonProperty("letterNumber")
    private String letterNumber;
    
    @JsonProperty("letterDate")
    private String letterDate;
    
    @JsonProperty("blockDate")
    private String blockDate;
    
    @JsonProperty("note")
    private String note;
    
    @JsonProperty("inacStat")
    private String inacStat;
    
    @JsonProperty("enfBlockStatus")
    private String enfBlockStatus;
    
    @JsonProperty("ssuBlockStatus")
    private String ssuBlockStatus;
    
    @JsonProperty("legalBlockStatus")
    private String legalBlockStatus;
    
    @JsonProperty("effENFBlockDate")
    private String effENFBlockDate;
    
    @JsonProperty("effENFBlockDateFlag")
    private String effENFBlockDateFlag;
    
    @JsonProperty("effSSUBlockDate")
    private String effSSUBlockDate;
    
    @JsonProperty("effSSUBlockDateFlag")
    private String effSSUBlockDateFlag;
    
    @JsonProperty("effLegalBlockDate")
    private String effLegalBlockDate;
    
    @JsonProperty("effLegalBlockDateFlag")
    private String effLegalBlockDateFlag;
    
    @JsonProperty("enfBlockReasonStat")
    private String enfBlockReasonStat;
    
    @JsonProperty("ssuBlockReasonStat")
    private String ssuBlockReasonStat;
    
    @JsonProperty("legalBlockReasonStat")
    private String legalBlockReasonStat;
    
    @JsonProperty("enfStopPeriod")
    private String enfStopPeriod;
    
    @JsonProperty("ssuStopPeriod")
    private String ssuStopPeriod;
    
    @JsonProperty("enfBlockDate")
    private String enfBlockDate;
    
    @JsonProperty("ssuBlockLetterNumber")
    private String ssuBlockLetterNumber;
    
    @JsonProperty("legalBlockLetterNumber")
    private String legalBlockLetterNumber;
    
    @JsonProperty("ssuBlockLetterDate")
    private String ssuBlockLetterDate;
    
    @JsonProperty("legalBlockLetterDate")
    private String legalBlockLetterDate;
    
    @JsonProperty("ssuBlockNote")
    private String ssuBlockNote;
    
    @JsonProperty("legalBlockNote")
    private String legalBlockNote;
    
    @JsonProperty("lastAccountStatDate")
    private String lastAccountStatDate;
    
    @JsonProperty("highRiskAccount")
    private String highRiskAccount;
    
    @JsonProperty("fatcaFreeze")
    private String fatcaFreeze;
    
    @JsonProperty("workFlowFlag")
    private String workFlowFlag;

    @JsonProperty("accountNumber")
    public String getAccountNumber() {
        return accountNumber;
    }

    @JsonProperty("accountNumber")
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @JsonProperty("currentStatus")
    public String getCurrentStatus() {
        return currentStatus;
    }

    @JsonProperty("currentStatus")
    public void setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
    }

    @JsonProperty("newStatus")
    public String getNewStatus() {
        return newStatus;
    }

    @JsonProperty("newStatus")
    public void setNewStatus(String newStatus) {
        this.newStatus = newStatus;
    }

    @JsonProperty("currentKYCStatus")
    public String getCurrentKYCStatus() {
        return currentKYCStatus;
    }

    @JsonProperty("currentKYCStatus")
    public void setCurrentKYCStatus(String currentKYCStatus) {
        this.currentKYCStatus = currentKYCStatus;
    }

    @JsonProperty("newKYCStatus")
    public String getNewKYCStatus() {
        return newKYCStatus;
    }

    @JsonProperty("newKYCStatus")
    public void setNewKYCStatus(String newKYCStatus) {
        this.newKYCStatus = newKYCStatus;
    }

    @JsonProperty("currentSamaStatus")
    public String getCurrentSamaStatus() {
        return currentSamaStatus;
    }

    @JsonProperty("currentSamaStatus")
    public void setCurrentSamaStatus(String currentSamaStatus) {
        this.currentSamaStatus = currentSamaStatus;
    }

    @JsonProperty("newSamaStatus")
    public String getNewSamaStatus() {
        return newSamaStatus;
    }

    @JsonProperty("newSamaStatus")
    public void setNewSamaStatus(String newSamaStatus) {
        this.newSamaStatus = newSamaStatus;
    }

    @JsonProperty("reasonAccountStatus")
    public String getReasonAccountStatus() {
        return reasonAccountStatus;
    }

    @JsonProperty("reasonAccountStatus")
    public void setReasonAccountStatus(String reasonAccountStatus) {
        this.reasonAccountStatus = reasonAccountStatus;
    }

    @JsonProperty("reasonSamaStatus")
    public String getReasonSamaStatus() {
        return reasonSamaStatus;
    }

    @JsonProperty("reasonSamaStatus")
    public void setReasonSamaStatus(String reasonSamaStatus) {
        this.reasonSamaStatus = reasonSamaStatus;
    }

    @JsonProperty("reasonKYCStatus")
    public String getReasonKYCStatus() {
        return reasonKYCStatus;
    }

    @JsonProperty("reasonKYCStatus")
    public void setReasonKYCStatus(String reasonKYCStatus) {
        this.reasonKYCStatus = reasonKYCStatus;
    }

    @JsonProperty("kycUnfreezeDate")
    public String getKycUnfreezeDate() {
        return kycUnfreezeDate;
    }

    @JsonProperty("kycUnfreezeDate")
    public void setKycUnfreezeDate(String kycUnfreezeDate) {
        this.kycUnfreezeDate = kycUnfreezeDate;
    }

    @JsonProperty("letterNumber")
    public String getLetterNumber() {
        return letterNumber;
    }

    @JsonProperty("letterNumber")
    public void setLetterNumber(String letterNumber) {
        this.letterNumber = letterNumber;
    }

    @JsonProperty("letterDate")
    public String getLetterDate() {
        return letterDate;
    }

    @JsonProperty("letterDate")
    public void setLetterDate(String letterDate) {
        this.letterDate = letterDate;
    }

    @JsonProperty("blockDate")
    public String getBlockDate() {
        return blockDate;
    }

    @JsonProperty("blockDate")
    public void setBlockDate(String blockDate) {
        this.blockDate = blockDate;
    }

    @JsonProperty("note")
    public String getNote() {
        return note;
    }

    @JsonProperty("note")
    public void setNote(String note) {
        this.note = note;
    }

    @JsonProperty("inacStat")
    public String getInacStat() {
        return inacStat;
    }

    @JsonProperty("inacStat")
    public void setInacStat(String inacStat) {
        this.inacStat = inacStat;
    }

    @JsonProperty("enfBlockStatus")
    public String getEnfBlockStatus() {
        return enfBlockStatus;
    }

    @JsonProperty("enfBlockStatus")
    public void setEnfBlockStatus(String enfBlockStatus) {
        this.enfBlockStatus = enfBlockStatus;
    }

    @JsonProperty("ssuBlockStatus")
    public String getSsuBlockStatus() {
        return ssuBlockStatus;
    }

    @JsonProperty("ssuBlockStatus")
    public void setSsuBlockStatus(String ssuBlockStatus) {
        this.ssuBlockStatus = ssuBlockStatus;
    }

    @JsonProperty("legalBlockStatus")
    public String getLegalBlockStatus() {
        return legalBlockStatus;
    }

    @JsonProperty("legalBlockStatus")
    public void setLegalBlockStatus(String legalBlockStatus) {
        this.legalBlockStatus = legalBlockStatus;
    }

    @JsonProperty("effENFBlockDate")
    public String getEffENFBlockDate() {
        return effENFBlockDate;
    }

    @JsonProperty("effENFBlockDate")
    public void setEffENFBlockDate(String effENFBlockDate) {
        this.effENFBlockDate = effENFBlockDate;
    }

    @JsonProperty("effENFBlockDateFlag")
    public String getEffENFBlockDateFlag() {
        return effENFBlockDateFlag;
    }

    @JsonProperty("effENFBlockDateFlag")
    public void setEffENFBlockDateFlag(String effENFBlockDateFlag) {
        this.effENFBlockDateFlag = effENFBlockDateFlag;
    }

    @JsonProperty("effSSUBlockDate")
    public String getEffSSUBlockDate() {
        return effSSUBlockDate;
    }

    @JsonProperty("effSSUBlockDate")
    public void setEffSSUBlockDate(String effSSUBlockDate) {
        this.effSSUBlockDate = effSSUBlockDate;
    }

    @JsonProperty("effSSUBlockDateFlag")
    public String getEffSSUBlockDateFlag() {
        return effSSUBlockDateFlag;
    }

    @JsonProperty("effSSUBlockDateFlag")
    public void setEffSSUBlockDateFlag(String effSSUBlockDateFlag) {
        this.effSSUBlockDateFlag = effSSUBlockDateFlag;
    }

    @JsonProperty("effLegalBlockDate")
    public String getEffLegalBlockDate() {
        return effLegalBlockDate;
    }

    @JsonProperty("effLegalBlockDate")
    public void setEffLegalBlockDate(String effLegalBlockDate) {
        this.effLegalBlockDate = effLegalBlockDate;
    }

    @JsonProperty("effLegalBlockDateFlag")
    public String getEffLegalBlockDateFlag() {
        return effLegalBlockDateFlag;
    }

    @JsonProperty("effLegalBlockDateFlag")
    public void setEffLegalBlockDateFlag(String effLegalBlockDateFlag) {
        this.effLegalBlockDateFlag = effLegalBlockDateFlag;
    }

    @JsonProperty("enfBlockReasonStat")
    public String getEnfBlockReasonStat() {
        return enfBlockReasonStat;
    }

    @JsonProperty("enfBlockReasonStat")
    public void setEnfBlockReasonStat(String enfBlockReasonStat) {
        this.enfBlockReasonStat = enfBlockReasonStat;
    }

    @JsonProperty("ssuBlockReasonStat")
    public String getSsuBlockReasonStat() {
        return ssuBlockReasonStat;
    }

    @JsonProperty("ssuBlockReasonStat")
    public void setSsuBlockReasonStat(String ssuBlockReasonStat) {
        this.ssuBlockReasonStat = ssuBlockReasonStat;
    }

    @JsonProperty("legalBlockReasonStat")
    public String getLegalBlockReasonStat() {
        return legalBlockReasonStat;
    }

    @JsonProperty("legalBlockReasonStat")
    public void setLegalBlockReasonStat(String legalBlockReasonStat) {
        this.legalBlockReasonStat = legalBlockReasonStat;
    }

    @JsonProperty("enfStopPeriod")
    public String getEnfStopPeriod() {
        return enfStopPeriod;
    }

    @JsonProperty("enfStopPeriod")
    public void setEnfStopPeriod(String enfStopPeriod) {
        this.enfStopPeriod = enfStopPeriod;
    }

    @JsonProperty("ssuStopPeriod")
    public String getSsuStopPeriod() {
        return ssuStopPeriod;
    }

    @JsonProperty("ssuStopPeriod")
    public void setSsuStopPeriod(String ssuStopPeriod) {
        this.ssuStopPeriod = ssuStopPeriod;
    }

    @JsonProperty("enfBlockDate")
    public String getEnfBlockDate() {
        return enfBlockDate;
    }

    @JsonProperty("enfBlockDate")
    public void setEnfBlockDate(String enfBlockDate) {
        this.enfBlockDate = enfBlockDate;
    }

    @JsonProperty("ssuBlockLetterNumber")
    public String getSsuBlockLetterNumber() {
        return ssuBlockLetterNumber;
    }

    @JsonProperty("ssuBlockLetterNumber")
    public void setSsuBlockLetterNumber(String ssuBlockLetterNumber) {
        this.ssuBlockLetterNumber = ssuBlockLetterNumber;
    }

    @JsonProperty("legalBlockLetterNumber")
    public String getLegalBlockLetterNumber() {
        return legalBlockLetterNumber;
    }

    @JsonProperty("legalBlockLetterNumber")
    public void setLegalBlockLetterNumber(String legalBlockLetterNumber) {
        this.legalBlockLetterNumber = legalBlockLetterNumber;
    }

    @JsonProperty("ssuBlockLetterDate")
    public String getSsuBlockLetterDate() {
        return ssuBlockLetterDate;
    }

    @JsonProperty("ssuBlockLetterDate")
    public void setSsuBlockLetterDate(String ssuBlockLetterDate) {
        this.ssuBlockLetterDate = ssuBlockLetterDate;
    }

    @JsonProperty("legalBlockLetterDate")
    public String getLegalBlockLetterDate() {
        return legalBlockLetterDate;
    }

    @JsonProperty("legalBlockLetterDate")
    public void setLegalBlockLetterDate(String legalBlockLetterDate) {
        this.legalBlockLetterDate = legalBlockLetterDate;
    }

    @JsonProperty("ssuBlockNote")
    public String getSsuBlockNote() {
        return ssuBlockNote;
    }

    @JsonProperty("ssuBlockNote")
    public void setSsuBlockNote(String ssuBlockNote) {
        this.ssuBlockNote = ssuBlockNote;
    }

    @JsonProperty("legalBlockNote")
    public String getLegalBlockNote() {
        return legalBlockNote;
    }

    @JsonProperty("legalBlockNote")
    public void setLegalBlockNote(String legalBlockNote) {
        this.legalBlockNote = legalBlockNote;
    }

    @JsonProperty("lastAccountStatDate")
    public String getLastAccountStatDate() {
        return lastAccountStatDate;
    }

    @JsonProperty("lastAccountStatDate")
    public void setLastAccountStatDate(String lastAccountStatDate) {
        this.lastAccountStatDate = lastAccountStatDate;
    }

    @JsonProperty("highRiskAccount")
    public String getHighRiskAccount() {
        return highRiskAccount;
    }

    @JsonProperty("highRiskAccount")
    public void setHighRiskAccount(String highRiskAccount) {
        this.highRiskAccount = highRiskAccount;
    }

    @JsonProperty("fatcaFreeze")
    public String getFatcaFreeze() {
        return fatcaFreeze;
    }

    @JsonProperty("fatcaFreeze")
    public void setFatcaFreeze(String fatcaFreeze) {
        this.fatcaFreeze = fatcaFreeze;
    }

    @JsonProperty("workFlowFlag")
    public String getWorkFlowFlag() {
        return workFlowFlag;
    }

    @JsonProperty("workFlowFlag")
    public void setWorkFlowFlag(String workFlowFlag) {
        this.workFlowFlag = workFlowFlag;
    }

	@Override
	public String toString() {
		return "AccountStatusAmendmentSuccess [accountNumber=" + accountNumber + ", currentStatus=" + currentStatus
				+ ", newStatus=" + newStatus + ", currentKYCStatus=" + currentKYCStatus + ", newKYCStatus="
				+ newKYCStatus + ", currentSamaStatus=" + currentSamaStatus + ", newSamaStatus=" + newSamaStatus
				+ ", reasonAccountStatus=" + reasonAccountStatus + ", reasonSamaStatus=" + reasonSamaStatus
				+ ", reasonKYCStatus=" + reasonKYCStatus + ", kycUnfreezeDate=" + kycUnfreezeDate + ", letterNumber="
				+ letterNumber + ", letterDate=" + letterDate + ", blockDate=" + blockDate + ", note=" + note
				+ ", inacStat=" + inacStat + ", enfBlockStatus=" + enfBlockStatus + ", ssuBlockStatus=" + ssuBlockStatus
				+ ", legalBlockStatus=" + legalBlockStatus + ", effENFBlockDate=" + effENFBlockDate
				+ ", effENFBlockDateFlag=" + effENFBlockDateFlag + ", effSSUBlockDate=" + effSSUBlockDate
				+ ", effSSUBlockDateFlag=" + effSSUBlockDateFlag + ", effLegalBlockDate=" + effLegalBlockDate
				+ ", effLegalBlockDateFlag=" + effLegalBlockDateFlag + ", enfBlockReasonStat=" + enfBlockReasonStat
				+ ", ssuBlockReasonStat=" + ssuBlockReasonStat + ", legalBlockReasonStat=" + legalBlockReasonStat
				+ ", enfStopPeriod=" + enfStopPeriod + ", ssuStopPeriod=" + ssuStopPeriod + ", enfBlockDate="
				+ enfBlockDate + ", ssuBlockLetterNumber=" + ssuBlockLetterNumber + ", legalBlockLetterNumber="
				+ legalBlockLetterNumber + ", ssuBlockLetterDate=" + ssuBlockLetterDate + ", legalBlockLetterDate="
				+ legalBlockLetterDate + ", ssuBlockNote=" + ssuBlockNote + ", legalBlockNote=" + legalBlockNote
				+ ", lastAccountStatDate=" + lastAccountStatDate + ", highRiskAccount=" + highRiskAccount
				+ ", fatcaFreeze=" + fatcaFreeze + ", workFlowFlag=" + workFlowFlag + "]";
	}

}
