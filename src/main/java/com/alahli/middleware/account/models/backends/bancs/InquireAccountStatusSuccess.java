
package com.alahli.middleware.account.models.backends.bancs;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ACCNT_NUMBER",
    "CURRENT_STATUS",
    "NEW_STATUS",
    "CURR_KYC_STATUS",
    "NEW_KYC_STATUS",
    "CURR_SAMA_STATUS",
    "NEW_SAMA_STATUS",
    "REASON_ACCT_STATUS",
    "REASON_SAMA_STATUS",
    "REASON_KYC_STATUS",
    "KYC_UNFREEZE_DATE",
    "LETTER_NO",
    "LETTER_DATE",
    "BLOCK_DATE",
    "NOTE",
    "INAC_STAT",
    "ENF_BLOCK_STATUS",
    "SSU_BLOCK_STATUS",
    "LEGAL_BLOCK_STATUS",
    "EFF_ENF_BLOCK_DATE",
    "EFF_ENF_BLOCK_DATE_FLAG",
    "EFF_SSU_BLOCK_DATE",
    "EFF_SSU_BLOCK_DATE_FLAG",
    "EFF_LEGAL_BLOCK_DATE",
    "EFF_LEGAL_BLOCK_DATE_FLAG",
    "ENF_BLOCK_REASON_STAT",
    "SSU_BLOCK_REASON_STAT",
    "LEGAL_BLOCK_REASON_STAT",
    "ENF_STOP_PERIOD",
    "SSU_STOP_PERIOD",
    "ENF_BLOCK_DATE",
    "SSU_BLOCK_LETTER_NO",
    "LEGAL_BLOCK_LETTER_NO",
    "SSU_BLOCK_LTTR_DATE",
    "LEGAL_BLOCK_LTTR_DATE",
    "SSU_BLOCK_NOTE",
    "LEGAL_BLOCK_NOTE",
    "LST_ACCT_STAT_DATE",
    "HIGH_RISK_ACCT",
    "FATCA_FREZE",
    "WORK_FLOW_FLAG",
    "REASON_PEND_ACTIVE_STAT",
    "KYC_CRITERIA_FLAG",
    "IDENTIFIER_FLAG"
})
public class InquireAccountStatusSuccess {

	@JsonProperty("ACCNT_NUMBER")
    private String accntNumber;
    
    @JsonProperty("CURRENT_STATUS")
    private String currentStatus;
    
    @JsonProperty("NEW_STATUS")
    private String newStatus;
    
    @JsonProperty("CURR_KYC_STATUS")
    private String currKycStatus;
    
    @JsonProperty("NEW_KYC_STATUS")
    private String newKycStatus;
    
    @JsonProperty("CURR_SAMA_STATUS")
    private String currSamaStatus;
    
    @JsonProperty("NEW_SAMA_STATUS")
    private String newSamaStatus;
    
    @JsonProperty("REASON_ACCT_STATUS")
    private String reasonAcctStatus;
    
    @JsonProperty("REASON_SAMA_STATUS")
    private String reasonSamaStatus;
    
    @JsonProperty("REASON_KYC_STATUS")
    private String reasonKycStatus;
    
    @JsonProperty("KYC_UNFREEZE_DATE")
    private String kycUnfreezeDate;
    
    @JsonProperty("LETTER_NO")
    private String letterNo;
    
    @JsonProperty("LETTER_DATE")
    private String letterDate;
    
    @JsonProperty("BLOCK_DATE")
    private String blockDate;
    
    @JsonProperty("NOTE")
    private String note;
    
    @JsonProperty("INAC_STAT")
    private String inacStat;
    
    @JsonProperty("ENF_BLOCK_STATUS")
    private String enfBlockStatus;
    
    @JsonProperty("SSU_BLOCK_STATUS")
    private String ssuBlockStatus;
    
    @JsonProperty("LEGAL_BLOCK_STATUS")
    private String legalBlockStatus;
    
    @JsonProperty("EFF_ENF_BLOCK_DATE")
    private String effEnfBlockDate;
    
    @JsonProperty("EFF_ENF_BLOCK_DATE_FLAG")
    private String effEnfBlockDateFlag;
    
    @JsonProperty("EFF_SSU_BLOCK_DATE")
    private String effSsuBlockDate;
    
    @JsonProperty("EFF_SSU_BLOCK_DATE_FLAG")
    private String effSsuBlockDateFlag;
    
    @JsonProperty("EFF_LEGAL_BLOCK_DATE")
    private String effLegalBlockDate;
    
    @JsonProperty("EFF_LEGAL_BLOCK_DATE_FLAG")
    private String effLegalBlockDateFlag;
    
    @JsonProperty("ENF_BLOCK_REASON_STAT")
    private String enfBlockReasonStat;
    
    @JsonProperty("SSU_BLOCK_REASON_STAT")
    private String ssuBlockReasonStat;
    
    @JsonProperty("LEGAL_BLOCK_REASON_STAT")
    private String legalBlockReasonStat;
    
    @JsonProperty("ENF_STOP_PERIOD")
    private String enfStopPeriod;
    
    @JsonProperty("SSU_STOP_PERIOD")
    private String ssuStopPeriod;
    
    @JsonProperty("ENF_BLOCK_DATE")
    private String enfBlockDate;
    
    @JsonProperty("SSU_BLOCK_LETTER_NO")
    private String ssuBlockLetterNo;
    
    @JsonProperty("LEGAL_BLOCK_LETTER_NO")
    private String legalBlockLetterNo;
    
    @JsonProperty("SSU_BLOCK_LTTR_DATE")
    private String ssuBlockLttrDate;
    
    @JsonProperty("LEGAL_BLOCK_LTTR_DATE")
    private String legalBlockLttrDate;
    
    @JsonProperty("SSU_BLOCK_NOTE")
    private String ssuBlockNote;
    
    @JsonProperty("LEGAL_BLOCK_NOTE")
    private String legalBlockNote;
    
    @JsonProperty("LST_ACCT_STAT_DATE")
    private String lstAcctStatDate;
    
    @JsonProperty("HIGH_RISK_ACCT")
    private String highRiskAcct;
    
    @JsonProperty("FATCA_FREZE")
    private String fatcaFreze;
    
    @JsonProperty("WORK_FLOW_FLAG")
    private String workFlowFlag;
    
    @JsonProperty("REASON_PEND_ACTIVE_STAT")
    private String reasonPendActiveStat;
    
    @JsonProperty("KYC_CRITERIA_FLAG")
    private String kycCriteriaFlag;
    
    @JsonProperty("IDENTIFIER_FLAG")
    private String identifierFlag;

	public String getAccntNumber() {
		return accntNumber;
	}

	public void setAccntNumber(String accntNumber) {
		this.accntNumber = accntNumber;
	}

	public String getCurrentStatus() {
		return currentStatus;
	}

	public void setCurrentStatus(String currentStatus) {
		this.currentStatus = currentStatus;
	}

	public String getNewStatus() {
		return newStatus;
	}

	public void setNewStatus(String newStatus) {
		this.newStatus = newStatus;
	}

	public String getCurrKycStatus() {
		return currKycStatus;
	}

	public void setCurrKycStatus(String currKycStatus) {
		this.currKycStatus = currKycStatus;
	}

	public String getNewKycStatus() {
		return newKycStatus;
	}

	public void setNewKycStatus(String newKycStatus) {
		this.newKycStatus = newKycStatus;
	}

	public String getCurrSamaStatus() {
		return currSamaStatus;
	}

	public void setCurrSamaStatus(String currSamaStatus) {
		this.currSamaStatus = currSamaStatus;
	}

	public String getNewSamaStatus() {
		return newSamaStatus;
	}

	public void setNewSamaStatus(String newSamaStatus) {
		this.newSamaStatus = newSamaStatus;
	}

	public String getReasonAcctStatus() {
		return reasonAcctStatus;
	}

	public void setReasonAcctStatus(String reasonAcctStatus) {
		this.reasonAcctStatus = reasonAcctStatus;
	}

	public String getReasonSamaStatus() {
		return reasonSamaStatus;
	}

	public void setReasonSamaStatus(String reasonSamaStatus) {
		this.reasonSamaStatus = reasonSamaStatus;
	}

	public String getReasonKycStatus() {
		return reasonKycStatus;
	}

	public void setReasonKycStatus(String reasonKycStatus) {
		this.reasonKycStatus = reasonKycStatus;
	}

	public String getKycUnfreezeDate() {
		return kycUnfreezeDate;
	}

	public void setKycUnfreezeDate(String kycUnfreezeDate) {
		this.kycUnfreezeDate = kycUnfreezeDate;
	}

	public String getLetterNo() {
		return letterNo;
	}

	public void setLetterNo(String letterNo) {
		this.letterNo = letterNo;
	}

	public String getLetterDate() {
		return letterDate;
	}

	public void setLetterDate(String letterDate) {
		this.letterDate = letterDate;
	}

	public String getBlockDate() {
		return blockDate;
	}

	public void setBlockDate(String blockDate) {
		this.blockDate = blockDate;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getInacStat() {
		return inacStat;
	}

	public void setInacStat(String inacStat) {
		this.inacStat = inacStat;
	}

	public String getEnfBlockStatus() {
		return enfBlockStatus;
	}

	public void setEnfBlockStatus(String enfBlockStatus) {
		this.enfBlockStatus = enfBlockStatus;
	}

	public String getSsuBlockStatus() {
		return ssuBlockStatus;
	}

	public void setSsuBlockStatus(String ssuBlockStatus) {
		this.ssuBlockStatus = ssuBlockStatus;
	}

	public String getLegalBlockStatus() {
		return legalBlockStatus;
	}

	public void setLegalBlockStatus(String legalBlockStatus) {
		this.legalBlockStatus = legalBlockStatus;
	}

	public String getEffEnfBlockDate() {
		return effEnfBlockDate;
	}

	public void setEffEnfBlockDate(String effEnfBlockDate) {
		this.effEnfBlockDate = effEnfBlockDate;
	}

	public String getEffEnfBlockDateFlag() {
		return effEnfBlockDateFlag;
	}

	public void setEffEnfBlockDateFlag(String effEnfBlockDateFlag) {
		this.effEnfBlockDateFlag = effEnfBlockDateFlag;
	}

	public String getEffSsuBlockDate() {
		return effSsuBlockDate;
	}

	public void setEffSsuBlockDate(String effSsuBlockDate) {
		this.effSsuBlockDate = effSsuBlockDate;
	}

	public String getEffSsuBlockDateFlag() {
		return effSsuBlockDateFlag;
	}

	public void setEffSsuBlockDateFlag(String effSsuBlockDateFlag) {
		this.effSsuBlockDateFlag = effSsuBlockDateFlag;
	}

	public String getEffLegalBlockDate() {
		return effLegalBlockDate;
	}

	public void setEffLegalBlockDate(String effLegalBlockDate) {
		this.effLegalBlockDate = effLegalBlockDate;
	}

	public String getEffLegalBlockDateFlag() {
		return effLegalBlockDateFlag;
	}

	public void setEffLegalBlockDateFlag(String effLegalBlockDateFlag) {
		this.effLegalBlockDateFlag = effLegalBlockDateFlag;
	}

	public String getEnfBlockReasonStat() {
		return enfBlockReasonStat;
	}

	public void setEnfBlockReasonStat(String enfBlockReasonStat) {
		this.enfBlockReasonStat = enfBlockReasonStat;
	}

	public String getSsuBlockReasonStat() {
		return ssuBlockReasonStat;
	}

	public void setSsuBlockReasonStat(String ssuBlockReasonStat) {
		this.ssuBlockReasonStat = ssuBlockReasonStat;
	}

	public String getLegalBlockReasonStat() {
		return legalBlockReasonStat;
	}

	public void setLegalBlockReasonStat(String legalBlockReasonStat) {
		this.legalBlockReasonStat = legalBlockReasonStat;
	}

	public String getEnfStopPeriod() {
		return enfStopPeriod;
	}

	public void setEnfStopPeriod(String enfStopPeriod) {
		this.enfStopPeriod = enfStopPeriod;
	}

	public String getSsuStopPeriod() {
		return ssuStopPeriod;
	}

	public void setSsuStopPeriod(String ssuStopPeriod) {
		this.ssuStopPeriod = ssuStopPeriod;
	}

	public String getEnfBlockDate() {
		return enfBlockDate;
	}

	public void setEnfBlockDate(String enfBlockDate) {
		this.enfBlockDate = enfBlockDate;
	}

	public String getSsuBlockLetterNo() {
		return ssuBlockLetterNo;
	}

	public void setSsuBlockLetterNo(String ssuBlockLetterNo) {
		this.ssuBlockLetterNo = ssuBlockLetterNo;
	}

	public String getLegalBlockLetterNo() {
		return legalBlockLetterNo;
	}

	public void setLegalBlockLetterNo(String legalBlockLetterNo) {
		this.legalBlockLetterNo = legalBlockLetterNo;
	}

	public String getSsuBlockLttrDate() {
		return ssuBlockLttrDate;
	}

	public void setSsuBlockLttrDate(String ssuBlockLttrDate) {
		this.ssuBlockLttrDate = ssuBlockLttrDate;
	}

	public String getLegalBlockLttrDate() {
		return legalBlockLttrDate;
	}

	public void setLegalBlockLttrDate(String legalBlockLttrDate) {
		this.legalBlockLttrDate = legalBlockLttrDate;
	}

	public String getSsuBlockNote() {
		return ssuBlockNote;
	}

	public void setSsuBlockNote(String ssuBlockNote) {
		this.ssuBlockNote = ssuBlockNote;
	}

	public String getLegalBlockNote() {
		return legalBlockNote;
	}

	public void setLegalBlockNote(String legalBlockNote) {
		this.legalBlockNote = legalBlockNote;
	}

	public String getLstAcctStatDate() {
		return lstAcctStatDate;
	}

	public void setLstAcctStatDate(String lstAcctStatDate) {
		this.lstAcctStatDate = lstAcctStatDate;
	}

	public String getHighRiskAcct() {
		return highRiskAcct;
	}

	public void setHighRiskAcct(String highRiskAcct) {
		this.highRiskAcct = highRiskAcct;
	}

	public String getFatcaFreze() {
		return fatcaFreze;
	}

	public void setFatcaFreze(String fatcaFreze) {
		this.fatcaFreze = fatcaFreze;
	}

	public String getWorkFlowFlag() {
		return workFlowFlag;
	}

	public void setWorkFlowFlag(String workFlowFlag) {
		this.workFlowFlag = workFlowFlag;
	}

	public String getReasonPendActiveStat() {
		return reasonPendActiveStat;
	}

	public void setReasonPendActiveStat(String reasonPendActiveStat) {
		this.reasonPendActiveStat = reasonPendActiveStat;
	}

	public String getKycCriteriaFlag() {
		return kycCriteriaFlag;
	}

	public void setKycCriteriaFlag(String kycCriteriaFlag) {
		this.kycCriteriaFlag = kycCriteriaFlag;
	}

	public String getIdentifierFlag() {
		return identifierFlag;
	}

	public void setIdentifierFlag(String identifierFlag) {
		this.identifierFlag = identifierFlag;
	}

	@Override
	public String toString() {
		return "InquireAccountStatusSuccess [accntNumber=" + accntNumber + ", currentStatus=" + currentStatus
				+ ", newStatus=" + newStatus + ", currKycStatus=" + currKycStatus + ", newKycStatus=" + newKycStatus
				+ ", currSamaStatus=" + currSamaStatus + ", newSamaStatus=" + newSamaStatus + ", reasonAcctStatus="
				+ reasonAcctStatus + ", reasonSamaStatus=" + reasonSamaStatus + ", reasonKycStatus=" + reasonKycStatus
				+ ", kycUnfreezeDate=" + kycUnfreezeDate + ", letterNo=" + letterNo + ", letterDate=" + letterDate
				+ ", blockDate=" + blockDate + ", note=" + note + ", inacStat=" + inacStat + ", enfBlockStatus="
				+ enfBlockStatus + ", ssuBlockStatus=" + ssuBlockStatus + ", legalBlockStatus=" + legalBlockStatus
				+ ", effEnfBlockDate=" + effEnfBlockDate + ", effEnfBlockDateFlag=" + effEnfBlockDateFlag
				+ ", effSsuBlockDate=" + effSsuBlockDate + ", effSsuBlockDateFlag=" + effSsuBlockDateFlag
				+ ", effLegalBlockDate=" + effLegalBlockDate + ", effLegalBlockDateFlag=" + effLegalBlockDateFlag
				+ ", enfBlockReasonStat=" + enfBlockReasonStat + ", ssuBlockReasonStat=" + ssuBlockReasonStat
				+ ", legalBlockReasonStat=" + legalBlockReasonStat + ", enfStopPeriod=" + enfStopPeriod
				+ ", ssuStopPeriod=" + ssuStopPeriod + ", enfBlockDate=" + enfBlockDate + ", ssuBlockLetterNo="
				+ ssuBlockLetterNo + ", legalBlockLetterNo=" + legalBlockLetterNo + ", ssuBlockLttrDate="
				+ ssuBlockLttrDate + ", legalBlockLttrDate=" + legalBlockLttrDate + ", ssuBlockNote=" + ssuBlockNote
				+ ", legalBlockNote=" + legalBlockNote + ", lstAcctStatDate=" + lstAcctStatDate + ", highRiskAcct="
				+ highRiskAcct + ", fatcaFreze=" + fatcaFreze + ", workFlowFlag=" + workFlowFlag
				+ ", reasonPendActiveStat=" + reasonPendActiveStat + ", kycCriteriaFlag=" + kycCriteriaFlag
				+ ", identifierFlag=" + identifierFlag + "]";
	}
	
}
