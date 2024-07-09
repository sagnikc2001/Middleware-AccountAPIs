package com.alahli.middleware.account;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.Configuration;
import org.apache.camel.EndpointInject;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.builder.AdviceWith;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.spring.junit5.CamelSpringBootTest;
import org.apache.camel.test.spring.junit5.MockEndpointsAndSkip;
import org.apache.camel.test.spring.junit5.UseAdviceWith;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.web.WebAppConfiguration;

import com.alahli.middleware.account.models.CMSAccountMaintainance;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Charsets;
import com.google.common.io.Resources;

@CamelSpringBootTest
@SpringBootApplication
@WebAppConfiguration

@MockEndpointsAndSkip("http://localhost:8080/api/connector/uddi/cms/v1/ProcessRequest.*|http://localhost:8082/api/connector/configstore.*")

@UseAdviceWith
@ImportResource({ "classpath:spring/camel-context.xml" })
@Configuration
@PropertySource("classpath:application-test.properties")
@ComponentScan("com.alahli.middleware.account.*")

public class MaintainCMSAccountTest {

	@Autowired
	CamelContext camelContext;

	@Autowired
	ObjectMapper objectMapper;

	@Autowired
	ProducerTemplate producerTemplate;

	@Autowired
	ApplicationContext applicationContext;

	@EndpointInject("mock://http:localhost:8080/api/connector/uddi/cms/v1/ProcessRequest")
	private MockEndpoint cdmockEndpoint;

	@EndpointInject("mock://http:localhost:8082/api/connector/configstore")
	private MockEndpoint cdmockEndpoint2;

	@Test
	public void maintainCMSAccount_Success() throws Exception {

		String cmsAccountMaintenanceRequest = Resources.toString(
				Resources.getResource("mock/frontend/MaintainCMSAccount/request/CMSAccountMaintenanceRequest.json"),
				Charsets.UTF_8);

		String cmsAccountMaintenanceResponseBknd = Resources.toString(
				Resources.getResource("mock/backend/MaintainCMSAccount/CMSAccountMaintainanceResponseBknd.xml"),
				Charsets.UTF_8);

		String configstoreResponse = Resources.toString(
				Resources.getResource("mock/configStore/ConfigStoreResponse_Errors_ApplicationErrors.json"),
				Charsets.UTF_8);

		AdviceWith.adviceWith(camelContext, "MaintainCMSAccount", routeBuilder -> {
			routeBuilder.replaceFromWith("direct:MaintainCMSAccount");
		});

		cdmockEndpoint.expectedMessageCount(1);
		cdmockEndpoint.whenAnyExchangeReceived(new Processor() {
			public void process(Exchange exchange) throws Exception {
				exchange.getMessage().setBody(cmsAccountMaintenanceResponseBknd);
			}
		});

		cdmockEndpoint2.expectedMessageCount(1);
		cdmockEndpoint2.whenAnyExchangeReceived(new Processor() {
			public void process(Exchange exchange) throws Exception {
				exchange.getMessage().setBody(configstoreResponse);
			}
		});

		camelContext.start();

		CMSAccountMaintainance oCMSAccountMaintainanceRequest = objectMapper.readValue(cmsAccountMaintenanceRequest,
				CMSAccountMaintainance.class);

		Map<String, Object> headers = new HashMap<String, Object>();
		headers.put("ServiceHeader", "{\"channelId\":\"5\",\"branchId\":\"00880\",\"tellerId\":\"\"}");

		CMSAccountMaintainance oCMSAccountMaintainanceResponse = producerTemplate.requestBodyAndHeaders(
				"direct:MaintainCMSAccount", oCMSAccountMaintainanceRequest, headers, CMSAccountMaintainance.class);

		Assertions.assertTrue(null != oCMSAccountMaintainanceResponse.getcMSAccountMaintenanceResponse().getSuccess().getStatusCode());
	}

	@Test
	public void maintainCMSAccount_Fault() throws Exception {

		String cmsAccountMaintenanceRequest_Fault = Resources.toString(
				Resources.getResource(
						"mock/frontend/MaintainCMSAccount/request/CMSAccountMaintenanceRequest_Fault.json"),
				Charsets.UTF_8);

		String cmsAccountMaintenanceResponseBknd_Fault = Resources.toString(
				Resources.getResource("mock/backend/MaintainCMSAccount/CMSAccountMaintainanceResponseBknd_Fault.xml"),
				Charsets.UTF_8);

		String configstoreResponse = Resources.toString(
				Resources.getResource("mock/configStore/ConfigStoreResponse_Errors_ApplicationErrors.json"),
				Charsets.UTF_8);

		AdviceWith.adviceWith(camelContext, "MaintainCMSAccount", routeBuilder -> {
			routeBuilder.replaceFromWith("direct:MaintainCMSAccount");
		});

		cdmockEndpoint.expectedMessageCount(1);
		cdmockEndpoint.whenAnyExchangeReceived(new Processor() {
			public void process(Exchange exchange) throws Exception {
				exchange.getMessage().setBody(cmsAccountMaintenanceResponseBknd_Fault);
			}
		});

		cdmockEndpoint2.expectedMessageCount(1);
		cdmockEndpoint2.whenAnyExchangeReceived(new Processor() {
			public void process(Exchange exchange) throws Exception {
				exchange.getMessage().setBody(configstoreResponse);
			}
		});

		camelContext.start();

		CMSAccountMaintainance oCMSAccountMaintainanceRequest_Fault = objectMapper
				.readValue(cmsAccountMaintenanceRequest_Fault, CMSAccountMaintainance.class);

		Map<String, Object> headers = new HashMap<String, Object>();
		headers.put("ServiceHeader", "{\"channelId\":\"5\",\"branchId\":\"00880\",\"tellerId\":\"\"}");
		
		String faultResponse = producerTemplate.requestBodyAndHeaders("direct:MaintainCMSAccount",
				oCMSAccountMaintainanceRequest_Fault, headers, String.class);

		Assertions.assertTrue(faultResponse.contains("fault"));
	}
}
