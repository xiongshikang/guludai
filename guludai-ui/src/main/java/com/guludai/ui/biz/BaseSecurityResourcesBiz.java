package com.guludai.ui.biz;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guludai.admin.common.biz.BaseBiz;
import com.guludai.ui.entity.BaseSecurityResources;
import com.guludai.ui.mapper.BaseSecurityResourcesMapper;
@Service
public class BaseSecurityResourcesBiz extends BaseBiz<BaseSecurityResourcesMapper,BaseSecurityResources>{
	
	@Autowired
	private BaseSecurityResourcesMapper baseSecurityResourcesMapper ;
	
	/**
	 * 通过用户id，查找用户资源
	 * @author: xiongshikang
	 * @date: 2017年10月28日 下午12:54:51
	 * @Title: loadUserResources 
	 * @Description: 
	 * @param userCode
	 * @param type
	 * @return
	 *
	 */
	public List<BaseSecurityResources> loadUserResources(String userCode,Integer type){
		List<BaseSecurityResources>  ls = null;
		if(StringUtils.isNoneBlank(userCode)){
			 ls = baseSecurityResourcesMapper.getResourceByUserId(userCode,type);
		}
		return ls;
	}
	
	/**
	 * 查询所有的资料
	 * @author: xiongshikang
	 * @date: 2017年10月28日 下午1:23:23
	 * @Title: queryAll 
	 * @Description: 
	 * @return
	 *
	 */
	public List<BaseSecurityResources> queryAll(){
		return selectListAll();
	}
}
