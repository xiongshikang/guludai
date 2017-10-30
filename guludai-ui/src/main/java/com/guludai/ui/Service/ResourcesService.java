package com.guludai.ui.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guludai.base.api.service.BaseSecurityResourcesService;
import com.guludai.base.entity.BaseSecurityResources;
@Service
public class ResourcesService {
	
	@Autowired
	private BaseSecurityResourcesService baseSecurityResourcesService ;
	
	public List<BaseSecurityResources> queryAll(){
		return baseSecurityResourcesService.queryAll();
	}
}
