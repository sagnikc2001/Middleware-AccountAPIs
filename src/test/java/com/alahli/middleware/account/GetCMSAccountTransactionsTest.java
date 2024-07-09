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
import com.alahli.middleware.account.models.CMSAccountTransactions;
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

public class GetCMSAccountTransactionsTest {
	
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
	public void getCMSAccountTransactions_Success() throws Exception {
		
		String getCMSAccountTransactionsRequest = Resources.toString(
				Resources.getResource("mock/frontend/GetCMSAccountTransactions/request/GetCMSAccountTransactionsRequest.json"),
				Charsets.UTF_8);

		String getCMSAccountTransactionsResponseBknd = Resources.toString(
				Resources.getResource("mock/backend/GetCMSAccountTransactions/GetCMSAccountTransactionsResponseBknd.xml"),
				Charsets.UTF_8);

		String configstoreResponse = Resources.toString(
				Resources.getResource("mock/configStore/ConfigStoreResponse_Errors_ApplicationErrors.json"),
				Charsets.UTF_8);

		AdviceWith.adviceWith(camelContext, "GetCMSAccountTransactions", routeBuilder -> {
			routeBuilder.replaceFromWith("direct:GetCMSAccountTransactions");
		});
		
		cdmockEndpoint.expectedMessageCount(1);
		cdmockEndpoint.whenAnyExchangeReceived(new Processor() {
			public void process(Exchange exchange) throws Exception {
				exchange.getMessage().setBody(getCMSAccountTransactionsResponseBknd);
			}
		});

		cdmockEndpoint2.expectedMessageCount(1);
		cdmockEndpoint2.whenAnyExchangeReceived(new Processor() {
			public void process(Exchange exchange) throws Exception {
				exchange.getMessage().setBody(configstoreResponse);
			}
		});

		camelContext.start();
		
		CMSAccountTransactions oCMSAccountTransactionsRequest = objectMapper.readValue(getCMSAccountTransactionsRequest,
				CMSAccountTransactions.class);

		Map<String, Object> headers = new HashMap<String, Object>();
		headers.put("ServiceHeader", "{\"channelId\":\"5\",\"branchId\":\"00880\",\"tellerId\":\"\"}");
		
		CMSAccountTransactions oCMSAccountTransactionsResponse = producerTemplate.requestBodyAndHeaders(
				"direct:GetCMSAccountTransactions", oCMSAccountTransactionsRequest, headers, CMSAccountTransactions.class);
		
		Assertions.assertTrue(null != oCMSAccountTransactionsResponse.getoCMSAccountTransactionsResponse().getSuccess().getStatusCode());
	}
	
	@Test
	public void getCMSAccountTransactions_Fault() throws Exception {
		
		String getCMSAccountTransactionsRequest_Fault = Resources.toString(
				Resources.getResource("mock/frontend/GetCMSAccountTransactions/request/GetCMSAccountTransactionsRequest_Fault.json"),
				Charsets.UTF_8);

		String getCMSAccountTransactionsResponseBknd_Fault = Resources.toString(
				Resources.getResource("mock/backend/GetCMSAccountTransactions/GetCMSAccountTransactionsResponseBknd_Fault.xml"),
				Charsets.UTF_8);
		
		String configstoreResponse = Resources.toString(
				Resources.getResource("mock/configStore/ConfigStoreResponse_Errors_ApplicationErrors.json"),
				Charsets.UTF_8);

		AdviceWith.adviceWith(camelContext, "GetCMSAccountTransactions", routeBuilder -> {
			routeBuilder.replaceFromWith("direct:GetCMSAccountTransactions");
		});
		
		cdmockEndpoint.expectedMessageCount(1);
		cdmockEndpoint.whenAnyExchangeReceived(new Processor() {
			public void process(Exchange exchange) throws Exception {
				exchange.getMessage().setBody(getCMSAccountTransactionsResponseBknd_Fault);
			}
		});

		cdmockEndpoint2.expectedMessageCount(1);
		cdmockEndpoint2.whenAnyExchangeReceived(new Processor() {
			public void process(Exchange exchange) throws Exception {
				exchange.getMessage().setBody(configstoreResponse);
			}
		});
		
		camelContext.start();
		
		CMSAccountTransactions oCMSAccountTransactionsRequest_Fault = objectMapper
				.readValue(getCMSAccountTransactionsRequest_Fault, CMSAccountTransactions.class);
		
		Map<String, Object> headers = new HashMap<String, Object>();
		headers.put("ServiceHeader", "{\"channelId\":\"5\",\"branchId\":\"00880\",\"tellerId\":\"\"}");
		
		String faultResponse = producerTemplate.requestBodyAndHeaders("direct:GetCMSAccountTransactions",
				oCMSAccountTransactionsRequest_Fault, headers, String.class);

		Assertions.assertTrue(faultResponse.contains("fault"));
		
		
	}

}
