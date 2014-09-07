package com.au.alpha;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.au.alpha.HelloWorld;

public class HelloWorldTest {
	HelloWorld hello;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		hello = new HelloWorld();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void aPositiveTest() {
		hello.setMessage("hello jUnit");
		assertEquals(hello.getMessage(), "hello jUnit");
	}
	
	@Test
	public void aNegativeTest() {
		hello.setMessage("hello Junit");
		assertNotEquals(hello.getMessage(), "hello jUnit");
	}

}
