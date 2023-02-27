package com.java.generics;

public class GenericsTest {

	public static void main(String[] args) {
		String[] strArr = { "hello", "java", "world" };
		Integer[] intArr = { 1, 2, 3 };
		Long[] longArr = { 1L, 2L, 3L };
		printArray(strArr);
		printArray(intArr);
		printArray(longArr);
	}

	public static void printArray(String[] arr) {
		for (String s : arr)
			System.out.println(s);
	}

	public static void printArray(Integer[] arr) {
		for (Integer i : arr)
			System.out.println(i);
	}

	public static void printArray(Long[] arr) {
		for (long l : arr)
			System.out.println(l);
	}

}
