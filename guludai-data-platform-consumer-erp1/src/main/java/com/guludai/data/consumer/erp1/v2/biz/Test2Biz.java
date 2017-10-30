package com.guludai.data.consumer.erp1.v2.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guludai.admin.common.biz.BaseBiz;
import com.guludai.data.consumer.erp1.v2.mapper.Test2Mapper;
import com.guludai.data.entity.erp1.v2.Test2;

@Service
public class Test2Biz {

	@Autowired
	private Test2Mapper test2Mapper;
	
	public Test2 getTest(){
		return test2Mapper.selectByPrimaryKey(1);
	}
}

 