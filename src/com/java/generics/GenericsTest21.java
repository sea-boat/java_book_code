package com.java.generics;

public class GenericsTest21 {

	public static <E extends Number> void printArray(E[] arr) {
		for (E s : arr)
			System.out.println(s);
	}

	public static void printArray2(Number[] arr) {
		for (Number s : arr)
			System.out.println(s);
	}
}
