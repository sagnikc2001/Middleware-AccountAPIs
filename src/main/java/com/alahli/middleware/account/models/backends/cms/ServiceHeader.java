
package com.alahli.middleware.account.models.backends.cms;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import java.util.Objects;

import javax.xml.bind.annotation.XmlAccessType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceHeader", propOrder = {"loggerContext","transactionCode","retryTransaction","tellerId","terminalId","workstationId","override","correction","supervisor","supervisorId","overrideCode","employeeId","branchId","functionId","channelId","bancsPwd","languageCode","authenticationType"})
@XmlRootElement(name = "ServiceHeader")
public class ServiceHeader {

	@XmlElement(name = "loggerContext")
    protected LoggerContext loggerContext;
	
	@XmlElement(name = "transactionCode")
    protected String transactionCode;
	
	@XmlElement(name = "retryTransaction")
    protected Boolean retryTransaction;
	
	@XmlElement(name = "tellerId")
    protected String tellerId;
	
	@XmlElement(name = "terminalId")
    protected String terminalId;
	
	@XmlElement(name = "workstationId")
    protected String workstationId;
	
	@XmlElement(name = "override")
    protected String override;
	
	@XmlElement(name = "correction")
    protected String correction;
	
	@XmlElement(name = "supervisor")
    protected String supervisor;
	
	@XmlElement(name = "supervisorId")
    protected String supervisorId;
	
	@XmlElement(name = "overrideCode")
    protected String overrideCode;
	
	@XmlElement(name = "employeeId")
    protected String employeeId;
	
	@XmlElement(name = "branchId")
    protected String branchId;
	
	@XmlElement(name = "functionId")
    protected String functionId;
	
	@XmlElement(name = "channelId")
    protected String channelId;
	
	@XmlElement(name = "bancsPwd")
    protected String bancsPwd;
	
	@XmlElement(name = "languageCode")
    protected String languageCode;
	
	@XmlElement(name = "authenticationType")
    protected String authenticationType;
	
	public LoggerContext getLoggerContext() {
		return loggerContext;
	}
	public void setLoggerContext(LoggerContext loggerContext) {
		this.loggerContext = loggerContext;
	}
	public String getTransactionCode() {
		return transactionCode;
	}
	public void setTransactionCode(String transactionCode) {
		this.transactionCode = transactionCode;
	}
	public Boolean getRetryTransaction() {
		return retryTransaction;
	}
	public void setRetryTransaction(Boolean retryTransaction) {
		this.retryTransaction = retryTransaction;
	}
	public String getTellerId() {
		return tellerId;
	}
	public void setTellerId(String tellerId) {
		this.tellerId = tellerId;
	}
	public String getTerminalId() {
		return terminalId;
	}
	public void setTerminalId(String terminalId) {
		this.terminalId = terminalId;
	}
	public String getWorkstationId() {
		return workstationId;
	}
	public void setWorkstationId(String workstationId) {
		this.workstationId = workstationId;
	}
	public String getOverride() {
		return override;
	}
	public void setOverride(String override) {
		this.override = override;
	}
	public String getCorrection() {
		return correction;
	}
	public void setCorrection(String correction) {
		this.correction = correction;
	}
	public String getSupervisor() {
		return supervisor;
	}
	public void setSupervisor(String supervisor) {
		this.supervisor = supervisor;
	}
	public String getSupervisorId() {
		return supervisorId;
	}
	public void setSupervisorId(String supervisorId) {
		this.supervisorId = supervisorId;
	}
	public String getOverrideCode() {
		return overrideCode;
	}
	public void setOverrideCode(String overrideCode) {
		this.overrideCode = overrideCode;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getBranchId() {
		return branchId;
	}
	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}
	public String getFunctionId() {
		return functionId;
	}
	public void setFunctionId(String functionId) {
		this.functionId = functionId;
	}
	public String getChannelId() {
		return channelId;
	}
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}
	public String getBancsPwd() {
		return bancsPwd;
	}
	public void setBancsPwd(String bancsPwd) {
		this.bancsPwd = bancsPwd;
	}
	public String getLanguageCode() {
		return languageCode;
	}
	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}
	public String getAuthenticationType() {
		return authenticationType;
	}
	public void setAuthenticationType(String authenticationType) {
		this.authenticationType = authenticationType;
	}
	@Override
	public String toString() {
		return "ServiceHeader [loggerContext=" + loggerContext + ", transactionCode=" + transactionCode
				+ ", retryTransaction=" + retryTransaction + ", tellerId=" + tellerId + ", terminalId=" + terminalId
				+ ", workstationId=" + workstationId + ", override=" + override + ", correction=" + correction
				+ ", supervisor=" + supervisor + ", supervisorId=" + supervisorId + ", overrideCode=" + overrideCode
				+ ", employeeId=" + employeeId + ", branchId=" + branchId + ", functionId=" + functionId
				+ ", channelId=" + channelId + ", bancsPwd=" + bancsPwd + ", languageCode=" + languageCode
				+ ", authenticationType=" + authenticationType + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(authenticationType, bancsPwd, branchId, channelId, correction, employeeId, functionId,
				languageCode, loggerContext, override, overrideCode, retryTransaction, supervisor, supervisorId,
				tellerId, terminalId, transactionCode, workstationId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ServiceHeader other = (ServiceHeader) obj;
		return Objects.equals(authenticationType, other.authenticationType) && Objects.equals(bancsPwd, other.bancsPwd)
				&& Objects.equals(branchId, other.branchId) && Objects.equals(channelId, other.channelId)
				&& Objects.equals(correction, other.correction) && Objects.equals(employeeId, other.employeeId)
				&& Objects.equals(functionId, other.functionId) && Objects.equals(languageCode, other.languageCode)
				&& Objects.equals(loggerContext, other.loggerContext) && Objects.equals(override, other.override)
				&& Objects.equals(overrideCode, other.overrideCode)
				&& Objects.equals(retryTransaction, other.retryTransaction)
				&& Objects.equals(supervisor, other.supervisor) && Objects.equals(supervisorId, other.supervisorId)
				&& Objects.equals(tellerId, other.tellerId) && Objects.equals(terminalId, other.terminalId)
				&& Objects.equals(transactionCode, other.transactionCode)
				&& Objects.equals(workstationId, other.workstationId);
	}
	
}
