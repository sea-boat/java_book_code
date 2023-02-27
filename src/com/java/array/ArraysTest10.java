package com.java.array;

import java.util.Arrays;

public class ArraysTest10 {
	public static void main(String[] args) {
		int[] arr2 = { 100, 24, 466, 78, 297, 110, 735 };
		Arrays.sort(arr2);
		for (int i = arr2.length - 1; i >= 0; i--)
			System.out.println(arr2[i]);
	}
}
