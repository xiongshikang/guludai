package com.guludai;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class DataPlatformConsumerApplication {
	public static void main(String[] args) {
		new SpringApplicationBuilder(DataPlatformConsumerApplication.class).web(true).run(args);
	}
}
