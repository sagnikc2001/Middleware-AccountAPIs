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

import com.alahli.middleware.account.models.CMSAccountTransactions;
import com.alahli.middleware.account.models.GetCustAcctsCumulativeBal;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Charsets;
import com.google.common.io.Resources;

@CamelSpringBootTest
@SpringBootApplication
@WebAppConfiguration

@MockEndpointsAndSkip("http://localhost:8081/api/accounts/v1/GetCustAcctsCumulativeBal.*|http://localhost:8082/api/connector/configstore.*")

@UseAdviceWith
@ImportResource({ "classpath:spring/camel-context.xml" })
@Configuration
@PropertySource("classpath:application-test.properties")
@ComponentScan("com.alahli.middleware.account.*")

public class GetCustAcctsCumulativeBalTest {
	
	@Autowired
	CamelContext camelContext;

	@Autowired
	ObjectMapper objectMapper;

	@Autowired
	ProducerTemplate producerTemplate;

	@Autowired
	ApplicationContext applicationContext;
	
	@EndpointInject("mock://http:localhost:8081/api/accounts/v1/GetCustAcctsCumulativeBal")
	private MockEndpoint cdmockEndpoint;

	@EndpointInject("mock://http:localhost:8082/api/connector/configstore")
	private MockEndpoint cdmockEndpoint2;
	
	@Test
	public void getCustAcctsCumulativeBal_Success() throws Exception{
		
		String getCustAcctsCumulativeBalRequest = Resources.toString(
				Resources.getResource("mock/frontend/GetCustAcctsCumulativeBal/request/GetCustAcctsCumulativeBalRequest.json"),
				Charsets.UTF_8);

		String getCustAcctsCumulativeBalResponseBknd = Resources.toString(
				Resources.getResource("mock/backend/GetCustAcctsCumulativeBal/GetCustAcctsCumulativeBalResponseBknd.json"),
				Charsets.UTF_8);

		String configstoreResponse = Resources.toString(
				Resources.getResource("mock/configStore/ConfigStoreResponse_Errors_ApplicationErrors.json"),
				Charsets.UTF_8);

		AdviceWith.adviceWith(camelContext, "GetCustAcctsCumulativeBal", routeBuilder -> {
			routeBuilder.replaceFromWith("direct:GetCustAcctsCumulativeBal");
		});
		
		cdmockEndpoint.expectedMessageCount(1);
		cdmockEndpoint.whenAnyExchangeReceived(new Processor() {
			public void process(Exchange exchange) throws Exception {
				exchange.getMessage().setBody(getCustAcctsCumulativeBalResponseBknd);
			}
		});

		cdmockEndpoint2.expectedMessageCount(1);
		cdmockEndpoint2.whenAnyExchangeReceived(new Processor() {
			public void process(Exchange exchange) throws Exception {
				exchange.getMessage().setBody(configstoreResponse);
			}
		});

		camelContext.start();
		
		GetCustAcctsCumulativeBal oGetCustAcctsCumulativeBalRequest = objectMapper.readValue(getCustAcctsCumulativeBalRequest,
				GetCustAcctsCumulativeBal.class);
		
		Map<String, Object> headers = new HashMap<String, Object>();
		headers.put("ServiceHeader", "{\"channelId\":\"5\",\"branchId\":\"00880\",\"tellerId\":\"\"}");
		
		GetCustAcctsCumulativeBal oGetCustAcctsCumulativeBalResponse = producerTemplate.requestBodyAndHeaders(
				"direct:GetCustAcctsCumulativeBal", oGetCustAcctsCumulativeBalRequest, headers, GetCustAcctsCumulativeBal.class);
		
		Assertions.assertTrue(null != oGetCustAcctsCumulativeBalResponse.getoCustAcctsCumulativeBalResponse().getSuccess().getCumulativeBalance());
	}
	
	@Test
	public void getCustAcctsCumulativeBal_Fault() throws Exception{
		
		String getCustAcctsCumulativeBalRequest_Fault = Resources.toString(
				Resources.getResource("mock/frontend/GetCustAcctsCumulativeBal/request/GetCustAcctsCumulativeBalRequest_Fault.json"),
				Charsets.UTF_8);

		String getCustAcctsCumulativeBalResponseBknd_Fault = Resources.toString(
				Resources.getResource("mock/backend/GetCustAcctsCumulativeBal/GetCustAcctsCumulativeBalResponseBknd_Fault.json"),
				Charsets.UTF_8);

		String configstoreResponse = Resources.toString(
				Resources.getResource("mock/configStore/ConfigStoreResponse_Errors_ApplicationErrors.json"),
				Charsets.UTF_8);
		
		AdviceWith.adviceWith(camelContext, "GetCustAcctsCumulativeBal", routeBuilder -> {
			routeBuilder.replaceFromWith("direct:GetCustAcctsCumulativeBal");
		});
		
		cdmockEndpoint.expectedMessageCount(1);
		cdmockEndpoint.whenAnyExchangeReceived(new Processor() {
			public void process(Exchange exchange) throws Exception {
				exchange.getMessage().setBody(getCustAcctsCumulativeBalResponseBknd_Fault);
			}
		});

		cdmockEndpoint2.expectedMessageCount(1);
		cdmockEndpoint2.whenAnyExchangeReceived(new Processor() {
			public void process(Exchange exchange) throws Exception {
				exchange.getMessage().setBody(configstoreResponse);
			}
		});

		camelContext.start();
		
		GetCustAcctsCumulativeBal oGetCustAcctsCumulativeBalRequest_Fault = objectMapper.readValue(getCustAcctsCumulativeBalRequest_Fault,
				GetCustAcctsCumulativeBal.class);
		
		Map<String, Object> headers = new HashMap<String, Object>();
		headers.put("ServiceHeader", "{\"channelId\":\"5\",\"branchId\":\"00880\",\"tellerId\":\"\"}");
		
		String faultResponse = producerTemplate.requestBodyAndHeaders(
				"direct:GetCustAcctsCumulativeBal", oGetCustAcctsCumulativeBalRequest_Fault, headers, String.class);
		
		Assertions.assertTrue(faultResponse.contains("Record not found"));
	}

}
