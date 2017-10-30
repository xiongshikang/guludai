package com.guludai.base.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.guludai.base.biz.BaseAreaCityBiz;
import com.guludai.base.entity.BaseAreaCity;


@RestController
public class BaseAreaCityController {

	@Autowired
	private BaseAreaCityBiz baseAreaCityBiz; 
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public String list(String title) {
		String result = baseAreaCityBiz.getAll();
		return result;
    }
}
