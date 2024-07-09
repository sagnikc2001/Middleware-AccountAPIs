
package com.alahli.middleware.account.models.backends.cms;

import java.util.Objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoggerContext", propOrder = {})
@XmlRootElement(name = "LoggerContext")
public class LoggerContext {

	@XmlAttribute(name = "headerTimestamp")
    protected String headerTimestamp;
	
	@XmlValue
    protected String context;

	public String getHeaderTimestamp() {
		return headerTimestamp;
	}

	public void setHeaderTimestamp(String headerTimestamp) {
		this.headerTimestamp = headerTimestamp;
	}

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}

	@Override
	public String toString() {
		return "LoggerContext [headerTimestamp=" + headerTimestamp + ", context=" + context + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(context, headerTimestamp);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LoggerContext other = (LoggerContext) obj;
		return Objects.equals(context, other.context) && Objects.equals(headerTimestamp, other.headerTimestamp);
	}
	
}
