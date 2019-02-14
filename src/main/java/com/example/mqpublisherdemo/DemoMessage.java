package com.example.mqpublisherdemo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DemoMessage {
	private String message;
}
