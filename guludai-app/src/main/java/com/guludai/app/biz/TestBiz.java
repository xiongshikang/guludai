package com.guludai.app.biz;

import org.springframework.stereotype.Service;

import com.guludai.admin.common.biz.BaseBiz;
import com.guludai.app.entity.Test2;
import com.guludai.app.mapper.Test2Mapper;
@Service
public class TestBiz extends BaseBiz<Test2Mapper,Test2>{

	public Test2 getTest2byid(){
		return selectById(1);
	}
}
