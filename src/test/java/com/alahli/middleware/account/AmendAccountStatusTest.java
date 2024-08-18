package com.alahli.middleware.account;

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
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.web.WebAppConfiguration;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Charsets;
import com.google.common.io.Resources;

@CamelSpringBootTest
@SpringBootApplication
@WebAppConfiguration

@MockEndpointsAndSkip("http://localhost:8083/api/connector/db/bancsdb/v1/InquiryAccountStatusProcedure.*|http://localhost:8083/api/connector/db/bancsdb/v1/UpdateAccountStatusProcedure.*|http://localhost:8082/api/connector/configstore.*")

@UseAdviceWith
@ImportResource({ "classpath:spring/camel-context.xml" })
@Configuration
@PropertySource("classpath:application-test.properties")
@ComponentScan("com.alahli.middleware.account.*")

public class AmendAccountStatusTest {
	
	@Autowired
	CamelContext camelContext;

	@Autowired
	ObjectMapper objectMapper;

	@Autowired
	ProducerTemplate producerTemplate;

	@Autowired
	ApplicationContext applicationContext;
	
	@EndpointInject("mock://http:localhost:8083/api/connector/db/bancsdb/v1/InquiryAccountStatusProcedureProcedure")
	private MockEndpoint cdmockEndpoint;
	
	@EndpointInject("mock://http://localhost:8083/api/connector/db/bancsdb/v1/UpdateAccountStatusProcedure")
	private MockEndpoint cdmockEndpoint1;

	@EndpointInject("mock://http:localhost:8082/api/connector/configstore")
	private MockEndpoint cdmockEndpoint2;
	
	@Test
	public void amendAccountStatus_InquirySuccess() throws Exception{
		
		String amendAccountStatusRequest = Resources.toString(
				Resources.getResource("mock/frontend/AmendAccountStatus/request/inquiryAccountStatusProcedure.json"),
				Charsets.UTF_8);

		String amendAccountStatusResponseBknd = Resources.toString(
				Resources.getResource("mock/backend/AmendAccountStatus/InquiryAccountStatusProcedureResponseBknd.json"),
				Charsets.UTF_8);

		String configstoreResponse = Resources.toString(
				Resources.getResource("mock/configStore/ConfigStoreResponse_Errors_ApplicationErrors.json"),
				Charsets.UTF_8);

		AdviceWith.adviceWith(camelContext, "AmendAccountStatus", routeBuilder -> {
			routeBuilder.replaceFromWith("direct:AmendAccountStatus");
		});
		
		cdmockEndpoint.expectedMessageCount(1);
		cdmockEndpoint.whenAnyExchangeReceived(new Processor() {
			public void process(Exchange exchange) throws Exception {
				exchange.getMessage().setBody(amendAccountStatusResponseBknd);
			}
		});

		cdmockEndpoint2.expectedMessageCount(1);
		cdmockEndpoint2.whenAnyExchangeReceived(new Processor() {
			public void process(Exchange exchange) throws Exception {
				exchange.getMessage().setBody(configstoreResponse);
			}
		});

		camelContext.start();
	}
	
	

}
