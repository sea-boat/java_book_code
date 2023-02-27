package com.seaboat;

public class Student {
	int id;
	int age;
	String name;

	public Student(int id, int age, String name) {
		this.id = id;
		this.age = age;
		this.name = name;
	}

	public static void main(String[] args) {
		Student xiaoming = new Student(1, 10, "ะกร๗");
		System.out.println(xiaoming.name + "," + xiaoming.age);
	}
}
