package com.guludai.ui.biz;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.guludai.admin.common.biz.BaseBiz;
import com.guludai.ui.entity.BaseSecurityUser;
import com.guludai.ui.mapper.BaseSecurityUserMapper;
@Service
public class BaseSecurityUserBiz extends BaseBiz<BaseSecurityUserMapper,BaseSecurityUser>{
	
	
	public List<BaseSecurityUser> getlist(){
		return selectListAll();
	}
	
	/**
	 * 
	 * @author: xiongshikang
	 * @date: 2017年10月27日 下午3:59:57
	 * @Title: SelectByUsername 
	 * @Description: 
	 * @param userName
	 * @return
	 *
	 */
	public BaseSecurityUser selectByUsername(String userName){
		BaseSecurityUser u = null;
		if(StringUtils.isNotBlank(userName)){
			BaseSecurityUser user = new BaseSecurityUser();
			user.setUserName(userName);
			u = selectOne(user);
		}
		return u;
	}
	
}
