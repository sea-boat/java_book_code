package com.java.operator;

public class OperatorConditionTest {
	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		int c = 4 > 3 ? 1 : 2;
		int d = a == b ? a + 1 : b + 3;
		int e = a != b ? a + 1 : b + 3;
		System.out.println("c=" + c);
		System.out.println("d=" + d);
		System.out.println("e=" + e);
	}
}
