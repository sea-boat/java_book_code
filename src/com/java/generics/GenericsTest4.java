package com.java.generics;

public class GenericsTest4 {

	public static void main(String[] args) {
		String[] sArr = { "hello", "java", "world" };
		Integer[] iArr = { 1, 2, 3 };
		Long[] lArr = { 1L, 2L, 3L };
		Array<String[]> sa = new Array<String[]>(sArr);
		Array<Integer[]> ia = new Array<Integer[]>(iArr);
		Array<Long[]> la = new Array<Long[]>(lArr);
	}

}

class Array<T> {
	T arr;

	public Array(T arr) {
		this.arr = arr;
	}
}
