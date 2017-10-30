package com.guludai.cmp.ui.service;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guludai.base.api.service.BaseSecurityResourcesService;
import com.guludai.base.entity.BaseSecurityResources;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class ResourcesService {
	
	@Autowired
	private BaseSecurityResourcesService baseSecurityResourcesService ;
	
	@HystrixCommand(fallbackMethod = "loadUserResourcesFallback")
	public List<BaseSecurityResources> loadUserResources(String userCode){
		List<BaseSecurityResources> ls = null;
		if(StringUtils.isNotBlank(userCode)){
			ls = baseSecurityResourcesService.loadUserResources(userCode);
		}
		return ls;
	}
	
	public List<BaseSecurityResources> loadUserResourcesFallback(String userCode){
		return null;
	}

	@HystrixCommand(fallbackMethod = "queryAllFallback")
	public List<BaseSecurityResources> queryAll(){
		return baseSecurityResourcesService.queryAll();
	}
	
	public List<BaseSecurityResources> queryAllFallback(){
		return null;
	}
	
	
}
