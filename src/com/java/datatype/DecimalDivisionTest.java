package com.java.datatype;

public class DecimalDivisionTest {
	public static void main(String[] args) {
		int a = 2;
		int b = 3;
		double c = 0.2;
		System.out.println(a / b);
		System.out.println((float) a / b);
		System.out.println(a / (float) b);
		System.out.println((double) a / b);
		System.out.println(a / (double) b);
		System.out.println(a / c);
	}
}
