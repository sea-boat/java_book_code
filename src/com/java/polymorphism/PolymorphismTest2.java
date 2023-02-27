package com.java.polymorphism;

public class PolymorphismTest2 {
	public static void main(String[] args) {
		AAA aaa = new BBB();
		System.out.println(aaa.a);
		aaa = new CCC();
		System.out.println(aaa.a);
	}
}

class AAA {
	int a = 1;
}

class BBB extends AAA {
	int a = 2;
}

class CCC extends AAA {
	int a = 3;
}