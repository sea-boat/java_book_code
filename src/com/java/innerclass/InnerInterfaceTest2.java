package com.java.innerclass;

public class InnerInterfaceTest2 implements InnerI.InnerInterface2 {

	public void test2() {
		System.out.println("test");
	}

	public static void main(String[] args) {
		InnerI.InnerInterface2 ii = new InnerInterfaceTest2();
		ii.test2();
	}
}

interface InnerI {
	interface InnerInterface {
		public void test();
	}

	interface InnerInterface2 {
		public void test2();
	}
}