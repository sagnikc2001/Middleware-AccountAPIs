package com.alahli.middleware.account.bean;

import org.apache.camel.Exchange;
import org.apache.camel.Header;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alahli.middleware.account.models.CustAcctsCumulativeBalRequest;
import com.alahli.middleware.account.models.CustAcctsCumulativeBalResponse;
import com.alahli.middleware.account.models.GetCustAcctsCumulativeBal;
import com.alahli.middleware.account.models.GetCustAcctsCumulativeBalSuccess;
import com.alahli.middleware.account.models.ServiceHeader;
import com.alahli.middleware.account.models.backends.ods.CustAcctsCumulativeBalRequestBackend;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class GetCustAcctsCumulativeBalService {

	@Autowired
	ObjectMapper objectMapper;

	// storing incoming GetCustomerPFARequest data
	private CustAcctsCumulativeBalRequest custAcctsCumulativeBalRequest;

	// storing the incoming service header
	private ServiceHeader oServiceHeader;

	public void setCustAcctsCumulativeBalRequestIn(GetCustAcctsCumulativeBal getCustAcctsCumulativeBal,
			@Header("ServiceHeader") String serviceHeader) throws Exception {

		this.oServiceHeader = objectMapper.readValue(serviceHeader, ServiceHeader.class);
		this.custAcctsCumulativeBalRequest = getCustAcctsCumulativeBal.getoCustAcctsCumulativeBalRequest();

	}
	
	/**
	 * Prepare request for the external api
	 * 
	 * @return CustAcctsCumulativeBalRequestBackend class
	 * @throws Exception
	 */
	public CustAcctsCumulativeBalRequestBackend prepareCustAcctsCumulativeBalRequestBackend() throws Exception{
		
		CustAcctsCumulativeBalRequestBackend oCustAcctsCumulativeBalRequestBackend = new CustAcctsCumulativeBalRequestBackend();
		com.alahli.middleware.account.models.backends.ods.CustAcctsCumulativeBalRequest oCustAcctsCumulativeBalRequest = new com.alahli.middleware.account.models.backends.ods.CustAcctsCumulativeBalRequest();
		com.alahli.middleware.account.models.backends.ods.CustAcctsCumulativeBalType type = new com.alahli.middleware.account.models.backends.ods.CustAcctsCumulativeBalType();
		
		oCustAcctsCumulativeBalRequestBackend.setCustAcctsCumulativeBalRequest(oCustAcctsCumulativeBalRequest);
		oCustAcctsCumulativeBalRequest.setCifNumber(custAcctsCumulativeBalRequest.getCifNumber());
		oCustAcctsCumulativeBalRequest.setType(type);
		
		type.setIsDep(custAcctsCumulativeBalRequest.getType().getIsDep());
		
		return oCustAcctsCumulativeBalRequestBackend;
	}

	/**
	 * Prepare final response by mapping the retrieved response from the external api
	 * 
	 * @param ex Exchange body
	 * @return GetCustomerPFA class
	 * @throws Exception
	 */
	public GetCustAcctsCumulativeBal prepareCustAcctsCumulativeBalFinalResponse(Exchange ex) throws Exception{
		
		JsonNode oCustAcctsCumulativeBalResponseNode = objectMapper.readTree(ex.getIn().getBody(String.class));
		
		JsonNode oCustAcctsCumulativeBalResponseJson = oCustAcctsCumulativeBalResponseNode.get("CustAcctsCumulativeBalResponse");
		
		JsonNode oSuccessNode = oCustAcctsCumulativeBalResponseJson.get("success");
		
		GetCustAcctsCumulativeBal oGetCustAcctsCumulativeBal = new GetCustAcctsCumulativeBal();
		CustAcctsCumulativeBalResponse oCustAcctsCumulativeBalResponse = new CustAcctsCumulativeBalResponse();
		GetCustAcctsCumulativeBalSuccess success = new GetCustAcctsCumulativeBalSuccess();
		
		oGetCustAcctsCumulativeBal.setoCustAcctsCumulativeBalResponse(oCustAcctsCumulativeBalResponse);
		oCustAcctsCumulativeBalResponse.setSuccess(success);
		
		success.setCumulativeBalance(oSuccessNode.get("CUMULATIVEBALANCE").asDouble());
		
		return oGetCustAcctsCumulativeBal;
	}
}
