package com.java.innerclass;

public class InnerInterfaceTest implements Inner.InnerInterface {

	public void test() {
		System.out.println("test");
	}

	public static void main(String[] args) {
		Inner.InnerInterface ii = new InnerInterfaceTest();
		ii.test();
	}
}

class Inner {
	interface InnerInterface {
		public void test();
	}

	interface InnerInterface2 {
		public void test2();
	}
}