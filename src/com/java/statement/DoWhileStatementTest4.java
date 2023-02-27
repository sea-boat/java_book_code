package com.java.statement;

public class DoWhileStatementTest4 {
	public static void main(String[] args) {
		int result = 1;
		int i = 1;
		do {
			result = result * i;
			i++;
		} while (i <= 10);
		System.out.println(result);
	}
}
