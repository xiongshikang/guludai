package com.guludai.base.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.guludai.base.api.service.BaseSecurityUserService;
import com.guludai.base.biz.BaseSecurityUserBiz;
import com.guludai.base.entity.BaseSecurityUser;
@RestController
public class BaseSecurityUserController implements BaseSecurityUserService{
	
	@Autowired
	private BaseSecurityUserBiz baseSecurityUserBiz;
	
 
	public BaseSecurityUser selectByUsername(String userName) {
		return baseSecurityUserBiz.SelectByUsername(userName);
	}
	
}
