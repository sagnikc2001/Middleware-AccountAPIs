package com.alahli.middleware.account.route.external;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.jackson.JacksonDataFormat;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.stereotype.Component;

import com.alahli.middleware.account.models.GetCustAcctsCumulativeBal;
import com.alahli.middleware.account.models.backends.ods.CustAcctsCumulativeBalRequestBackend;

@Component
public class GetCustAcctsCumulativeBalRouteBuilder extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		
		restConfiguration()
		.bindingMode(RestBindingMode.json);
		
		rest("/api/accounts")
		.post("/v1/GetCustAcctsCumulativeBal")
		.type(GetCustAcctsCumulativeBal.class)
		.consumes("application/json")
		.produces("application/json")
		.to("direct:GetCustAcctsCumulativeBal")
		.outType(GetCustAcctsCumulativeBal.class);
		
		onException(Exception.class)
		.to("bean:oUtils?method=onException(${exchange},\"CustAcctsCumulativeBalResponse\",${header.system})")
		.handled(true);
		
		from("direct:GetCustAcctsCumulativeBal").routeId("GetCustAcctsCumulativeBal")
		.setHeader("system",constant("MW"))
		.to("bean:getCustAcctsCumulativeBalService?method=setCustAcctsCumulativeBalRequestIn")
		.to("bean:getCustAcctsCumulativeBalService?method=prepareCustAcctsCumulativeBalRequestBackend")
		.marshal(new JacksonDataFormat(CustAcctsCumulativeBalRequestBackend.class))
		.setHeader("system",constant("ODS"))
		.to("{{ODSDBConnector.host}}{{ODSDBConnector.contextPath}}"+"/v1/CallProcedureToGetCustAcctCumulativeBalance?bridgeEndpoint=true")
		.log("After ODSDB : ${body}")
		.choice()
		.when().jsonpath("$.CustAcctsCumulativeBalResponse[?(@.success != null && @.success.size()>0)]")
			.to("bean:getCustAcctsCumulativeBalService?method=prepareCustAcctsCumulativeBalFinalResponse")
			.setHeader("Content-Type", constant("application/json"))
		.otherwise()
			.to("bean:oUtils?method=prepareFaultNodeStr(\"CustAcctsCumulativeBalResponse\",\"RECORDNOTFOUND_ODS\",\"\",\"\",\"\",\"sysOrAppWithoutBkndError\",${exchange})");
	}

}
