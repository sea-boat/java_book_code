package com.java.statement;

public class ExecuteOrderBranchTest {
	public static void main(String[] args) {
		boolean condition_A = true;
		boolean condition_B = false;
		if (condition_A && condition_B) {
			System.out.println("条件A成立，条件B成立");
		} else if (condition_A && !condition_B) {
			System.out.println("条件A成立，条件B不成立");
		} else {
			System.out.println("其它情况");
		}
	}
}
