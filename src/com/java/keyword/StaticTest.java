package com.java.keyword;

public class StaticTest {

	public void instanceMethod() {
		System.out.println("实例方法");
	}

	public static void staticMethod() {
		System.out.println("静态方法");
	}

	public static void main(String[] args) {
		StaticTest st = new StaticTest();
		st.instanceMethod();
		StaticTest.staticMethod();
	}

}
