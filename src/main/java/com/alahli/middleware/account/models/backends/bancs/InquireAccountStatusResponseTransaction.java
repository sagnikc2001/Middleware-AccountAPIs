
package com.alahli.middleware.account.models.backends.bancs;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "accntNumber1",
    "currentStatus",
    "newStatus",
    "currKycStatus",
    "newKycStatus",
    "currSamaStatus",
    "newSamaStatus",
    "reasonAcctStatus",
    "reasonSamaStatus",
    "reasonKycStatus",
    "kycUnfreezeDate",
    "letterNo",
    "letterDate",
    "blockDate",
    "note",
    "inacStat",
    "enfBlockStatus",
    "ssuBlockStatus",
    "legalBlockStatus",
    "effEnfBlockDate",
    "effEnfBlockDateFlag",
    "effSsuBlockDate",
    "effSsuBlockDateFlag",
    "effLegalBlockDate",
    "effLegalBlockDateFlag",
    "enfBlockReasonStat",
    "ssuBlockReasonStat",
    "legalBlockReasonStat",
    "enfStopPeriod",
    "ssuStopPeriod",
    "enfBlockDate",
    "ssuBlockLetterNo",
    "legalBlockLetterNo",
    "ssuBlockLttrDate",
    "legalBlockLttrDate",
    "ssuBlockNote",
    "legalBlockNote",
    "lstAcctStatDate",
    "highRiskAcct",
    "fatcaFreze",
    "workFlowFlag",
    "reasonPendActiveStat",
    "kycCriteriaFlag",
    "identifierFlag"
})
public class InquireAccountStatusResponseTransaction {

    @JsonProperty("accntNumber1")
    private String accntNumber1;
    
    @JsonProperty("currentStatus")
    private String currentStatus;
    
    @JsonProperty("newStatus")
    private String newStatus;
    
    @JsonProperty("currKycStatus")
    private String currKycStatus;
    
    @JsonProperty("newKycStatus")
    private String newKycStatus;
    
    @JsonProperty("currSamaStatus")
    private String currSamaStatus;
    
    @JsonProperty("newSamaStatus")
    private String newSamaStatus;
    
    @JsonProperty("reasonAcctStatus")
    private String reasonAcctStatus;
    
    @JsonProperty("reasonSamaStatus")
    private String reasonSamaStatus;
    
    @JsonProperty("reasonKycStatus")
    private String reasonKycStatus;
    
    @JsonProperty("kycUnfreezeDate")
    private String kycUnfreezeDate;
    
    @JsonProperty("letterNo")
    private Object letterNo;
    
    @JsonProperty("letterDate")
    private String letterDate;
    
    @JsonProperty("blockDate")
    private String blockDate;
    
    @JsonProperty("note")
    private Object note;
    
    @JsonProperty("inacStat")
    private String inacStat;
    
    @JsonProperty("enfBlockStatus")
    private String enfBlockStatus;
    
    @JsonProperty("ssuBlockStatus")
    private String ssuBlockStatus;
    
    @JsonProperty("legalBlockStatus")
    private String legalBlockStatus;
    
    @JsonProperty("effEnfBlockDate")
    private String effEnfBlockDate;
    
    @JsonProperty("effEnfBlockDateFlag")
    private Object effEnfBlockDateFlag;
    
    @JsonProperty("effSsuBlockDate")
    private String effSsuBlockDate;
    
    @JsonProperty("effSsuBlockDateFlag")
    private Object effSsuBlockDateFlag;
    
    @JsonProperty("effLegalBlockDate")
    private String effLegalBlockDate;
    
    @JsonProperty("effLegalBlockDateFlag")
    private Object effLegalBlockDateFlag;
    
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
    
    @JsonProperty("ssuBlockLetterNo")
    private Object ssuBlockLetterNo;
    
    @JsonProperty("legalBlockLetterNo")
    private Object legalBlockLetterNo;
    
    @JsonProperty("ssuBlockLttrDate")
    private String ssuBlockLttrDate;
    
    @JsonProperty("legalBlockLttrDate")
    private String legalBlockLttrDate;
    
    @JsonProperty("ssuBlockNote")
    private Object ssuBlockNote;
    
    @JsonProperty("legalBlockNote")
    private Object legalBlockNote;
    
    @JsonProperty("lstAcctStatDate")
    private Object lstAcctStatDate;
    
    @JsonProperty("highRiskAcct")
    private String highRiskAcct;
    
    @JsonProperty("fatcaFreze")
    private String fatcaFreze;
    
    @JsonProperty("workFlowFlag")
    private String workFlowFlag;
    
    @JsonProperty("reasonPendActiveStat")
    private String reasonPendActiveStat;
    
    @JsonProperty("kycCriteriaFlag")
    private String kycCriteriaFlag;
    
    @JsonProperty("identifierFlag")
    private String identifierFlag;

    
    
    @JsonProperty("accntNumber1")
    public String getAccntNumber1() {
        return accntNumber1;
    }

    @JsonProperty("accntNumber1")
    public void setAccntNumber1(String accntNumber1) {
        this.accntNumber1 = accntNumber1;
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

    @JsonProperty("currKycStatus")
    public String getCurrKycStatus() {
        return currKycStatus;
    }

    @JsonProperty("currKycStatus")
    public void setCurrKycStatus(String currKycStatus) {
        this.currKycStatus = currKycStatus;
    }

    @JsonProperty("newKycStatus")
    public String getNewKycStatus() {
        return newKycStatus;
    }

    @JsonProperty("newKycStatus")
    public void setNewKycStatus(String newKycStatus) {
        this.newKycStatus = newKycStatus;
    }

    @JsonProperty("currSamaStatus")
    public String getCurrSamaStatus() {
        return currSamaStatus;
    }

    @JsonProperty("currSamaStatus")
    public void setCurrSamaStatus(String currSamaStatus) {
        this.currSamaStatus = currSamaStatus;
    }

    @JsonProperty("newSamaStatus")
    public String getNewSamaStatus() {
        return newSamaStatus;
    }

    @JsonProperty("newSamaStatus")
    public void setNewSamaStatus(String newSamaStatus) {
        this.newSamaStatus = newSamaStatus;
    }

    @JsonProperty("reasonAcctStatus")
    public String getReasonAcctStatus() {
        return reasonAcctStatus;
    }

    @JsonProperty("reasonAcctStatus")
    public void setReasonAcctStatus(String reasonAcctStatus) {
        this.reasonAcctStatus = reasonAcctStatus;
    }

    @JsonProperty("reasonSamaStatus")
    public String getReasonSamaStatus() {
        return reasonSamaStatus;
    }

    @JsonProperty("reasonSamaStatus")
    public void setReasonSamaStatus(String reasonSamaStatus) {
        this.reasonSamaStatus = reasonSamaStatus;
    }

    @JsonProperty("reasonKycStatus")
    public String getReasonKycStatus() {
        return reasonKycStatus;
    }

    @JsonProperty("reasonKycStatus")
    public void setReasonKycStatus(String reasonKycStatus) {
        this.reasonKycStatus = reasonKycStatus;
    }

    @JsonProperty("kycUnfreezeDate")
    public String getKycUnfreezeDate() {
        return kycUnfreezeDate;
    }

    @JsonProperty("kycUnfreezeDate")
    public void setKycUnfreezeDate(String kycUnfreezeDate) {
        this.kycUnfreezeDate = kycUnfreezeDate;
    }

    @JsonProperty("letterNo")
    public Object getLetterNo() {
        return letterNo;
    }

    @JsonProperty("letterNo")
    public void setLetterNo(Object letterNo) {
        this.letterNo = letterNo;
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
    public Object getNote() {
        return note;
    }

    @JsonProperty("note")
    public void setNote(Object note) {
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

    @JsonProperty("effEnfBlockDate")
    public String getEffEnfBlockDate() {
        return effEnfBlockDate;
    }

    @JsonProperty("effEnfBlockDate")
    public void setEffEnfBlockDate(String effEnfBlockDate) {
        this.effEnfBlockDate = effEnfBlockDate;
    }

    @JsonProperty("effEnfBlockDateFlag")
    public Object getEffEnfBlockDateFlag() {
        return effEnfBlockDateFlag;
    }

    @JsonProperty("effEnfBlockDateFlag")
    public void setEffEnfBlockDateFlag(Object effEnfBlockDateFlag) {
        this.effEnfBlockDateFlag = effEnfBlockDateFlag;
    }

    @JsonProperty("effSsuBlockDate")
    public String getEffSsuBlockDate() {
        return effSsuBlockDate;
    }

    @JsonProperty("effSsuBlockDate")
    public void setEffSsuBlockDate(String effSsuBlockDate) {
        this.effSsuBlockDate = effSsuBlockDate;
    }

    @JsonProperty("effSsuBlockDateFlag")
    public Object getEffSsuBlockDateFlag() {
        return effSsuBlockDateFlag;
    }

    @JsonProperty("effSsuBlockDateFlag")
    public void setEffSsuBlockDateFlag(Object effSsuBlockDateFlag) {
        this.effSsuBlockDateFlag = effSsuBlockDateFlag;
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
    public Object getEffLegalBlockDateFlag() {
        return effLegalBlockDateFlag;
    }

    @JsonProperty("effLegalBlockDateFlag")
    public void setEffLegalBlockDateFlag(Object effLegalBlockDateFlag) {
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

    @JsonProperty("ssuBlockLetterNo")
    public Object getSsuBlockLetterNo() {
        return ssuBlockLetterNo;
    }

    @JsonProperty("ssuBlockLetterNo")
    public void setSsuBlockLetterNo(Object ssuBlockLetterNo) {
        this.ssuBlockLetterNo = ssuBlockLetterNo;
    }

    @JsonProperty("legalBlockLetterNo")
    public Object getLegalBlockLetterNo() {
        return legalBlockLetterNo;
    }

    @JsonProperty("legalBlockLetterNo")
    public void setLegalBlockLetterNo(Object legalBlockLetterNo) {
        this.legalBlockLetterNo = legalBlockLetterNo;
    }

    @JsonProperty("ssuBlockLttrDate")
    public String getSsuBlockLttrDate() {
        return ssuBlockLttrDate;
    }

    @JsonProperty("ssuBlockLttrDate")
    public void setSsuBlockLttrDate(String ssuBlockLttrDate) {
        this.ssuBlockLttrDate = ssuBlockLttrDate;
    }

    @JsonProperty("legalBlockLttrDate")
    public String getLegalBlockLttrDate() {
        return legalBlockLttrDate;
    }

    @JsonProperty("legalBlockLttrDate")
    public void setLegalBlockLttrDate(String legalBlockLttrDate) {
        this.legalBlockLttrDate = legalBlockLttrDate;
    }

    @JsonProperty("ssuBlockNote")
    public Object getSsuBlockNote() {
        return ssuBlockNote;
    }

    @JsonProperty("ssuBlockNote")
    public void setSsuBlockNote(Object ssuBlockNote) {
        this.ssuBlockNote = ssuBlockNote;
    }

    @JsonProperty("legalBlockNote")
    public Object getLegalBlockNote() {
        return legalBlockNote;
    }

    @JsonProperty("legalBlockNote")
    public void setLegalBlockNote(Object legalBlockNote) {
        this.legalBlockNote = legalBlockNote;
    }

    @JsonProperty("lstAcctStatDate")
    public Object getLstAcctStatDate() {
        return lstAcctStatDate;
    }

    @JsonProperty("lstAcctStatDate")
    public void setLstAcctStatDate(Object lstAcctStatDate) {
        this.lstAcctStatDate = lstAcctStatDate;
    }

    @JsonProperty("highRiskAcct")
    public String getHighRiskAcct() {
        return highRiskAcct;
    }

    @JsonProperty("highRiskAcct")
    public void setHighRiskAcct(String highRiskAcct) {
        this.highRiskAcct = highRiskAcct;
    }

    @JsonProperty("fatcaFreze")
    public String getFatcaFreze() {
        return fatcaFreze;
    }

    @JsonProperty("fatcaFreze")
    public void setFatcaFreze(String fatcaFreze) {
        this.fatcaFreze = fatcaFreze;
    }

    @JsonProperty("workFlowFlag")
    public String getWorkFlowFlag() {
        return workFlowFlag;
    }

    @JsonProperty("workFlowFlag")
    public void setWorkFlowFlag(String workFlowFlag) {
        this.workFlowFlag = workFlowFlag;
    }

    @JsonProperty("reasonPendActiveStat")
    public String getReasonPendActiveStat() {
        return reasonPendActiveStat;
    }

    @JsonProperty("reasonPendActiveStat")
    public void setReasonPendActiveStat(String reasonPendActiveStat) {
        this.reasonPendActiveStat = reasonPendActiveStat;
    }

    @JsonProperty("kycCriteriaFlag")
    public String getKycCriteriaFlag() {
        return kycCriteriaFlag;
    }

    @JsonProperty("kycCriteriaFlag")
    public void setKycCriteriaFlag(String kycCriteriaFlag) {
        this.kycCriteriaFlag = kycCriteriaFlag;
    }

    @JsonProperty("identifierFlag")
    public String getIdentifierFlag() {
        return identifierFlag;
    }

    @JsonProperty("identifierFlag")
    public void setIdentifierFlag(String identifierFlag) {
        this.identifierFlag = identifierFlag;
    }

	@Override
	public String toString() {
		return "InquireAccountStatusResponseTransaction [accntNumber1=" + accntNumber1 + ", currentStatus="
				+ currentStatus + ", newStatus=" + newStatus + ", currKycStatus=" + currKycStatus + ", newKycStatus="
				+ newKycStatus + ", currSamaStatus=" + currSamaStatus + ", newSamaStatus=" + newSamaStatus
				+ ", reasonAcctStatus=" + reasonAcctStatus + ", reasonSamaStatus=" + reasonSamaStatus
				+ ", reasonKycStatus=" + reasonKycStatus + ", kycUnfreezeDate=" + kycUnfreezeDate + ", letterNo="
				+ letterNo + ", letterDate=" + letterDate + ", blockDate=" + blockDate + ", note=" + note
				+ ", inacStat=" + inacStat + ", enfBlockStatus=" + enfBlockStatus + ", ssuBlockStatus=" + ssuBlockStatus
				+ ", legalBlockStatus=" + legalBlockStatus + ", effEnfBlockDate=" + effEnfBlockDate
				+ ", effEnfBlockDateFlag=" + effEnfBlockDateFlag + ", effSsuBlockDate=" + effSsuBlockDate
				+ ", effSsuBlockDateFlag=" + effSsuBlockDateFlag + ", effLegalBlockDate=" + effLegalBlockDate
				+ ", effLegalBlockDateFlag=" + effLegalBlockDateFlag + ", enfBlockReasonStat=" + enfBlockReasonStat
				+ ", ssuBlockReasonStat=" + ssuBlockReasonStat + ", legalBlockReasonStat=" + legalBlockReasonStat
				+ ", enfStopPeriod=" + enfStopPeriod + ", ssuStopPeriod=" + ssuStopPeriod + ", enfBlockDate="
				+ enfBlockDate + ", ssuBlockLetterNo=" + ssuBlockLetterNo + ", legalBlockLetterNo=" + legalBlockLetterNo
				+ ", ssuBlockLttrDate=" + ssuBlockLttrDate + ", legalBlockLttrDate=" + legalBlockLttrDate
				+ ", ssuBlockNote=" + ssuBlockNote + ", legalBlockNote=" + legalBlockNote + ", lstAcctStatDate="
				+ lstAcctStatDate + ", highRiskAcct=" + highRiskAcct + ", fatcaFreze=" + fatcaFreze + ", workFlowFlag="
				+ workFlowFlag + ", reasonPendActiveStat=" + reasonPendActiveStat + ", kycCriteriaFlag="
				+ kycCriteriaFlag + ", identifierFlag=" + identifierFlag + "]";
	}
    
}
