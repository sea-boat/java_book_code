package com.java.statement;

public class IfStatementTest5 {
	public static void main(String[] args) {
		int score = 78;
		if (score >= 85 && score <= 100) {
			System.out.println("优秀");
		} else if (score >= 75 && score <= 84) {
			System.out.println("良好");
		} else if (score >= 60 && score <= 74) {
			System.out.println("中等");
		} else {
			System.out.println("差");
		}
	}
}
