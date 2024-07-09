
package com.alahli.middleware.account.models.backends.cms;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import java.util.Objects;

import javax.xml.bind.annotation.XmlAccessType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "processRequest", propOrder = {"arg0"})
@XmlRootElement(name = "processRequest")
public class ProcessRequest {
	
	@XmlAttribute(name = "logcontexttoken")
    protected String logContextToken;

	@XmlElement(name="arg0", namespace = "")
	protected Arg0 arg0;

	public String getLogContextToken() {
		return logContextToken;
	}

	public void setLogContextToken(String logContextToken) {
		this.logContextToken = logContextToken;
	}

	public Arg0 getArg0() {
		return arg0;
	}

	public void setArg0(Arg0 arg0) {
		this.arg0 = arg0;
	}

	@Override
	public String toString() {
		return "ProcessRequest [logContextToken=" + logContextToken + ", arg0=" + arg0 + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(arg0, logContextToken);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProcessRequest other = (ProcessRequest) obj;
		return Objects.equals(arg0, other.arg0) && Objects.equals(logContextToken, other.logContextToken);
	}
	
}
