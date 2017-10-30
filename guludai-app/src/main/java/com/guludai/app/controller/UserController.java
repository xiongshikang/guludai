package com.guludai.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guludai.base.api.service.BaseSecurityResourcesService;
import com.guludai.base.api.service.BaseSecurityUserService;
import com.guludai.base.entity.BaseSecurityResources;
import com.guludai.base.entity.BaseSecurityUser;
import com.guludai.cmp.ui.service.ResourcesService;
import com.guludai.cmp.ui.service.UserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class UserController {
	
	@Autowired
	private ResourcesService resourcesService;
	@Autowired
	private UserService userService;
	
	@RequestMapping("/ls")
	public List<BaseSecurityResources> selectByUsername() {
		return resourcesService.queryAll() ;
	}
	
	@RequestMapping("/ls2")
	public List<BaseSecurityResources> loadUserResources() {
		return resourcesService.loadUserResources("f5fe567fbba411e7a60770208403cee8") ;
	}
	
	@RequestMapping("/ls3")
	public BaseSecurityUser baseSecurityUser() {
		return userService.selectByUsername("admin");
	}
	
}
