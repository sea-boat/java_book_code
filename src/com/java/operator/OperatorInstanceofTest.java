package com.java.operator;

public class OperatorInstanceofTest {
	public static void main(String[] args) {
		int a = 2 * 3 + 4 + 5;
		int b = 2 * (3 + 4) + 5;
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		test();
	}

	public static void test() {
		System.out.println("call test method.");
	}
}
