package com.example.mqpublisherdemo;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface TestChannel {

	String GOOGLE_CHANNEL = "google_channel";
	String MICROSOFT_CHANNEL = "microsoft_channel";

	@Output(GOOGLE_CHANNEL)
	MessageChannel sendMessageToGoogle();

	@Output(MICROSOFT_CHANNEL)
	MessageChannel sendMessageToMicrosoft();
}
