package com.java.generics;

public class GenericsTest14 {

	public static void main(String[] args) {
		GenericsArray<Number> gia = new GenericsArray<Number>(new Integer[] { 1, 2, 3 });
		GenericsArray<Object> gla = new GenericsArray<Object>(new Object[] { 4, 5, 6 });
		GenericsArray<Integer> gsa = new GenericsArray<Integer>(new Integer[] { 1, 2, 3 });
		test(gia);
		test(gla);
		// Integer ��Ϊ Number �ĸ��࣬���Ա��뱨��
//		test(gsa)
	}

	public static void test(GenericsArray<? super Number> arr) {

	}

}
