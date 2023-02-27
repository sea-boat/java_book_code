package com.java.function;

public class MethodRefTest2 {

	@FunctionalInterface
	interface Calculator {
		int calc(int a, int b);
	}

	public int add(int a, int b) {
		return a + b;
	}

	public static int sub(int a, int b) {
		return a - b;
	}

	public static void main(String[] args) {
		MethodRefTest2 mrt = new MethodRefTest2();
		Calculator calculator = mrt::add;
		Calculator calculator2 = MethodRefTest2::sub;
		System.out.println(calculator.calc(3, 6));
		System.out.println(calculator2.calc(10, 4));
	}

}
