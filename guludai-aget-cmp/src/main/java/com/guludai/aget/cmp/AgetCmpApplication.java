package com.guludai.aget.cmp;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

 
@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class AgetCmpApplication {
    public static void main(String[] args) {
        SpringApplication.run(AgetCmpApplication.class, args);
    }
}
