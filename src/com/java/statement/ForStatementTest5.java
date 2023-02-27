package com.java.statement;

public class ForStatementTest5 {
	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			if (i == 1) {
				System.out.println("½áÊøµ±Ç°ÂÖ");
				continue;
			}
			System.out.println("i=" + i);
		}
	}
}
