package com.example.mqpublisherdemo;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface TestChannel {

	String GOOGLE_CHANNEL = "google-channel";
	String MICROSOFT_CHANNEL = "microsoft-channel";

	@Output(GOOGLE_CHANNEL)
	MessageChannel sendMessageToGoogle();

	@Output(MICROSOFT_CHANNEL)
	MessageChannel sendMessageToMicrosoft();
}
