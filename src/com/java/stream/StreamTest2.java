package com.java.stream;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Stream;

public class StreamTest2 {
	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8);
		Function<Integer, Integer> f = (x) -> 2 * x;
		Stream<Integer> stream2 = stream.map(f);
		System.out.println(Arrays.toString(stream2.toArray()));

	}
}
