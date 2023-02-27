package com.java.str;

public class StringTest2 {

	public static void main(String[] args) {
		String s1 = new String("Hello World");
		String s2;
		s2 = new String("我们是程序员");
		System.out.println(s1);
		System.out.println(s2);
		char[] chars = { '1', '0', '0', '8', '6' };
		String s3 = new String(chars);
		System.out.println(s3);
	}
}
