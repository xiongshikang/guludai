package com.guludai.ui.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.guludai.base.entity.BaseSecurityResources;
import com.guludai.ui.Service.ResourcesService;
import com.guludai.ui.biz.BaseSecurityUserBiz;
import com.guludai.ui.entity.BaseSecurityUser;

@RestController
public class TestController {
	
	@Autowired
	private BaseSecurityUserBiz baseSecurityUserBiz;
	
	@Autowired
	private ResourcesService resourcesService ;
	
	@RequestMapping(value = "/test",method = RequestMethod.GET)
    @ResponseBody
    public List<BaseSecurityUser>  test(){
		List<BaseSecurityUser>  ls =baseSecurityUserBiz.getlist();
		for (BaseSecurityUser b : ls) {
			System.out.println(b.getPassword());
		}
		return ls;
    }
	
	@RequestMapping(value = "/test2",method = RequestMethod.GET)
    public List<BaseSecurityResources>  test2(){
		return resourcesService.queryAll();
    }
}
