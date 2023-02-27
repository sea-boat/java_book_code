package com.java.exception;

public class ExceptionTest5 {

	public static void main(String[] args) {
		String s = null;
		try {
			System.out.println(s.length());
		} catch (IndexOutOfBoundsException e) {
			System.out.println(e);
		}
		System.out.println("这里会被执行吗？");
	}

}
