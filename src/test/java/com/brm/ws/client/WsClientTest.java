package com.brm.ws.client;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import com.brm.ws.payment.Fault;
import com.brm.ws.payment.TransferException;
import com.brm.ws.payment.TransferException_Exception;
import com.brm.ws.payment.TransferRequest;
import com.brm.ws.payment.TransferResponse;
import org.apache.camel.CamelExecutionException;
import org.apache.camel.Produce;
import org.apache.camel.ProducerTemplate;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:META-INF/spring/camel-context.xml" })
public class WsClientTest {

	@Produce(uri = "direct:payment")
	ProducerTemplate wsClient;

	@Test
	public void testSmallAmount() {
		TransferRequest request = new TransferRequest();
		request.setBank("Bank of Camel");
		request.setFrom("Jakub");
		request.setTo("Scott");
		request.setAmount(1000000); // 이체 가능 금액

		System.err.println("Calling Web Service...    : " + ReflectionToStringBuilder.toString(request));

		try {
			TransferResponse response = wsClient.requestBody(request, TransferResponse.class);
			assertNotNull(response);
			assertEquals("OK", response.getReply());
			System.err.println("Response from Web Service : " + ReflectionToStringBuilder.toString(response));
		} catch (CamelExecutionException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testLargeAmount() {
		TransferRequest request = new TransferRequest();
		request.setBank("Bank of Camel");
		request.setFrom("Jakub");
		request.setTo("Scott");
		request.setAmount(10000000); // 이체 불가능 금액

		System.err.println("Calling Web Service...    : " + ReflectionToStringBuilder.toString(request));

		try {
			TransferResponse response = wsClient.requestBody(request, TransferResponse.class);
		} catch (CamelExecutionException e) {
			TransferException_Exception cause = (TransferException_Exception) e.getCause();
			TransferException transferException = cause.getFaultInfo();
			Fault fault = transferException.getFault();
			System.err.println("Fault from Web Service    : " + fault.getReason());
		}
	}
}
