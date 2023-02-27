package com.java.statement;

public class ForStatementTest4 {
	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			if (i == 2) {
				System.out.println("提前结束 for 循环");
				break;
			}
			System.out.println("i=" + i);
		}
	}
}
