package com.java.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ ElementType.METHOD, ElementType.TYPE })
public @interface MyTarget {

	String name() default "test";

}
