package com.java.generics;

public class GenericsTest3 {

	public static void main(String[] args) {
		String[] sArr = { "hello", "java", "world" };
		Integer[] iArr = { 1, 2, 3 };
		Long[] lArr = { 1L, 2L, 3L };
		StringArray sa = new StringArray(sArr);
		IntegerArray ia = new IntegerArray(iArr);
		LongArray la = new LongArray(lArr);
	}

}

class StringArray {
	String[] arr;

	public StringArray(String[] arr) {
		this.arr = arr;
	}
}

class IntegerArray {
	Integer[] arr;

	public IntegerArray(Integer[] arr) {
		this.arr = arr;
	}
}

class LongArray {
	Long[] arr;

	public LongArray(Long[] arr) {
		this.arr = arr;
	}
}