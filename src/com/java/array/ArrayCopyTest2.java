package com.java.array;

import java.util.Arrays;

public class ArrayCopyTest2 {
	public static void main(String[] args) {
		String[] arr1 = { "Java", "Êý×é", "×Ö·û´®", "¸´ÖÆ" };
		String[] arr2 = new String[8];
		String[] arr3 = new String[8];
		System.arraycopy(arr1, 0, arr2, 2, 4);
		System.arraycopy(arr1, 2, arr3, 5, 2);
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
	}
}
