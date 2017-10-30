package com.guludai.base.biz;

import org.springframework.stereotype.Service;

import com.guludai.admin.common.biz.BaseBiz;
import com.guludai.base.entity.BaseSecurityUser;
import com.guludai.base.mapper.BaseSecurityUserMapper;

@Service
public class BaseSecurityUserBiz extends BaseBiz<BaseSecurityUserMapper,BaseSecurityUser> {

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
	public BaseSecurityUser SelectByUsername(String userName){
		BaseSecurityUser user = new BaseSecurityUser();
		user.setUserName(userName);
		BaseSecurityUser u = selectOne(user);
		return u;
	}
	
}
