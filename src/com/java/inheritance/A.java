package com.java.inheritance;

class A {
	int a = 10;

	A() {
		System.out.println("A�๹�췽��");
	}

	public static void main(String[] args) {
		C c = new C();
	}
}

class B extends A {
	int a = 20;

	B() {
		System.out.println("B�๹�췽��");
	}
}

class C extends B {
	C() {
		System.out.println("C�๹�췽��");
//		System.out.println(super.super.a);
	}

}
