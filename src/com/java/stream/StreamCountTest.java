package com.java.stream;

import java.util.stream.Stream;

public class StreamCountTest {
	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(1, 1, 3, 2, 3, 1, 1, 2);
		System.out.println(stream.count());
	}
}
