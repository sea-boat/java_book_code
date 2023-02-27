package com.java.innerclass;

public class StaticInnerClassTest {

	public static String str = "hello";

	static class InnerClass {
		public void print() {
			System.out.println(str + " from static inner class.");
		}
	}

	public static void main(String[] args) {
		StaticInnerClassTest.InnerClass inner = new StaticInnerClassTest.InnerClass();
		inner.print();
	}
}
