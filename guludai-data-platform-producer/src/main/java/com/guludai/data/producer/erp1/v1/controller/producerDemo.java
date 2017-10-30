package com.guludai.data.producer.erp1.v1.controller;

import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.LocalTransactionState;
import org.apache.rocketmq.client.producer.SendCallback;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.client.producer.TransactionMQProducer;
import org.apache.rocketmq.common.message.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.guludai.data.rocketmq.tag.constant.ProducerTopicConstant;


/**
 * 
 * @author jiangjb
 *
 */
@RestController
public class producerDemo {
	
	@Autowired
    private DefaultMQProducer defaultProducer;
    
    @RequestMapping(value = "/sendMsg", method = RequestMethod.GET)
    public void sendMsg() {
    	 Message msg = new Message(ProducerTopicConstant.ERP1,// topic
    			 ProducerTopicConstant.ERP1_V1,// tag
                 "OrderID001",// key
                 ("Hello jyqlove333").getBytes());// body
         try {
			defaultProducer.send(msg,new SendCallback(){
				
				@Override
				public void onSuccess(SendResult sendResult) {
					 System.out.println(sendResult);
					 //TODO 发送成功处理
				}
				
				@Override
				public void onException(Throwable e) {
					 System.out.println(e);
					//TODO 发送失败处理
				}
			});
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    
}
