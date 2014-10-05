package com.cu.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface CuTesterInfo {
	public enum Priority { LOW, MEDIUM, HIGH };
	
	Priority priority() default Priority.MEDIUM;
	
	String[] tags() default "";
	String createdBy() default "com.cu.annotation";
	String lastModified() default "10/05/2014";
}
