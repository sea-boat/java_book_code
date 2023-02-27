package com.java.array;

import java.util.Arrays;
import java.util.function.IntUnaryOperator;

public class ArraysTest9 {
	public static void main(String[] args) {
		int[] arr1 = { 10, 24, 46, 78, 54, 32 };
		Arrays.setAll(arr1, new IntUnaryOperator() {
			public int applyAsInt(int index) {
				return arr1[index] * 2;
			}
		});
		System.out.println(Arrays.toString(arr1));
	}
}
