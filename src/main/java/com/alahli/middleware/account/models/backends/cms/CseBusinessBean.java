package com.alahli.middleware.account.models.backends.cms;

import java.util.Objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "arg0", propOrder = {"iNPUTMESSAGE","sERVICEID"})
@XmlRootElement(name = "arg0", namespace = "")
public class CseBusinessBean {
	
	@XmlAttribute(name = "logcontexttoken")
    protected String logContextToken;
	
	@XmlElement(name = "INPUTMESSAGE")
    private String iNPUTMESSAGE;
	
	@XmlElement(name = "SERVICEID")
    private String sERVICEID;

	public String getLogContextToken() {
		return logContextToken;
	}

	public void setLogContextToken(String logContextToken) {
		this.logContextToken = logContextToken;
	}

	public String getiNPUTMESSAGE() {
		return iNPUTMESSAGE;
	}

	public void setiNPUTMESSAGE(String iNPUTMESSAGE) {
		this.iNPUTMESSAGE = iNPUTMESSAGE;
	}

	public String getsERVICEID() {
		return sERVICEID;
	}

	public void setsERVICEID(String sERVICEID) {
		this.sERVICEID = sERVICEID;
	}

	@Override
	public String toString() {
		return "GetCMSAccountTransactionsArg0 [logContextToken=" + logContextToken + ", iNPUTMESSAGE=" + iNPUTMESSAGE
				+ ", sERVICEID=" + sERVICEID + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(iNPUTMESSAGE, logContextToken, sERVICEID);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CseBusinessBean other = (CseBusinessBean) obj;
		return Objects.equals(iNPUTMESSAGE, other.iNPUTMESSAGE)
				&& Objects.equals(logContextToken, other.logContextToken) && Objects.equals(sERVICEID, other.sERVICEID);
	}
	
}
