package com.java.statement;

public class ExecuteOrderBranchTest {
	public static void main(String[] args) {
		boolean condition_A = true;
		boolean condition_B = false;
		if (condition_A && condition_B) {
			System.out.println("����A����������B����");
		} else if (condition_A && !condition_B) {
			System.out.println("����A����������B������");
		} else {
			System.out.println("�������");
		}
	}
}
