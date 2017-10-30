package com.guludai.rocketmq.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author jiangjb
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProducerConfig {
    private String instanceName;
	private String tranInstanceName;
    private String topic;
	public String getInstanceName() {
		return instanceName;
	}
	public void setInstanceName(String instanceName) {
		this.instanceName = instanceName;
	}
	public String getTranInstanceName() {
		return tranInstanceName;
	}
	public void setTranInstanceName(String tranInstanceName) {
		this.tranInstanceName = tranInstanceName;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
    
}
