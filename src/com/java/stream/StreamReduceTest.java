package com.java.stream;

import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class StreamReduceTest {
	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(1, 1, 3, 2, 3, 1, 1, 2);
		BinaryOperator<Integer> bo = (sum, item) -> {
			sum = sum + item;
			return sum;
		};
		int result = stream.reduce(bo).get();
		System.out.println(result);
	}
}
