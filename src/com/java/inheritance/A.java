package com.java.inheritance;

class A {
	int a = 10;

	A() {
		System.out.println("A类构造方法");
	}

	public static void main(String[] args) {
		C c = new C();
	}
}

class B extends A {
	int a = 20;

	B() {
		System.out.println("B类构造方法");
	}
}

class C extends B {
	C() {
		System.out.println("C类构造方法");
//		System.out.println(super.super.a);
	}

}
