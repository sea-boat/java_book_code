package com.java.statement;

public class IfStatementTest5 {
	public static void main(String[] args) {
		int score = 78;
		if (score >= 85 && score <= 100) {
			System.out.println("����");
		} else if (score >= 75 && score <= 84) {
			System.out.println("����");
		} else if (score >= 60 && score <= 74) {
			System.out.println("�е�");
		} else {
			System.out.println("��");
		}
	}
}
