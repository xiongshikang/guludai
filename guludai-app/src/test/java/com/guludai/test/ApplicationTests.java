/*package com.guludai.test;


import org.activiti.engine.ProcessEngine;
import org.activiti.engine.repository.Deployment;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.guludai.AppApplication;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = AppApplication.class)
@WebAppConfiguration
public class ApplicationTests {
	
	@Autowired
	private ProcessEngine processEngine ;
	
	*//**部署流程定义*//*
	@Test
	public void deploymentProcessDefinition(){
		Deployment deployment = processEngine.getRepositoryService()//与流程定义和部署对象相关的Service
						.createDeployment()//创建一个部署对象
						.name("helloworld入门程序")//添加部署的名称
						.addClasspathResource("processes/helloworld.bpmn")//从classpath的资源中加载，一次只能加载一个文件
						.addClasspathResource("processes/helloworld.png")//从classpath的资源中加载，一次只能加载一个文件
						.deploy();//完成部署
		System.out.println("部署ID："+deployment.getId());//1
		System.out.println("部署名称："+deployment.getName());//helloworld入门程序  
}


}
*/