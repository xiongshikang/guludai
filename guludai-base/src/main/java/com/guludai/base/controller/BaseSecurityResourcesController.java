package com.guludai.base.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.guludai.base.api.service.BaseSecurityResourcesService;
import com.guludai.base.biz.BaseSecurityResourcesBiz;
import com.guludai.base.entity.BaseSecurityResources;
@RestController
public class BaseSecurityResourcesController implements BaseSecurityResourcesService{

	@Autowired
	private BaseSecurityResourcesBiz baseSecurityResourcesBiz;
	
	@Override
	public List<BaseSecurityResources> loadUserResources(String userCode) {
		return baseSecurityResourcesBiz.loadUserResources(userCode);
	}

	@Override
	public List<BaseSecurityResources> queryAll() {
		return baseSecurityResourcesBiz.queryAll() ;
	}
	
	
}
