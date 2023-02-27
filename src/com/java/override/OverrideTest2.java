package com.java.override;

public class OverrideTest2 {

	public static void main(String[] args) {
		Parent p = new SubClass();
		SubClass s = new SubClass();
		p.test();
		s.test();
	}

}

class Parent {

	public static void test() {
		System.out.println("parent");
	}
}

class SubClass extends Parent {

	public static void test() {
		System.out.println("subClass");
	}

}
