package com.guludai.base.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guludai.admin.common.biz.BaseBiz;
import com.guludai.base.entity.BaseSecurityResources;
import com.guludai.base.mapper.BaseSecurityResourcesMapper;
@Service
public class BaseSecurityResourcesBiz extends BaseBiz<BaseSecurityResourcesMapper,BaseSecurityResources>{
	
	@Autowired
	private BaseSecurityResourcesMapper baseSecurityResourcesMapper ;
	
	public  List<BaseSecurityResources> loadUserResources(String userCode){
		return baseSecurityResourcesMapper.getResourceByUserId(userCode, 1);
	}
	
	public List<BaseSecurityResources> queryAll(){
		return selectListAll();
	}
}
