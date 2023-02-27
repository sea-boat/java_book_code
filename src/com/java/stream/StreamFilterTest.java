package com.java.stream;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamFilterTest {
	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(1, 6, 9, 2, 4, 6, 1, 7);
		Predicate<Integer> predicate = (i) -> i > 5;
		stream = stream.filter(predicate);
		System.out.println(Arrays.toString(stream.toArray()));
	}
}
