package com.java.operator;

public class OperatorLogicalOrTest {
	public static void main(String[] args) {
		boolean condition1 = 4 > 3;
		boolean condition2 = 0 > 1;
		boolean condition3 = true;
		boolean condition4 = false;
		boolean result = condition1 || condition2;
		System.out.println(result);
		System.out.println(condition3 || condition4);
		System.out.println(condition2 || condition4);
		System.out.println((7 > 10) || (3 > 1));
	}
}
