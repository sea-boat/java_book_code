package com.java.function;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MethodRefTest {

	public static void main(String[] args) {
		//对象的实例方法引用
		Random random = new Random();
		Supplier<Integer> supplier = random::nextInt;
		System.out.println("获取随机数：" + supplier.get());
		String s = "你好";
		Predicate<String> predicate = s::equals;
		System.out.println("是否相等：" + predicate.test("你好"));
		Consumer<String> consumer = System.out::println;
		consumer.accept("hello world");

		//类的静态方法引用
		Function<Integer, String> function = String::valueOf;
		System.out.println("int转为字符串对象：" + function.apply(5));

		//类的实例方法引用
		Function<String, Integer> function2 = String::length;
		System.out.println("计算字符串长度：" + function2.apply("hello"));

		//类的构造方法引用
		Function<String, String> function3 = String::new;
		System.out.println("生成字符串：" + function3.apply("hello hello"));
	}

}
