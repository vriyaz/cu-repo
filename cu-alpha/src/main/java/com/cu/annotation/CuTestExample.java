package com.cu.annotation;

import com.cu.annotation.CuTest;
import com.cu.annotation.CuTesterInfo;
import com.cu.annotation.CuTesterInfo.Priority;

@CuTesterInfo(priority = Priority.HIGH, createdBy = "cu", tags = {"cu", "test"}) 
public class CuTestExample {
	@CuTest void testA() {
		if (true)
			throw new RuntimeException("this always fails!");
	}
	
	@CuTest(enabled = false) void testB() {
		if (false)
			throw new RuntimeException("this always passes!");
	}
	
	@CuTest(enabled = true) void testC() {
		if (10 > 1) {
			// do nothing, this test always passes
		}
	}
}
