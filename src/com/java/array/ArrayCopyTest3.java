package com.java.array;

import java.util.Arrays;

public class ArrayCopyTest3 {
	public static void main(String[] args) {
		String[] arr1 = { "Java", "Êý×é", "×Ö·û´®", "¸´ÖÆ" };
		String[] arr2 = Arrays.copyOf(arr1, arr1.length);
		String[] arr3 = Arrays.copyOf(arr1, 3);
		String[] arr4 = Arrays.copyOf(arr1, 6);
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
	}
}
