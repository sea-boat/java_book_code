package com.java.statement;

public class ReturnStatementTest {
	public static int addition(int a, int b) {
		int sum;
		sum = a + b;
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(ReturnStatementTest.addition(10, 5));
	}
}
