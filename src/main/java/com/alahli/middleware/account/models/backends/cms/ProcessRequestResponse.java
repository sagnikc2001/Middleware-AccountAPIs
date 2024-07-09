
package com.alahli.middleware.account.models.backends.cms;

import java.util.Objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"_return","success"})
@XmlRootElement(name = "processRequestResponse", namespace = "http://web.cse.com/")
public class ProcessRequestResponse {
	
	@XmlAttribute(name = "logcontexttoken")
    protected String logContextToken;

	@XmlElement(name = "return")
    protected String _return;

	@XmlElement(name = "success")
    protected CMSMaintenanceSuccessType success;
	
	public String getLogContextToken() {
		return logContextToken;
	}
	public void setLogContextToken(String logContextToken) {
		this.logContextToken = logContextToken;
	}
	public String get_return() {
		return _return;
	}
	public void set_return(String _return) {
		this._return = _return;
	}
	public CMSMaintenanceSuccessType getSuccess() {
		return success;
	}
	public void setSuccess(CMSMaintenanceSuccessType success) {
		this.success = success;
	}
	@Override
	public String toString() {
		return "ProcessRequestResponse [logContextToken=" + logContextToken + ", _return=" + _return + ", success="
				+ success + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(_return, logContextToken, success);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProcessRequestResponse other = (ProcessRequestResponse) obj;
		return Objects.equals(_return, other._return) && Objects.equals(logContextToken, other.logContextToken)
				&& Objects.equals(success, other.success);
	}

}
