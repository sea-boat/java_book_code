package com.java.generics;

public class GenericsTest2 {

	public static void main(String[] args) {
		String[] strArr = { "hello", "java", "world" };
		Integer[] intArr = { 1, 2, 3 };
		Long[] longArr = { 1L, 2L, 3L };
		printArray(strArr);
		printArray(intArr);
		printArray(longArr);
	}

	public static <E> void printArray(E[] arr) {
		for (E s : arr)
			System.out.println(s);
	}

}
