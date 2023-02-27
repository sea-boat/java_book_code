package com.java.generics;

public class GenericsTest10 {

	public static void main(String[] args) {
		String[] sArr = { "hello", "java", "world" };
		Integer[] iArr = { 1, 2, 3 };
		Long[] lArr = { 1L, 2L, 3L };
		GArray<Integer> ia = new GArray<Integer>(iArr);
		GArray<Long> la = new GArray<Long>(lArr);
//		//������ʹ�� GArray<String>����Ϊ String ���� Number ������
//		GArray<String> sa = new GArray<String>(sArr);
	}

}

class GArray<T extends Number> {
	T[] arr;

	public GArray(T[] arr) {
		this.arr = arr;
	}
}
