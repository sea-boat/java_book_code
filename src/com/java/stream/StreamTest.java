package com.java.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamTest {
	public static void main(String[] args) {
		//ֱ�ӷ�ʽ
		Stream<String> stream = Stream.of("С��", "С��", "С��", "С��");
		System.out.println(Arrays.toString(stream.toArray()));

		//���Ϸ�ʽ
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		Stream<String> stream2 = list.stream();
		System.out.println(Arrays.toString(stream2.toArray()));

		//���鷽ʽ
		String[] ss = { "aa", "bb", "cc" };
		Stream<String> stream3 = Arrays.stream(ss);
		System.out.println(Arrays.toString(stream3.toArray()));

		//Supplier��ʽ
		Supplier<Integer> supplier = () -> (int) (Math.random() * 100);
		Stream<Integer> stream4 = Stream.generate(supplier);
		System.out.println(Arrays.toString(stream4.limit(5).toArray()));

	}
}
