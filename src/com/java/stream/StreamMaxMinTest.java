package com.java.stream;

import java.util.Comparator;
import java.util.stream.Stream;

public class StreamMaxMinTest {
	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(1, 1, 3, 2, 3, 1, 1, 2);
		Stream<Integer> stream2 = Stream.of(1, 1, 3, 2, 3, 1, 1, 2);
		Comparator<Integer> comparator = (a, b) -> a - b;
		int result = stream.max(comparator).get();
		int result2 = stream2.min(comparator).get();
		System.out.println(result);
		System.out.println(result2);
	}
}
