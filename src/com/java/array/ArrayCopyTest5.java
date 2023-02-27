package com.java.array;

import java.util.Arrays;

public class ArrayCopyTest5 {
	public static void main(String[] args) {
		String[] arr1 = { "Java", "Êý×é", "×Ö·û´®", "¸´ÖÆ" };
		String[] arr2 = arr1.clone();
		System.out.println(arr1 == arr2);
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
	}
}
