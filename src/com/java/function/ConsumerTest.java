package com.java.function;

import java.util.function.Consumer;

public class ConsumerTest {
	public static void main(String[] args) {
		Consumer<String> consumer = (s) -> System.out.println(s);
		Consumer<Integer> consumer2 = (i) -> {
			int result = i * 10;
			System.out.println(i + "乘以十的结果为：" + result);
		};
		consumer.accept("test");
		consumer2.accept(10);
	}
}
