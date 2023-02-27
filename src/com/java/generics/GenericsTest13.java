package com.java.generics;

public class GenericsTest13 {

	public static void main(String[] args) {
		GenericsArray<Integer> gia = new GenericsArray<Integer>(new Integer[] { 1, 2, 3 });
		GenericsArray<Long> gla = new GenericsArray<Long>(new Long[] { 4L, 5L, 6L });
		GenericsArray<String> gsa = new GenericsArray<String>(new String[] { "hello", "java" });
		test(gia);
		test(gla);
		// String 不为 Number 的子类，所以编译报错
//		test(gsa)
	}

	public static void test(GenericsArray<? extends Number> arr) {

	}

}
