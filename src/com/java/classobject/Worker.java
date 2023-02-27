package com.java.classobject;

public class Worker {
	public int age;
	public String name;
	public int height;

	public Worker(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public Worker(int age, String name, int height) {
		this(age, name);
		this.height = height;
	}
}
