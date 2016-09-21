package com.ds.dubbo.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ds.dubbo.service.IWelcomeService;

public class WelcomeServiceImpl implements IWelcomeService {
	private final Logger logger = LoggerFactory.getLogger(WelcomeServiceImpl.class);

	public void sayHello(String name) {
		logger.info("hello："+name);
//		System.out.println("hello："+name);
		
	}

}
