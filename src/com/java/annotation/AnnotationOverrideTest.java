package com.java.annotation;

public class AnnotationOverrideTest implements AA {

	@Override
	public String toString() {
		return "Hello";
	}

	@Override
	public void test() {
		System.out.println("test");
	}
}

interface AA {
	public void test();
}