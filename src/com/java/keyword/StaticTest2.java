package com.java.keyword;

public class StaticTest2 {

	public static int a = 10;
	public int b;

	public static void main(String[] args) {
		System.out.println(StaticTest2.a);
		StaticTest2 s1 = new StaticTest2();
		StaticTest2 s2 = new StaticTest2();
		StaticTest2 s3 = new StaticTest2();
		s1.b = 0;
		s2.b = 10;
		s3.b = 20;
		System.out.println(s1.b);
		System.out.println(s2.b);
		System.out.println(s3.b);
	}

}
