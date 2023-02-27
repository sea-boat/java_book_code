package com.java.generics;

public class GenericsTest15 {

	public static void main(String[] args) {
		GenericsArray<Integer> gia = new GenericsArray<Integer>(new Integer[] { 1, 2, 3 });
		GenericsArray<Long> gla = new GenericsArray<Long>(new Long[] { 4L, 5L, 6L });
		GenericsArray<? super Integer> ga;
		ga = new GenericsArray<Integer>(new Integer[] { 1, 2, 3 });
//		ga = new GenericsArray<Long>(new Long[] { 4L, 5L, 6L });
	}

}

