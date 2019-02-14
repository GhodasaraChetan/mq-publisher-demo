package com.example.mqpublisherdemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
@Slf4j
public class DemoController {

	@Autowired
	private PublisherService publisherService;

	@GetMapping("/send")
	@ResponseStatus(HttpStatus.OK)
	public void sendMessages() {
		log.info("Send request received.");
		publisherService.sendToGoggle();
		publisherService.sendToMicrosoft();
	}
}
