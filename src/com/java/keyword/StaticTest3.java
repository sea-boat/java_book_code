package com.java.keyword;

public class StaticTest3 {

	public static int a = 10;
	static {
		System.out.println("a=" + a);
		a = 20;
	}

	public static void main(String[] args) {
		System.out.println("a=" + a);
	}

}
