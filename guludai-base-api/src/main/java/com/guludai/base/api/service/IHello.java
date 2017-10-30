package com.guludai.base.api.service;


import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.guludai.base.entity.BaseSecurityResources;
import com.guludai.base.entity.BaseSecurityUser;


@FeignClient("guludai-base")
public interface IHello {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    String getHello();
    
}