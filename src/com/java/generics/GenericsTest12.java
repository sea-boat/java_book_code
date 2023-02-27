package com.java.generics;

public class GenericsTest12 {

	public static void main(String[] args) {
		// ��������ʱָ��ĳ������
		GenericsArray<Integer> gia = new GenericsArray<Integer>(new Integer[] { 1, 2, 3 });
		GenericsArray<Long> gla = new GenericsArray<Long>(new Long[] { 4L, 5L, 6L });
		gia.addArray();
		gla.addArray();
		// ��������ʱָ��Ϊ ? ����
		GenericsArray<?> ga;
		ga = new GenericsArray<Integer>(new Integer[] { 1, 2, 3 });
		ga.addArray();
		ga = new GenericsArray<Long>(new Long[] { 4L, 5L, 6L });
		ga.addArray();
	}

}

class GenericsArray<T> {
	T[] arr;

	public GenericsArray(T[] arr) {
		this.arr = arr;
	}

	public void addArray() {
		Long sum = 0L;
		for (Object i : arr) {
			sum = sum + Long.valueOf(i.toString());
		}
		System.out.println("result is " + sum);
	}
}
