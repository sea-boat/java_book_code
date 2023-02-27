package com.java.operator;

public class OperatorPriorityTest3 {
	public static void main(String[] args) {
		int a = 3;
		int b = 3;
		int c = a != 3 ? b : b == 3 ? 1 : 0;
		System.out.println(c);
	}
}
