package com.java.operator;

public class OperatorPriorityTest2 {
	public static void main(String[] args) {
		int a = 3;
		int b = 3;
		int c = ++a + --b * a++ / b-- >> 2 % a--;
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println("c=" + c);
	}
}
