package com.guludai.admin.agent.controller;

import com.guludai.base.api.service.IHello;
import com.guludai.base.entity.BaseAreaCity;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloAgentController {
	
  @Autowired
  private IHello hello;

  @HystrixCommand(fallbackMethod = "helloFallbackMethod")
  @RequestMapping("/test")
  @ResponseBody
  public String sayHello() {
    return hello.getHello();
  }

  public String helloFallbackMethod() {
      return "ccccccccc";
  }
}
