package com.alahli.middleware.account.route.external;

import javax.xml.bind.JAXBContext;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.converter.jaxb.JaxbDataFormat;
import org.apache.camel.model.rest.RestBindingMode;
import org.apache.camel.support.builder.Namespaces;
import org.springframework.stereotype.Component;

import com.alahli.middleware.account.models.CMSAccountTransactions;
import com.alahli.middleware.account.models.backends.cms.GetCMSAccountTransactionsProcessRequest;

@Component
public class GetCMSAccountTransactionsRouteBuilder extends RouteBuilder{
	
	private static Namespaces ns = new Namespaces("ns2", "http://web.cse.com");

	@Override
	public void configure() throws Exception {
		
		restConfiguration()
		.bindingMode(RestBindingMode.json);
		
		rest("/api/accounts")
		.post("/v1/GetCMSAccountTransactions")
		.type(CMSAccountTransactions.class)
		.consumes("application/json")
		.produces("application/json")
		.to("direct:GetCMSAccountTransactions")
		.outType(CMSAccountTransactions.class);
		
		onException(Exception.class)
		.to("bean:oUtils?method=onException(${exchange},\"CMSAccountTransactionsResponse\",${header.system})")
		.handled(true);
		
		JaxbDataFormat getProcessRequest = new JaxbDataFormat();
		JAXBContext jaxconReq = JAXBContext.newInstance(GetCMSAccountTransactionsProcessRequest.class);
		getProcessRequest.setContext(jaxconReq);
		
		from("direct:GetCMSAccountTransactions").routeId("GetCMSAccountTransactions")
		.streamCaching()
		.setHeader("system", constant("MW"))
		.to("bean:getCMSAccountTransactionsService?method=setGetCMSAccountTransactionsRequestIn")
		.to("bean:getCMSAccountTransactionsService?method=prepareProcessRequest")
		
		.marshal(getProcessRequest)
		
		.setHeader("system", constant("CMS"))
		.setHeader("SOAPAction", constant("http://com.tcs.bancs.rm/processRequest"))
		.setHeader("Content-Type", constant("application/xml"))
		.to("{{UDDIConnector.host}}{{UDDIConnector.contextPath}}/cms/v1/ProcessRequest?bridgeEndpoint=true")
		.to("bean:getCMSAccountTransactionsService?method=prepareCMSAccountTransactionsFinalResponse")
		.setHeader("Content-Type", constant("application/json"));
		
	}

}
