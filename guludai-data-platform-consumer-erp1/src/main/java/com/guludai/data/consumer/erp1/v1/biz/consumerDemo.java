package com.guludai.data.consumer.erp1.v1.biz;

import java.util.List;

import org.apache.ibatis.scripting.xmltags.ForEachSqlNode;
import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyContext;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import org.apache.rocketmq.client.consumer.listener.MessageListenerConcurrently;
import org.apache.rocketmq.common.message.MessageExt;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.guludai.data.rocketmq.tag.constant.ProducerTopicConstant;
import com.guludai.rocketmq.annotaition.RocketmqEvent;

@Component
public class consumerDemo {
	
	@EventListener(condition = "#event.topic=='"+ProducerTopicConstant.ERP1+"' && #event.tag=='"+ProducerTopicConstant.ERP1_V1+"'")
	public void rocketmqMsgListen(RocketmqEvent event) {
		DefaultMQPushConsumer consumer = event.getConsumer();
		try {
			System.out.println("com.bqjr.consumerDemo监听到一个消息达到：" + event.getMsg("gbk"));
			//TODO 进行业务处理
		} catch (Exception e) {
			if(event.getMessageExt().getReconsumeTimes()<=3){//重复消费3次
				try {
					consumer.sendMessageBack(event.getMessageExt(), 2);
				} catch (Exception e1) {
					//TODO 消息消费失败，进行日志记录
				}
			} else {
				//TODO 消息消费失败，进行日志记录
				
			}
		}
	}
}
