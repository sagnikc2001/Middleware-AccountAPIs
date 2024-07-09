package com.alahli.middleware.account.route.external;

import javax.xml.bind.JAXBContext;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.converter.jaxb.JaxbDataFormat;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.stereotype.Component;

import com.alahli.middleware.account.models.CMSAccountMaintainance;
import com.alahli.middleware.account.models.backends.cms.ProcessRequest;

@Component
public class MaintainCMSAccountRouteBuilder extends RouteBuilder {

	@Override
	public void configure() throws Exception {

		restConfiguration()
		.bindingMode(RestBindingMode.json);

		rest("/api/accounts")
		.post("/v1/MaintainCMSAccount")
		.type(CMSAccountMaintainance.class)
		.consumes("application/json")
		.produces("application/json")
		.to("direct:MaintainCMSAccount")
		.outType(CMSAccountMaintainance.class);

		onException(Exception.class)
		.to("bean:oUtils?method=onException(${exchange},\"CMSAccountMaintenanceResponse\",${header.system})")
		.handled(true);

		JaxbDataFormat getProcessRequest = new JaxbDataFormat();
		JAXBContext jaxconReq = JAXBContext.newInstance(ProcessRequest.class);
		getProcessRequest.setContext(jaxconReq);

		from("direct:MaintainCMSAccount").routeId("MaintainCMSAccount")
		.setHeader("system", constant("MW"))
		.to("bean:maintainCMSAccountService?method=setCMSAccountMaintenanceRequestIn")
		.to("bean:maintainCMSAccountService?method=prepareProcessRequest")

		.marshal(getProcessRequest)

		.setHeader("system", constant("CMS"))
		.setHeader("SOAPAction", constant("http://com.tcs.bancs.rm/processRequest"))
		.to("{{UDDIConnector.host}}{{UDDIConnector.contextPath}}/cms/v1/ProcessRequest?bridgeEndpoint=true")
		.to("bean:maintainCMSAccountService?method=prepareCMSAccountMaintainanceFinalResponse")
		.setHeader("Content-Type", constant("application/json"));

	}

}
