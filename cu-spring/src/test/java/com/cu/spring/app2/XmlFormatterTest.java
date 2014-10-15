
package com.cu.spring.app2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cu.spring.app2.XmlFormatter;

public class XmlFormatterTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
		
		System.out.println(XmlFormatter.prettyFormat("<?xml version='1.0' encoding='UTF-8'?><report><record id='1001'><date>2013-07-29T00:00:00+05:30</date><qty>980</qty><Sales>213100</Sales><staffName>Cu:staff 0</staffName></record><record id='1002'><date>2013-07-30T00:00:00+05:30</date><qty>1080</qty><Sales>320200</Sales><staffName>Cu:staff 1</staffName></record><record id='1003'><date>2013-07-31T00:00:00+05:30</date><qty>1200</qty><Sales>342197</Sales><staffName>Cu:staff 2</staffName></record></report>"));
	}

}
