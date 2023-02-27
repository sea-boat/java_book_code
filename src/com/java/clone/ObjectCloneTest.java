package com.java.clone;

public class ObjectCloneTest {

	public static void main(String[] args) {
		Person p1 = new Person("小明", 16);
		Person p1Copy = new Person("小明", 16);
		Person p1Copy2 = new Person();
		p1Copy2.setName("小明");
		p1Copy2.setAge(16);
		Person p1C = (Person) p1.clone();
		System.out.println(p1C.age);
	}

}

class Person implements Cloneable {
	String name;
	int age;

	Person() {
	}

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public Object clone() {
		try {
			return super.clone();
		} catch (Exception e) {
			return null;
		}
	}
}