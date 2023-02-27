package com.java.innerclass;

public class StaticInnerClassTest2 {

	static class InnerClass {

		public static String info = "hello";

		public static void hello() {
			System.out.println("hello");
		}
	}

	public static void main(String[] args) {
		System.out.println(StaticInnerClassTest2.InnerClass.info);
		StaticInnerClassTest2.InnerClass.hello();
	}
}
