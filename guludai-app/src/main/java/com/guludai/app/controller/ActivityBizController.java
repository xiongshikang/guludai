package com.guludai.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.guludai.app.biz.ActivityBiz;
import com.guludai.app.entity.Test2;

@RestController
public class ActivityBizController {

	//@Autowired
	//private ActivityBiz activityBiz;
	

	@RequestMapping(value="/activityctl")
	@ResponseBody
	public void activityctl(){
		 // activityBiz.deploymentProcessDefinition();
	}
}
