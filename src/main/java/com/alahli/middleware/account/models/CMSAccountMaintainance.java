package com.alahli.middleware.account.models;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "CMSAccountsRequest",
    "CMSAccountMaintenanceResponse"
})
public class CMSAccountMaintainance {
	
	@JsonProperty("CMSAccountsRequest")
	private CMSAccountMaintenanceRequest cMSAccountMaintenanceRequest;
	
	@JsonProperty("CMSAccountMaintenanceResponse")
	private CMSAccountMaintenanceResponse cMSAccountMaintenanceResponse;

	public CMSAccountMaintenanceRequest getcMSAccountMaintenanceRequest() {
		return cMSAccountMaintenanceRequest;
	}

	public void setcMSAccountMaintenanceRequest(CMSAccountMaintenanceRequest cMSAccountMaintenanceRequest) {
		this.cMSAccountMaintenanceRequest = cMSAccountMaintenanceRequest;
	}

	public CMSAccountMaintenanceResponse getcMSAccountMaintenanceResponse() {
		return cMSAccountMaintenanceResponse;
	}

	public void setcMSAccountMaintenanceResponse(CMSAccountMaintenanceResponse cMSAccountMaintenanceResponse) {
		this.cMSAccountMaintenanceResponse = cMSAccountMaintenanceResponse;
	}

	public CMSAccountMaintainance() {
		super();
	}

	public CMSAccountMaintainance(CMSAccountMaintenanceRequest cMSAccountMaintenanceRequest,
			CMSAccountMaintenanceResponse cMSAccountMaintenanceResponse) {
		super();
		this.cMSAccountMaintenanceRequest = cMSAccountMaintenanceRequest;
		this.cMSAccountMaintenanceResponse = cMSAccountMaintenanceResponse;
	}

	@Override
	public String toString() {
		return "CMSAccountMaintainance [cMSAccountMaintenanceRequest=" + cMSAccountMaintenanceRequest
				+ ", cMSAccountMaintenanceResponse=" + cMSAccountMaintenanceResponse + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cMSAccountMaintenanceRequest, cMSAccountMaintenanceResponse);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CMSAccountMaintainance other = (CMSAccountMaintainance) obj;
		return Objects.equals(cMSAccountMaintenanceRequest, other.cMSAccountMaintenanceRequest)
				&& Objects.equals(cMSAccountMaintenanceResponse, other.cMSAccountMaintenanceResponse);
	}

}
