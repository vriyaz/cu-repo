package com.cu.json;

import static org.junit.Assert.*;

import org.codehaus.jackson.map.ObjectMapper;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cu.json.UserPojo;

public class JacksonTest {

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
		UserPojo user = new UserPojo();
		ObjectMapper mapper = new ObjectMapper();

		try {
			//convert user object to json string, and save to a file
			//mapper.writeValue(System.out, user);

			// display to console
			//System.out.println(mapper.writeValueAsString(user));
			//System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(user));
			assertEquals("{\"name\":\"john\",\"age\":29,\"messages\":[\"msg 1\",\"msg 2\",\"msg 3\"]}",mapper.writeValueAsString(user));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
