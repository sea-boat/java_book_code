package com.java.exception;

public class ExceptionTest12 {

	public static void main(String[] args) {
		try {
			int a = 20 / 0;
			System.out.println("a = " + a);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("�����쳣�����д���");
		} finally {
			System.out.println("��ִ�д���");
		}
	}

}
