package com.alahli.middleware.account.utils;

import java.io.IOException;
import java.io.InputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

@Component
@Scope(value = "request", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class AccountUtils {

	private static DocumentBuilder oDocumentBuilder = null;
	
	private static char delimiter = '\027';

	static {
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		try {
			oDocumentBuilder = dbFactory.newDocumentBuilder();
		} catch (ParserConfigurationException e) {
			System.out.println("documentBuilder: " + e);
		}
	}

	public synchronized Document getDomObject(InputStream payload)
			throws SAXException, IOException, XPathExpressionException {
		Document oDocument = oDocumentBuilder.parse(payload);
		return oDocument;
	}
	
	public String getValueFromCMSResponse(String key, String responseString) {
	    String value = null;
	    key = key + "=";
	    try {
	      value = responseString.substring(responseString.indexOf(key));
	      if (value.indexOf(delimiter) >= 0)
	        value = value.substring(key.length(), value.indexOf(delimiter)); 
	    } catch (Exception e) {
//	      logger.error("Exception in getValueFromCMSResponse module with details and hence the value will be responded as empty string ", e);
	      value = "";
	    } 
	    return value;
	  }

}
