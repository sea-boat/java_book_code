package com.java.function;

public class MyFunctionTest {
	public static void main(String[] args) {
		Function<String, String> function = new MyFunction();
		Function<Integer, String> function2 = new MyFunction2();
		System.out.println(function.apply("test"));
		System.out.println(function2.apply(2));
	}
}

class MyFunction implements Function<String, String> {

	@Override
	public String apply(String t) {
		return t.toUpperCase();
	}

}

class MyFunction2 implements Function<Integer, String> {

	@Override
	public String apply(Integer i) {
		int result = i * 10;
		return i + "乘以十的结果为：" + result;
	}

}