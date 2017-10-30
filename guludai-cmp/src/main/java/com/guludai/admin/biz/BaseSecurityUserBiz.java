package com.guludai.admin.biz;

import java.util.List;

import org.springframework.stereotype.Service;

import com.guludai.admin.common.biz.BaseBiz;
import com.guludai.admin.entity.BaseSecurityUser;
import com.guludai.admin.mapper.BaseSecurityUserMapper;
@Service
public class BaseSecurityUserBiz extends BaseBiz<BaseSecurityUserMapper,BaseSecurityUser>{
	
	
	public List<BaseSecurityUser> getlist(){
		return selectListAll();
	}
	
}
