package com.java.innerclass;

public class AnonymousInnerClassTest {

	public static void main(String[] args) {
		Task task = new Task() {
			public void run() {
				System.out.println("running task.");
			}
		};
		task.run();
	}
}

abstract class Task {
	abstract void run();
}