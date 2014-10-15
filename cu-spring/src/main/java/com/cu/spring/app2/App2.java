package com.cu.spring.app2;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App2 {
	
	final static Logger logger = LoggerFactory.getLogger(App2.class);
	private static ApplicationContext applicationContext;
	
		public static void main(String[] args) {
		try {
			logger.info("Initializing Spring context.");
			applicationContext = new ClassPathXmlApplicationContext("com/cu/spring/app2/application-context.xml");
			logger.info("Spring context initialized.");

			StreamSource streamSource = (StreamSource) applicationContext.getBean("streamSource");
			StreamResult streamResult = (StreamResult) applicationContext.getBean("streamResult");
			Transformer transformer = (Transformer) applicationContext.getBean("transformer");
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			transformer.transform(streamSource, streamResult);
			System.out.println("out: " + streamResult.getWriter().toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
