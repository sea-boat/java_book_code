package com.java.statement;

public class SwitchStatementTest4 {
	public static void main(String[] args) {
		int id = 36;
		switch (id % 10) {
		case 3:
			System.out.println("�����ײ�һ");
			break;
		case 6:
			System.out.println("�����ײͶ�");
			break;
		case 9:
			System.out.println("�����ײ���");
			break;
		default:
			System.out.println("û�н�");
			break;
		}
	}
}
