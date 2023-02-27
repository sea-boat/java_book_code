package com.java.array;

import java.util.Arrays;

public class ArraysTest {
	public static void main(String[] args) {
		String[] arr1 = { "Java", "����", "�ַ���" };
		String[][] arr2 = { { "Java", "����" }, { "��ά", "�ַ���" }, { "Arrays", "��" } };
		System.out.println(arr1);
		System.out.println(arr2);
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.deepToString(arr2));
	}
}
