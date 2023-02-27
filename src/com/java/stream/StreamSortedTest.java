package com.java.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class StreamSortedTest {
	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(1, 5, 3, 8, 4, 2, 3, 2);
		Stream<Integer> stream2 = Stream.of(1, 5, 3, 8, 4, 2, 3, 2);
		//默认升序排序
		stream = stream.sorted();
		System.out.println(Arrays.toString(stream.toArray()));
		//通过自定义比较器进行降序排序
		Comparator<Integer> comparator = (a, b) -> b - a;
		stream2 = stream2.sorted(comparator);
		System.out.println(Arrays.toString(stream2.toArray()));
	}
}
