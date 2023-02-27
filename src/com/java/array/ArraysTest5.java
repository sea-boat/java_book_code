package com.java.array;

import java.util.Arrays;

public class ArraysTest5 {
	public static void main(String[] args) {
		int[] arr1 = { 10, 24, 46, 78, 97, 110, 135 };
		int index1 = Arrays.binarySearch(arr1, 78);
		System.out.println("数组中78所对应的索引值为：" + index1);
		System.out.println(Arrays.toString(arr1));

		int[] arr2 = { 100, 24, 466, 78, 297, 110, 735 };
		Arrays.sort(arr2);
		int index2 = Arrays.binarySearch(arr2, 110);
		System.out.println("数组中110所对应的索引值为：" + index2);
		System.out.println(Arrays.toString(arr2));
	}
}
