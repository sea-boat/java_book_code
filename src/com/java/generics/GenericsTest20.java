package com.java.generics;

public class GenericsTest20 {

}

class GeneArray<T> {
	T[] arr;

	public GeneArray(T[] arr) {
		this.arr = arr;
	}

	public void test(GeneArray<? extends Number> arr) {

	}

	public <T extends Number> void test2(GeneArray<T> arr) {

	}
}