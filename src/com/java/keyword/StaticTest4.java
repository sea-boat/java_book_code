package com.java.keyword;

public class StaticTest4 {

	static class StaticClass {
		String str = "static class";
	}

	class NoneStaticClass {
		String str = "none static class";
	}

	public static void main(String[] args) {
		StaticTest4.StaticClass ss = new StaticTest4.StaticClass();
		System.out.println(ss.str);
		StaticTest4.NoneStaticClass sn = new StaticTest4().new NoneStaticClass();
		System.out.println(sn.str);
	}
}
