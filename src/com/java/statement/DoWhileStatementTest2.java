package com.java.statement;

public class DoWhileStatementTest2 {
	public static void main(String[] args) {
		int i = 0;
		do {
			System.out.println(i);
			i++;
			if (i == 2)
				continue;
			if (i == 3)
				break;
		} while (i < 5);
	}
}
