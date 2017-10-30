package com.guludai.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.guludai.admin.biz.MonitorErpFactoryBiz;
import com.guludai.admin.entity.MonitorErpFactory;


@RestController
public class MonitorErpFactoryController {

	@Autowired
	private MonitorErpFactoryBiz monitorErpFactoryBiz; 
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public List<MonitorErpFactory> list(String title) {
		List<MonitorErpFactory> ls = monitorErpFactoryBiz.getAll();
		return ls;
    }
}
