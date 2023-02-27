package com.java.function;

public class MyFunctionTest4 {
	public static void main(String[] args) {
		Calculator<Integer> f = (a, b, c) -> {
			return a + b + c;
		};
		System.out.println(f.calc(2, 5, 7));
	}
}

@FunctionalInterface
interface Calculator<R> {
	R calc(int i, int j, int k);
}