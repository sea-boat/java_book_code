package com.java.datatype;

public class IntegerOverflowTest {

	public static void main(String args[]) {
		int maxValue = 2147483647;
		int minValue = -2147483648;
		System.out.println("int���ֵ�ټ�1��" + (maxValue + 1));
		System.out.println("int���ֵ�ټ�2��" + (maxValue + 2));
		System.out.println("int���ֵ�ټ�3��" + (maxValue + 3));
		System.out.println("int��Сֵ�ټ�1��" + (minValue - 1));
		System.out.println("int��Сֵ�ټ�2��" + (minValue - 2));
		System.out.println("int��Сֵ�ټ�3��" + (minValue - 3));

		System.out.println("int���ֵ�ټ�1��" + ((long)maxValue + 1));
		System.out.println("int���ֵ�ټ�2��" + ((long)maxValue + 2));
		System.out.println("int���ֵ�ټ�3��" + ((long)maxValue + 3));
		System.out.println("int��Сֵ�ټ�1��" + ((long)minValue - 1));
		System.out.println("int��Сֵ�ټ�2��" + ((long)minValue - 2));
		System.out.println("int��Сֵ�ټ�3��" + ((long)minValue - 3));
	}

}
