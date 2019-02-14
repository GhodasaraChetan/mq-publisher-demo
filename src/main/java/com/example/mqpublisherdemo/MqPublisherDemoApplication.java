package com.example.mqpublisherdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableBinding(TestChannel.class)
public class MqPublisherDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MqPublisherDemoApplication.class, args);
	}

}

