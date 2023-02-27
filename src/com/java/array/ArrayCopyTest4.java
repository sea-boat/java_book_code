package com.java.array;

import java.util.Arrays;

public class ArrayCopyTest4 {
	public static void main(String[] args) {
		String[] arr1 = { "Java", "Êý×é", "×Ö·û´®", "¸´ÖÆ" };
		String[] arr2 = Arrays.copyOfRange(arr1, 0, 4);
		String[] arr3 = Arrays.copyOfRange(arr1, 1, 3);
		String[] arr4 = Arrays.copyOfRange(arr1, 2, 6);
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
	}
}
