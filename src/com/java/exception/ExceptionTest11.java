package com.java.exception;

public class ExceptionTest11 {

	public static void main(String[] args) {
		try {
			int a = 20 / 0;
			System.out.println("a = " + a);
		} catch (ArithmeticException e) {
			System.out.println("捕获到异常并进行处理");
		} finally {
			System.out.println("必执行代码");
		}
	}

}
