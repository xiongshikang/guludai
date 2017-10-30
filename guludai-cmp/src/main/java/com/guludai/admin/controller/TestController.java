package com.guludai.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.guludai.admin.biz.BaseSecurityUserBiz;
import com.guludai.admin.entity.BaseSecurityUser;

@RestController
public class TestController {
	
	@Autowired
	private BaseSecurityUserBiz baseSecurityUserBiz;
	
	@RequestMapping(value = "/test",method = RequestMethod.GET)
    @ResponseBody
    public List<BaseSecurityUser>  test(){
		List<BaseSecurityUser>  ls =baseSecurityUserBiz.getlist();
		for (BaseSecurityUser b : ls) {
			System.out.println(b.getPassword());
		}
		return ls;
    }
}
