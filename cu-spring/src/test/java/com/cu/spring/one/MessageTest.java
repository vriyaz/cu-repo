package com.cu.spring.one;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cu.spring.one.Message;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class MessageTest {

	final Logger logger = LoggerFactory.getLogger(MessageTest.class);
	@Autowired
	private Message message = null;
	/**
	* Tests message.
	*/
	@Test
	public void testMessage() {
		assertNotNull("Constructor message instance is null", message);
		String msg = message.getMessage();
		assertNotNull("Message is null", msg);
		String expectedMessage = "Spring testing is fun";
		
		assertEquals("Message should be '" + expectedMessage + "'.", expectedMessage, msg);
		logger.info("message='{}'", msg);	
	}
}
