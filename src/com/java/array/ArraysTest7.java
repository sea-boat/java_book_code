package com.java.array;

import java.util.Arrays;

public class ArraysTest7 {
	public static void main(String[] args) {
		int[] arr1 = new int[10];
		int[] arr2 = new int[10];
		Arrays.fill(arr1, 10);
		Arrays.fill(arr2, 3, 7, 10);
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
	}
}
