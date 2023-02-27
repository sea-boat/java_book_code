package com.java.classobject;

public class MethodTest {
	public void test1() {
		System.out.println("非静态-无参-无返回值-方法");
	}

	public void test2(int a) {
		System.out.println("非静态-有参-无返回值-方法");
	}

	public int test3(int a) {
		System.out.println("非静态-有参-有返回值-方法");
		return a;
	}

	public static void test4() {
		System.out.println("静态-无参-无返回值-方法");
	}

	public static void test5(int a) {
		System.out.println("静态-有参-无返回值-方法");
	}

	public static int test6(int a) {
		System.out.println("静态-有参-有返回值-方法");
		return a;
	}

	public static void main(String[] args) {
		MethodTest mt = new MethodTest();
		mt.test1();
		mt.test2(20);
		int result = mt.test3(20);
		MethodTest.test4();
		MethodTest.test5(20);
		int result2 = MethodTest.test6(20);
	}
}
