package com.java.statement;

public class IfStatementTest4 {
	public static void main(String[] args) {
		int age = 30;
		if (age <= 14) {
			System.out.println("����");
		} else if (age > 14 && age < 65) {
			if (age < 35) {
				System.out.println("����");
			} else {
				System.out.println("����");
			}
		} else {
			System.out.println("����");
		}
	}
}
