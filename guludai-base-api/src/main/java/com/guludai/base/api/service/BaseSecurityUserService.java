package com.guludai.base.api.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.guludai.base.entity.BaseSecurityUser;

@FeignClient("guludai-base")
public interface BaseSecurityUserService {
	
	@RequestMapping(value = "/selectByUsername", method = RequestMethod.GET)
	BaseSecurityUser selectByUsername(@RequestParam(value="userName")String userName);
     
}
