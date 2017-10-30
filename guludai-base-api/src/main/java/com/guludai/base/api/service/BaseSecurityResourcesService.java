package com.guludai.base.api.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.guludai.base.entity.BaseSecurityResources;

@FeignClient("guludai-base")
public interface BaseSecurityResourcesService {
	
	@RequestMapping(value = "/loadUserResources", method = RequestMethod.GET)
	List<BaseSecurityResources> loadUserResources(@RequestParam(value="userCode")String userCode);

	@RequestMapping(value = "/queryAll", method = RequestMethod.GET)
	public List<BaseSecurityResources> queryAll();
}
