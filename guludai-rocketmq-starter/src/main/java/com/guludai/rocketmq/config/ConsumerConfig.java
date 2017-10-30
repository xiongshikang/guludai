package com.guludai.rocketmq.config;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author jiangjb
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ConsumerConfig {
	private String instanceName;
    private List<String> subscribe;
	public String getInstanceName() {
		return instanceName;
	}
	public void setInstanceName(String instanceName) {
		this.instanceName = instanceName;
	}
	public List<String> getSubscribe() {
		return subscribe;
	}
	public void setSubscribe(List<String> subscribe) {
		this.subscribe = subscribe;
	}
    
}
