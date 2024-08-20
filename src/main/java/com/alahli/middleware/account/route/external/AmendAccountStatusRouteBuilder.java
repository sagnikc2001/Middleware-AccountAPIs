package com.alahli.middleware.account.route.external;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.jackson.JacksonDataFormat;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.stereotype.Component;

import com.alahli.middleware.account.models.AccountStatusAmendment;
import com.alahli.middleware.account.models.backends.bancs.InquireAccountStatusRequest;
import com.alahli.middleware.account.models.backends.bancs.InquireAccountStatusResponse;
import com.alahli.middleware.account.models.backends.bancs.UpdateAccountStatusRequest;

@Component
public class AmendAccountStatusRouteBuilder extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		
		restConfiguration()
		.bindingMode(RestBindingMode.json);
		
		rest("/api/accounts")
		.post("/v1/AmendAccountStatus")
		.type(AccountStatusAmendment.class)
		.consumes("application/json")
		.produces("application/json")
		.to("direct:AmendAccountStatus")
		.outType(AccountStatusAmendment.class);
		
		onException(Exception.class)
		.to("bean:oUtils?method=onException(${exchange},\"AccountStatusAmendmentResponse\",${header.system})")
		.handled(true);
		
		from("direct:AmendAccountStatus").routeId("AmendAccountStatus")
		.setHeader("system", constant("MW"))
		.to("bean:amendAccountStatusService?method=setAccountStatusAmendmentRequestIn")
		.log("Before choice - ${body}")
		.choice()
			.when().jsonpath("$.AccountStatusAmendmentRequest[?(@.operationMode == 'R')]")
				.to("direct:InquireAccountStatus")
			.when().jsonpath("$.AccountStatusAmendmentRequest[?(@.operationMode == 'U')]")
				.to("direct:UpdateAccountStatus")	
		.otherwise()
			.to("bean:oUtils?method=prepareFaultNodeStr(\"AccountStatusAmendmentResponse\",\"MANDATORYVALUE\",\"Invalid Operational Mode\",\"\",\"\",\"validationsCust\",${exchange})");
		
		
		from("direct:InquireAccountStatus").routeId("InquireAccountStatus")
		.to("bean:amendAccountStatusService?method=prepareInquireAccountStatusRequestBackend")
		.marshal(new JacksonDataFormat(InquireAccountStatusRequest.class))
		.setHeader("system",constant("BANCSDB"))
		.to("{{BANCSDBConnector.host}}{{BANCSDBConnector.contextPath}}"+"/v1/InquiryAccountStatusProcedure?bridgeEndpoint=true")
		.choice()
			.when().jsonpath("$.InquireAccountStatusResponse[?(@.ERROR.size()>0)]")
				.to("bean:oUtils?method=prepareFaultNodeStr(\"AccountStatusAmendmentResponse\",\"BANCSDB\",\"\",\"\",\"\",\"sysOrAppWithBkndError\",${exchange})")
		.otherwise()
			.unmarshal(new JacksonDataFormat(InquireAccountStatusResponse.class))
			.to("bean:amendAccountStatusService?method=prepareInquireAccountStatusAmendmentFinalResponse")
		.endChoice();	
		
		
		from("direct:UpdateAccountStatus").routeId("UpdateAccountStatus")
		.to("bean:amendAccountStatusService?method=prepareUpdateAccountStatusRequestBackend")
		.marshal(new JacksonDataFormat(UpdateAccountStatusRequest.class))
		.setHeader("system",constant("BANCSDB"))
		.to("{{BANCSDBConnector.host}}{{BANCSDBConnector.contextPath}}"+"/v1/UpdateAccountStatusProcedure?bridgeEndpoint=true")
		.choice()
			.when().jsonpath("$.UpdateAccountStatusResponse[?(@.ERROR.size()>0)]")
				.to("bean:oUtils?method=prepareFaultNodeStr(\"AccountStatusAmendmentResponse\",\"BANCSDB\",\"\",\"\",\"\",\"sysOrAppWithBkndError\",${exchange})")
		.otherwise()
			.to("bean:amendAccountStatusService?method=prepareUpdateAccountStatusAmendmentFinalResponse")
		.endChoice();
		
	}

}
