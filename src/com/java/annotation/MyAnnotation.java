package com.java.annotation;

import java.lang.annotation.Documented;

@Documented
public @interface MyAnnotation {

	String name() default "test";

	public int value();

	String[] messages();

}
