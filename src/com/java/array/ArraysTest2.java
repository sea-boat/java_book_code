package com.java.array;

import java.util.Arrays;

public class ArraysTest2 {
	public static void main(String[] args) {
		int[] arr1 = { 3, 4, 2, 7, 1, 4, 9 };
		String[] arr2 = { "C", "T", "A", "D" };
		String[] arr3 = { "Java", "Array", "array", "two", "Three" };
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		Arrays.sort(arr3);
		System.out.println("========≈≈–Ú∫Û=======");
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
	}
}
