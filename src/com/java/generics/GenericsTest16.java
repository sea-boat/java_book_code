package com.java.generics;

public class GenericsTest16 {

	public static void main(String[] args) {
		GenArray<Integer> gia = new GenArray<Integer>(new Integer[] { 1, 2, 3 });
		GenArray<String> gsa = new GenArray<String>(new String[] { "hello", "java" });
		gia.add(4);
		gsa.add("www");
		System.out.println(size(gia));
	}

	public static int size(GenArray<?> ga) {
		return ga.arr.length;
	}
}

class GenArray<T> {
	Object[] arr;

	public GenArray(T[] arr) {
		this.arr = arr;
	}

	public void add(T t) {
		Object[] newArr = new Object[arr.length + 1];
		System.arraycopy(arr, 0, newArr, 0, arr.length);
		newArr[arr.length] = t;
		this.arr = newArr;
	}

}