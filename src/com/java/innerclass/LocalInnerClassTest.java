package com.java.innerclass;

public class LocalInnerClassTest {

	public void test() {
		class LocalInnerClass {
			public void hello() {
				System.out.println("hello from local inner class in method.");
			}
		}
		LocalInnerClass lic = new LocalInnerClass();
		lic.hello();
	}

	public static void main(String[] args) {
		LocalInnerClassTest test = new LocalInnerClassTest();
		test.test();
	}
}
