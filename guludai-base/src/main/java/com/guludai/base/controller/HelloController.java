package com.guludai.base.controller;

import com.guludai.base.api.service.IHello;
import com.guludai.base.biz.BaseAreaCityBiz;
import com.guludai.base.biz.BaseSecurityUserBiz;
import com.guludai.base.entity.BaseAreaCity;
import com.guludai.base.entity.BaseSecurityResources;
import com.guludai.base.entity.BaseSecurityUser;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController implements IHello {
	
	@Autowired
	private BaseAreaCityBiz baseAreaCityBiz;

	@Override
	public String getHello() {
		return baseAreaCityBiz.getAll();
	}
	 
}
