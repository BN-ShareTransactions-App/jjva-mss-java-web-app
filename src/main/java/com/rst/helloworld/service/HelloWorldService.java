package com.rst.helloworld.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class HelloWorldService {

	private static final Logger logger = LoggerFactory.getLogger(HelloWorldService.class);

	public String getDesc() {

		logger.debug("getDesc() is executed!");

		return "DevSecOps Tools; Kubernetes,Docker,Puppet,Jenkins,Terraform,Cloud,Snakes And SonarQube";

	}

	public String getTitle(String name) {

		logger.debug("getTitle() is executed! $name : {}", name);

		if(StringUtils.isEmpty(name)){
			return "Agunu Is A DevSecOps Engineer";
		}else{
			return "Hello " + name;
		}

	}

}
