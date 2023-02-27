package com.java.annotation;

public class AnnotationDeprecatedTest {
	public static void main(String[] args) {
		DeprecatedClass d = new DeprecatedClass();
		d.test();
		String s = d.name;
	}
}

@Deprecated
class DeprecatedClass {
	@Deprecated
	public String name;
	
	@Deprecated
	public void test() {
		System.out.println("test");
	}
}