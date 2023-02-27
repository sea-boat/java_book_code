package com.java.keyword;

public class InstanceofTest2 {
	public static void main(String[] args) {
		Person p = new Person();
		Animal a = new Animal();
		System.out.println(p instanceof Person);
		System.out.println(a instanceof Animal);
//		System.out.println(a instanceof Person);
	}
}

class Person {

}

class Animal {

}