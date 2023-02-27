package com.java.array;

import java.util.Arrays;
import java.util.function.IntBinaryOperator;

public class ArraysTest4 {
	public static void main(String[] args) {
		int[] array = { 2, 4, 1, 3, 5 };
		Arrays.parallelPrefix(array, new IntBinaryOperator() {
			public int applyAsInt(int left, int right) {
				return left + right;
			}
		});
		System.out.println(Arrays.toString(array));
	}
}
