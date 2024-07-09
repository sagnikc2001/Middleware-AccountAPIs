
package com.alahli.middleware.account.models.backends.cms;


import java.util.List;
import java.util.Objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"statusCode","statusDescription","notes","account"})
@XmlRootElement(name = "success")
public class CMSMaintenanceSuccessType {

	@XmlElement(name = "statusCode")
    protected String statusCode;
	
	@XmlElement(name = "statusDescription")
    protected String statusDescription;
	
	@XmlElement(name = "notes")
    protected String notes;
	
	@XmlElement(name = "account")
    protected List<CMSAccountMaintenanceType> account;
	
	
	public String getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
	public String getStatusDescription() {
		return statusDescription;
	}
	public void setStatusDescription(String statusDescription) {
		this.statusDescription = statusDescription;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public List<CMSAccountMaintenanceType> getAccount() {
		return account;
	}
	public void setAccount(List<CMSAccountMaintenanceType> account) {
		this.account = account;
	}
	@Override
	public String toString() {
		return "CMSMaintenanceSuccessType [statusCode=" + statusCode + ", statusDescription=" + statusDescription
				+ ", notes=" + notes + ", account=" + account + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(account, notes, statusCode, statusDescription);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CMSMaintenanceSuccessType other = (CMSMaintenanceSuccessType) obj;
		return Objects.equals(account, other.account) && Objects.equals(notes, other.notes)
				&& Objects.equals(statusCode, other.statusCode)
				&& Objects.equals(statusDescription, other.statusDescription);
	}

}
