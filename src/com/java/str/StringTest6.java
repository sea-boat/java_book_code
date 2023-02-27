package com.java.str;

public class StringTest6 {
	public static void main(String[] args) {
		String s1 = new String("Hello World");
		String s2 = new String(" Hello World ");
		String s3 = new String("     Hello World     ");
		System.out.println(s1.trim());
		System.out.println(s2.trim());
		System.out.println(s3.trim());
	}
}
