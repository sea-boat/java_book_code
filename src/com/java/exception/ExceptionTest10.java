package com.java.exception;

public class ExceptionTest10 {

	public static void main(String[] args) {
		try {
			int a = 20 / 1;
			System.out.println("a = " + a);
		} catch (ArithmeticException e) {
			System.out.println("�����쳣�����д���");
		} finally {
			System.out.println("��ִ�д���");
		}
	}

}
