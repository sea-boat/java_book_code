package com.java.generics;

public class GenericsTest19 {

	public static void test(GeneArray<?> ga) {
//		?[] t = ga.arr;
	}

	public static <T> void test2(GeneArray<T> ga) {
		T[] t = ga.arr;
	}

}

//class GeneArray<T> {
//	T[] arr;
//
//	public GeneArray(T[] arr) {
//		this.arr = arr;
//	}
//}