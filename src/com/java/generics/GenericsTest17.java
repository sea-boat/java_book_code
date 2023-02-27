package com.java.generics;

public class GenericsTest17 {

	public static void main(String[] args) {
		GeArray<Integer> gia = new GeArray<Integer>(new Integer[] { 1, 2, 3 });
		GeArray<String> gsa = new GeArray<String>(new String[] { "hello", "java" });
		test(gia);
		test(gsa);
		test2(gia);
		test2(gsa);
	}

	public static void test(GeArray<?> arr) {
		for (Object o : arr.arr) {
			System.out.print(o);
		}
		System.out.println();
	}

	public static <T> void test2(GeArray<T> arr) {
		for (T t : arr.arr) {
			System.out.print(t);
		}
		System.out.println();
	}
}

class GeArray<T> {
	T[] arr;

	public GeArray(T[] arr) {
		this.arr = arr;
	}
}