package com.java.operator;

public class OperatorSubtractionTest {
	public static void main(String[] args) {
		byte a = 2;
		short b = 3;
		int c = 4;
		long d = 5;
		float e = 1.6f;
		double f = 2.5d;
		int result1 = b - a;
		int result2 = c - c;
		System.out.println("b-a=" + result1);
		System.out.println("c-c=" + result2);
		System.out.println("d-c=" + (d - c));
		System.out.println("b-e=" + (b - e));
		System.out.println("f-e=" + (f - e));
		System.out.println("f-f=" + (f - f));
		System.out.println("5-2=" + (5 - 2));
	}
}
