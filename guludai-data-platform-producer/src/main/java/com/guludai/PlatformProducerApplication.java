package com.guludai;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
 

@SpringBootApplication
public class PlatformProducerApplication {

	 public static void main(String[] args) {
	        new SpringApplicationBuilder(PlatformProducerApplication.class).web(true).run(args);    
	 }
}

 
