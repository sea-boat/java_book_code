package com.java.stream;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamSumTest {
	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(1, 1, 3, 2, 3, 1, 1, 2);
		Stream<Integer> stream2 = Stream.of(1, 1, 3, 2, 3, 1, 1, 2);
		List<Integer> list = stream.collect(Collectors.toList());
		Set<Integer> set = stream2.collect(Collectors.toSet());
		System.out.println(list);
		System.out.println(set);
	}
}
