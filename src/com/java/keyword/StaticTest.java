package com.java.keyword;

public class StaticTest {

	public void instanceMethod() {
		System.out.println("ʵ������");
	}

	public static void staticMethod() {
		System.out.println("��̬����");
	}

	public static void main(String[] args) {
		StaticTest st = new StaticTest();
		st.instanceMethod();
		StaticTest.staticMethod();
	}

}
