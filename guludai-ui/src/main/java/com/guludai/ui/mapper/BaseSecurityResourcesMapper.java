package com.guludai.ui.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.guludai.ui.entity.BaseSecurityResources;
import tk.mybatis.mapper.common.Mapper;

public interface BaseSecurityResourcesMapper extends Mapper<BaseSecurityResources> {
	
	List<BaseSecurityResources> getResourceByUserId(@Param("userCode")String userCode,@Param("type")Integer type);
}