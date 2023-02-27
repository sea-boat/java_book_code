package com.java.stream;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamForEachTest {
	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(1, 1, 3, 2, 3, 1, 1, 2);
		Consumer<Integer> consumer = (i) -> {
			int a = 2 * i;
			System.out.print(a + " ");
		};
		stream.forEach(consumer);
	}
}
