package com.java.array;

import java.util.Arrays;

public class ArrayCopyTest {
	public static void main(String[] args) {
		String[] arr1 = { "Java", "数组", "字符串" };
		//复制操作
		String[] arr2 = new String[arr1.length];
		for (int i = 0; i < arr2.length; i++)
			arr2[i] = arr1[i];
		System.out.println(arr1 == arr2);
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
	}
}
