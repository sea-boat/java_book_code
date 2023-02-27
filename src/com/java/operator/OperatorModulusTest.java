package com.java.operator;

public class OperatorModulusTest {
	public static void main(String[] args) {
		byte a = 2;
		short b = 3;
		int c = 4;
		long d = 10;
		float e = 11.6f;
		double f = 2.5d;
		System.out.println("b%a=" + (b % a));
		System.out.println("c%c=" + (c % c));
		System.out.println("d%c=" + (d % c));
		System.out.println("e%b=" + (e % b));
		System.out.println("e%f=" + (e % f));
		System.out.println("10%3=" + (10 % 3));
	}
}
