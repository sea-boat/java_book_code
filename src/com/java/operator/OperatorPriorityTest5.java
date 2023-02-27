package com.java.operator;

public class OperatorPriorityTest5 {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 3;
		if (a + 1 == 2 || b == 1 && c == 1) {
			System.out.println("条件成立");
		}
	}
}
