package com.guludai.base.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.guludai.base.entity.BaseSecurityResources;
import tk.mybatis.mapper.common.Mapper;

public interface BaseSecurityResourcesMapper extends Mapper<BaseSecurityResources> {
	
	/**
	 * 通过用户id，查找用户资源
	 * @author: xiongshikang
	 * @date: 2017年10月28日 下午12:50:33
	 * @Title: BaseSecurityResources 
	 * @Description: 
	 * @return
	 *
	 */
	List<BaseSecurityResources> getResourceByUserId(@Param("userCode")String userCode,@Param("type")Integer type);
	
	
}