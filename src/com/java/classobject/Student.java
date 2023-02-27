package com.java.classobject;

public class Student {
	int id;
	int age;
	String name;

	public Student() {

	}

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public Student(int id, int age, String name) {
		this.id = id;
		this.age = age;
		this.name = name;
	}

	public static void main(String[] args) {
		Student xiaoming = new Student(1, 10, "小明");
		Student xiaodong = new Student(2, "小东");
		Student somebody = new Student();
	}
}
