package com.java.generics;

public class GenericsTest11 {

	public static void main(String[] args) {
		String[] strArr = { "hello", "java", "world" };
		Integer[] intArr = { 1, 2, 3 };
		Long[] longArr = { 1L, 2L, 3L };
		printArray(intArr);
		printArray(longArr);
		// ��������� printArray(String[])����Ϊ String ���� Number ������
//		printArray(strArr);w
	}

	public static <E extends Number> void printArray(E[] arr) {
		for (E s : arr)
			System.out.println(s);
	}

}
