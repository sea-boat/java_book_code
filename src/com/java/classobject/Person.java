package com.java.classobject;
import java.io.Serializable;

class Person implements Cloneable, Serializable {

	String name;
	int age;

	Person() {

	}

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	void eat() {
		System.out.println("�Զ���");
	}

	void sleep() {
		System.out.println("˯��");
	}

	void introduceMyself() {
		System.out.println("my name is " + name + ", " + age + " years old.");
	}

	public Object clone() {
		try {
			return super.clone();
		} catch (Exception e) {
			return null;
		}
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		Person xiaoming = new Person("С��", 6);
		System.out.println(xiaoming.name);
		xiaoming.introduceMyself();
	}

}
