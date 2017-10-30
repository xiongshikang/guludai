package com.guludai.admin.biz;

import java.util.List;

import org.springframework.stereotype.Service;

import com.guludai.admin.common.biz.BaseBiz;
import com.guludai.admin.entity.MonitorErpFactory;
import com.guludai.admin.mapper.MonitorErpFactoryMapper;

@Service
public class MonitorErpFactoryBiz extends BaseBiz<MonitorErpFactoryMapper,MonitorErpFactory> {

	public List<MonitorErpFactory> getAll(){
		List<MonitorErpFactory> ls = selectListAll();
		return ls;
	}
}
