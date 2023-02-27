package com.java.array;

import java.util.Arrays;
import java.util.function.IntUnaryOperator;

public class ArraysTest11 {
	public static void main(String[] args) {
		int[] arr1 = { 4, 20, 6, 9, 12 };
		Arrays.setAll(arr1, new IntUnaryOperator() {
			public int applyAsInt(int index) {
				return arr1[index] * arr1[index];
			}
		});
		System.out.println(Arrays.toString(arr1));
	}
}
