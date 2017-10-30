package com.guludai.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.guludai.base.api.service.IHello;

@RestController
public class HelloController implements IHello {
	@Autowired
	private IHello hello;

	@Override
	@RequestMapping("/test")
	@HystrixCommand(fallbackMethod = "helloFallbackMethod")
	public String getHello() {
		return hello.getHello();
	}
	public String helloFallbackMethod() {
		return null;
	}
}
