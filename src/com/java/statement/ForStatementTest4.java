package com.java.statement;

public class ForStatementTest4 {
	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			if (i == 2) {
				System.out.println("��ǰ���� for ѭ��");
				break;
			}
			System.out.println("i=" + i);
		}
	}
}
