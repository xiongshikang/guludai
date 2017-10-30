package com.guludai.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.guludai.base.api.service.IHello;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

 
@RestController
public class HelloController {

  @Autowired
  private IHello IHello;
	
 
  @HystrixCommand(fallbackMethod = "helloFallbackMethod")
  public String getHello() {
    return IHello.getHello();
  }

  public String helloFallbackMethod(){
    return "failure";
  }

}
