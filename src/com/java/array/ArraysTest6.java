package com.java.array;

import java.util.Arrays;

public class ArraysTest6 {
	public static void main(String[] args) {
		int[] arr1 = { 10, 24, 46, 78 };
		int[] arr2 = { 10, 24, 46 };
		int[] arr3 = { 10, 24, 46, 78 };
		String[] arr4 = { "Java", "数组", "大小" };
		String[] arr5 = { "Java", "数组", "大小" };
		System.out.println(Arrays.equals(arr1, arr2));
		System.out.println(Arrays.equals(arr1, arr3));
		System.out.println(Arrays.equals(arr4, arr5));
	}
}
