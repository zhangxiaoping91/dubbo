package com.ds.dubbo.debug;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ds.dubbo.service.IWelcomeService;

public class DubboConsumer {
	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"applicationContext-consumer.xml"});
		context.start();
		IWelcomeService welcomeService =  (IWelcomeService) context.getBean("welcomeService");
		welcomeService.sayHello("张孝平");
		System.in.read();
	}
}
