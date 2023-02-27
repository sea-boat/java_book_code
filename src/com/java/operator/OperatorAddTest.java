package com.java.operator;

public class OperatorAddTest {
	public static void main(String[] args) {
		byte a = 2;
		short b = 3;
		int c = 4;
		long d = 5;
		float e = 1.6f;
		double f = 2.5d;
		int result1 = a + b;
		int result2 = c + c;
		System.out.println("a+b=" + result1);
		System.out.println("c+c=" + result2);
		System.out.println("c+d=" + (c + d));
		System.out.println("b+e=" + (b + e));
		System.out.println("e+f=" + (e + f));
		System.out.println("f+f=" + (f + f));
		System.out.println("1+2=" + (1 + 2));
	}
}
