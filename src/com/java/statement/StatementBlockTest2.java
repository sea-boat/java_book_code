package com.java.statement;

public class StatementBlockTest2 {
	public static void main(String[] args) {
		boolean condition = true;
		if (condition) { // ����1��ʼ
			System.out.println("����1");
			System.out.println("����1");
		} // ����1����
		else { // ����2��ʼ
			System.out.println("����2");
			System.out.println("����2");
		} // ����2����
	}
}