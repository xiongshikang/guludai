package com.guludai.cmp.ui.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import com.guludai.base.api.service.BaseSecurityUserService;
import com.guludai.base.entity.BaseSecurityUser;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
@Service
public class UserService {
	@Resource
	private BaseSecurityUserService baseSecurityUserService;

	@HystrixCommand(fallbackMethod = "selectByUsernameFallback")
	public BaseSecurityUser selectByUsername(String userName) {
		return baseSecurityUserService.selectByUsername(userName);
	}
	
	public BaseSecurityUser selectByUsernameFallback() {
		BaseSecurityUser baseSecurityUser = new BaseSecurityUser();
		baseSecurityUser.setUserName("错误@!");
		return baseSecurityUser;
	}
}
