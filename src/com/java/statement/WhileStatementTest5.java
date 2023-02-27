package com.java.statement;

public class WhileStatementTest5 {
	public static void main(String[] args) {
		int result = 1;
		int i = 1;
		while (i <= 10) {
			result = result * i;
			i++;
		}
		System.out.println(result);
	}
}
