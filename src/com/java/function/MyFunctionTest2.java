package com.java.function;

public class MyFunctionTest2 {
	public static void main(String[] args) {
		Function<String, String> function = new Function<String, String>() {
			@Override
			public String apply(String t) {
				return t.toUpperCase();
			}

		};
		Function<Integer, String> function2 = new Function<Integer, String>() {

			@Override
			public String apply(Integer i) {
				int result = i * 10;
				return i + "乘以十的结果为：" + result;
			}
		};
		System.out.println(function.apply("test"));
		System.out.println(function2.apply(2));
	}
}
