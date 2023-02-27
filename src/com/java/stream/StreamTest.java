package com.java.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamTest {
	public static void main(String[] args) {
		//直接方式
		Stream<String> stream = Stream.of("小明", "小红", "小东", "小燕");
		System.out.println(Arrays.toString(stream.toArray()));

		//集合方式
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		Stream<String> stream2 = list.stream();
		System.out.println(Arrays.toString(stream2.toArray()));

		//数组方式
		String[] ss = { "aa", "bb", "cc" };
		Stream<String> stream3 = Arrays.stream(ss);
		System.out.println(Arrays.toString(stream3.toArray()));

		//Supplier方式
		Supplier<Integer> supplier = () -> (int) (Math.random() * 100);
		Stream<Integer> stream4 = Stream.generate(supplier);
		System.out.println(Arrays.toString(stream4.limit(5).toArray()));

	}
}
