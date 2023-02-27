package com.java.exception;

public class ExceptionTest4 {

	public static void main(String[] args) {
		String s = null;
		try {
			System.out.println(s.length());
		} catch (NullPointerException e) {
			System.out.println(e);
		}
		System.out.println("这里会被执行吗？");
	}

}
