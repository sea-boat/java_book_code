package com.java.enumerate;

public class EnumTest6 {

	public static void main(String[] args) {
		Season s = Season.SPRING;
		Season s2 = Season.WINTER;
		Season s3 = Season.SPRING;
		System.out.println(s == s2);
		System.out.println(s == s3);
		System.out.println(s2 == s3);
	}

}
