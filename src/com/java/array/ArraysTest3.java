package com.java.array;

import java.util.Arrays;
import java.util.Random;

public class ArraysTest3 {
	public static void main(String[] args) {
		int[] arr = new int[10000000];
		int[] arr2 = new int[10000000];
		Random r = new Random();
		for (int i = 0; i < arr.length; i++)
			arr[i] = r.nextInt(10000000);
		System.arraycopy(arr, 0, arr2, 0, arr.length);
		long t1 = System.currentTimeMillis();
		Arrays.sort(arr);
		System.out.println("单线程排序耗时：" + String.valueOf(System.currentTimeMillis() - t1));
		long t2 = System.currentTimeMillis();
		Arrays.parallelSort(arr2);
		System.out.println("并行排序耗时：" + String.valueOf(System.currentTimeMillis() - t2));
	}
}
