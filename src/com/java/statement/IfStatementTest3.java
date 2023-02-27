package com.java.statement;

public class IfStatementTest3 {
	public static void main(String[] args) {
		int age = 30;
		if (age <= 14) {
			System.out.println("少年");
		} else if (age > 14 && age < 65) {
			System.out.println("壮年");
		} else {
			System.out.println("老年");
		}
	}
}
