package com.guludai.data.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.guludai.data.consumer.erp1.v1.biz.TestBiz;
import com.guludai.data.consumer.erp1.v2.biz.Test2Biz;
import com.guludai.data.entity.erp1.v1.Test;
import com.guludai.data.entity.erp1.v2.Test2;
@RestController
public class TestController {

	@Autowired
	private TestBiz testBiz;
	
	@Autowired
	private Test2Biz test2Biz;
	
    @Value("${from}")
	private String from;
	
	
    @GetMapping(value="/from")
    public String testFrom() {
    	return this.from;
    }
    
	@RequestMapping(value = "/list", method = RequestMethod.GET)
    public Test list() {
		return testBiz.getTest() ;
    }
	
	@RequestMapping(value = "/list2", method = RequestMethod.GET)
    public Test2 list2() {
		return test2Biz.getTest();
    }
}
