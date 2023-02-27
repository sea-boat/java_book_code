package com.java.keyword;

public class NullTest2 {

	private static String str = "test";

	public static void main(String[] args) {
		System.out.println(str.length());
		str = null;
		System.out.println(str.length());
	}
}
