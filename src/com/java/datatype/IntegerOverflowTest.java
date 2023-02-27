package com.java.datatype;

public class IntegerOverflowTest {

	public static void main(String args[]) {
		int maxValue = 2147483647;
		int minValue = -2147483648;
		System.out.println("int最大值再加1：" + (maxValue + 1));
		System.out.println("int最大值再加2：" + (maxValue + 2));
		System.out.println("int最大值再加3：" + (maxValue + 3));
		System.out.println("int最小值再减1：" + (minValue - 1));
		System.out.println("int最小值再减2：" + (minValue - 2));
		System.out.println("int最小值再减3：" + (minValue - 3));

		System.out.println("int最大值再加1：" + ((long)maxValue + 1));
		System.out.println("int最大值再加2：" + ((long)maxValue + 2));
		System.out.println("int最大值再加3：" + ((long)maxValue + 3));
		System.out.println("int最小值再减1：" + ((long)minValue - 1));
		System.out.println("int最小值再减2：" + ((long)minValue - 2));
		System.out.println("int最小值再减3：" + ((long)minValue - 3));
	}

}
