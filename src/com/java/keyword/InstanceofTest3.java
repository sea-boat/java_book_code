package com.java.keyword;

public class InstanceofTest3 {
	public static void main(String[] args) {
		Person p = new Person();
		Woman w = new Woman();
		System.out.println(p instanceof Woman);
		System.out.println(w instanceof Person);
	}
}

class Woman extends Person {
}
