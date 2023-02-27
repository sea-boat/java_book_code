package com.java.annotation;

public class AnnotationDeprecatedTest2 {
	public static void main(String[] args) {
		DeprecatedClass d = new DeprecatedClass();
		d.test();
		String s = d.name;
	}
}

//class DeprecatedClass {
//	public String name;
//
//	@Deprecated(since = "9", forRemoval = true)
//	public void test() {
//		System.out.println("test");
//	}
//}