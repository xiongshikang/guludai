package com.guludai.data.consumer.erp1.v1.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guludai.data.consumer.erp1.v1.mapper.TestMapper;
import com.guludai.data.entity.erp1.v1.Test;

@Service
public class TestBiz{

	@Autowired
	private TestMapper testMapper;
	
	public Test getTest(){
		return testMapper.selectByPrimaryKey(1);
	}
}
