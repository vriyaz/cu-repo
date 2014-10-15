package com.cu.spring.app1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 {
	
	final static Logger logger = LoggerFactory.getLogger(App1.class);
	private static ApplicationContext applicationContext;
	
	public static void main(String[] args) {
		logger.info("Initializing Spring context.");
		applicationContext = new ClassPathXmlApplicationContext("com/cu/spring/one/application-context.xml");
		logger.info("Spring context initialized.");
		Message message = (Message) applicationContext.getBean("message");
		logger.info("message='" + message.getMessage() + "'");
	}
}
