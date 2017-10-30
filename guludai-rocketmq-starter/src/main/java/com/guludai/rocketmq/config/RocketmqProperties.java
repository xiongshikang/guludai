package com.guludai.rocketmq.config;

import static com.guludai.rocketmq.config.RocketmqProperties.PREFIX;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;
 
@Data
@ConfigurationProperties(PREFIX)
public class RocketmqProperties {

    public static final String PREFIX = "spring.extend.rocketmq";

    private String namesrvAddr;
    private String instanceName;
    private String clientIP;
    private ProducerConfig producer;
    private ConsumerConfig consumer;
	public String getNamesrvAddr() {
		return namesrvAddr;
	}
	public void setNamesrvAddr(String namesrvAddr) {
		this.namesrvAddr = namesrvAddr;
	}
	public String getInstanceName() {
		return instanceName;
	}
	public void setInstanceName(String instanceName) {
		this.instanceName = instanceName;
	}
	public String getClientIP() {
		return clientIP;
	}
	public void setClientIP(String clientIP) {
		this.clientIP = clientIP;
	}
	public ProducerConfig getProducer() {
		return producer;
	}
	public void setProducer(ProducerConfig producer) {
		this.producer = producer;
	}
	public ConsumerConfig getConsumer() {
		return consumer;
	}
	public void setConsumer(ConsumerConfig consumer) {
		this.consumer = consumer;
	}
    
    
    
}