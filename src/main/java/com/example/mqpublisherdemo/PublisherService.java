package com.example.mqpublisherdemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PublisherService {

	private static final String ROUTING_KEY = "routingKey";

	@Autowired
	private TestChannel testChannel;

	public void sendToGoggle() {
		String googleMessage = "Hello Google..!!";
		Message<DemoMessage> message = MessageBuilder
				.withPayload(DemoMessage.builder().message(googleMessage).build())
				.setHeader(ROUTING_KEY, "google")
				.build();
		try {
			this.testChannel.sendMessageToGoogle().send(message);
			log.info("google message sent..");
		}
		catch (Exception e){
			log.error("Error while publishing message to Google: {}", e.getMessage());
			throw e;
		}
	}

	public void sendToMicrosoft() {
		String microsoftMessage = "Hello Microsoft..!!";
		Message<DemoMessage> message = MessageBuilder
				.withPayload(DemoMessage.builder().message(microsoftMessage).build())
				.setHeader(ROUTING_KEY, "microsoft")
				.build();
		try {
			testChannel.sendMessageToGoogle().send(message);
			log.info("microsoft message sent..");
		}
		catch (Exception e){
			log.error("Error while publishing message to Microsoft: {}", e.getMessage());
			throw e;
		}
	}
}
