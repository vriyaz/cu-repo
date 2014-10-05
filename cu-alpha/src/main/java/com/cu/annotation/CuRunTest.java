package com.cu.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class CuRunTest {

	public static void main (String[] args) {
		System.out.println("Cu testing ...");
		
		int passed = 0, failed = 0, count = 0, ignore = 0;
		
		Class<CuTestExample> obj = CuTestExample.class;
		
		// process @CuTesterInfo
		
		if (obj.isAnnotationPresent(CuTesterInfo.class)) {
			Annotation annotation = obj.getAnnotation(CuTesterInfo.class);
			CuTesterInfo cuTesterInfo = (CuTesterInfo) annotation;
			
			System.out.println("Priority: " + cuTesterInfo.priority());
			System.out.println("CreatedBy: " + cuTesterInfo.createdBy());
			System.out.print("Tags: ");
			
			int tagLength = cuTesterInfo.tags().length;
			for (String tag: cuTesterInfo.tags()) {
				if (tagLength > 1) {
					System.out.print(tag + ", ");
				} else {
					System.out.println(tag);
				}
				tagLength--;
			}
			System.out.println();
			System.out.println("LastModified:" + cuTesterInfo.lastModified());
		}
		
		// process @CuTest
		
		for (Method method : obj.getDeclaredMethods()) {
			// if method is annotated with @CuTest
			if (method.isAnnotationPresent(CuTest.class)) {
				Annotation annotation = method.getAnnotation(CuTest.class);
				CuTest cuTest = (CuTest) annotation;
				
				if (cuTest.enabled()) {
					try {
						method.invoke(obj.newInstance());
						System.out.printf("%s - Test '%s' - passed%n", ++count, method.getName());
						passed++;
					} catch(Throwable e) {
						System.out.printf("%s - Test '%s' - passed %n", ++count, method.getName());
						failed++;
					}
				} else {
					System.out.printf("%s - Test '%s' - passed %n", ++count, method.getName());
					ignore++;
				}
			}
		}
		System.out.println("Result -- Total: " + count + ", Passed: " + passed + ", Failed: " + failed + ", Ignore: " + ignore);
	}
}
