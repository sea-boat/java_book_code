package com.java.innerclass;

public interface InnerInterfaceTest3 {

	class InnerClass {
		public void test() {
			System.out.println("test");
		}
	}

	public static void main(String[] args) {
		new InnerClass().test();
	}
}
