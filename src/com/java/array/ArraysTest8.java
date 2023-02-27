package com.java.array;

import java.util.Arrays;

public class ArraysTest8 {
	public static void main(String[] args) {
		int[] arr1 = { 10, 24, 46, 78, 54, 32 };
		int[] arr2 = Arrays.copyOf(arr1, 4);
		int[] arr3 = Arrays.copyOf(arr1, 10);
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
	}
}
