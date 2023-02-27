package com.java.function;

import java.util.function.Function;

public class FunctionTest {
	public static void main(String[] args) {
		Function<String, String> function = (s) -> s.toUpperCase();
		Function<Integer, String> function2 = (i) -> {
			int result = i * 10;
			return i + "����ʮ�Ľ��Ϊ��" + result;
		};
		System.out.println(function.apply("test"));
		System.out.println(function2.apply(2));
	}
}
