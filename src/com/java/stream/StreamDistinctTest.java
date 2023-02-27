package com.java.stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamDistinctTest {
	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(1, 1, 3, 2, 3, 1, 1, 2);
		stream = stream.distinct();
		System.out.println(Arrays.toString(stream.toArray()));
	}
}
