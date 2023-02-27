package com.java.classobject;

public class Dog {

	public void run() {
		System.out.println("running...");
	}

	public void bark() {
		System.out.println("barking...");
	}

	public void runAdnBark() {
		this.run();
		this.bark();
	}

}
