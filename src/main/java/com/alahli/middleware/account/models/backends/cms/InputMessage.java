
package com.alahli.middleware.account.models.backends.cms;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import java.util.Objects;

import javax.xml.bind.annotation.XmlAccessType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "INPUTMESSAGE", propOrder = {"cMSAccountMaintenanceRequest"})
@XmlRootElement(name = "INPUTMESSAGE")
public class InputMessage {

	@XmlElement(name = "CMSAccountMaintenanceRequest")
    protected CMSAccountMaintenanceRequest cMSAccountMaintenanceRequest;

	public CMSAccountMaintenanceRequest getcMSAccountMaintenanceRequest() {
		return cMSAccountMaintenanceRequest;
	}

	public void setcMSAccountMaintenanceRequest(CMSAccountMaintenanceRequest cMSAccountMaintenanceRequest) {
		this.cMSAccountMaintenanceRequest = cMSAccountMaintenanceRequest;
	}

	@Override
	public String toString() {
		return "INPUTMESSAGE [cMSAccountMaintenanceRequest=" + cMSAccountMaintenanceRequest + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cMSAccountMaintenanceRequest);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InputMessage other = (InputMessage) obj;
		return Objects.equals(cMSAccountMaintenanceRequest, other.cMSAccountMaintenanceRequest);
	}

}
