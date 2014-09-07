package com.cu.alpha;

import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.cu.aaa.Math;

public class MathTest {

	@Rule
	public ExpectedException exception = ExpectedException.none();
	
	Math math;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		math = new Math(10,5);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		assertEquals(math.add(), 15);
	}
	
	@Test
	public void testAddWithMatcher() {
		assertThat(math.add(), is(15));
		assertThat(math.add(), is(not(10)));
		assertThat(math.add(), anyOf(is(10),is(15)));
	}
	
	@Test
	public void testMultiply() {
		assertEquals(math.multiply(), 50);
	}
	
	@Test
	public void testDivide() {
		assertEquals(new Math(10,5).divide(), 2);
	}

	@Test(expected=ArithmeticException.class) 
	public void testDivideByZero() {
		new Math(10,0).divide();
	}
	
	@Test
	public void testDivideByZeroAgain() {
		exception.expect(ArithmeticException.class);
		new Math(1,0).divide();
	}
}
