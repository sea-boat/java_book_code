package com.java.exception;

public class ExceptionTest19 {

	public static void main(String[] args) {
		divide(3, 1);
		divide(3, 0);
	}

	public static float divide(int a, int b) {
		if (b == 0)
			throw new ArithmeticException("除数不能为0!");
		return a / b;
	}
}
