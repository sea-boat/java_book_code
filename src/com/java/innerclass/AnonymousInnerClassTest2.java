package com.java.innerclass;

public class AnonymousInnerClassTest2 {

	public static void main(String[] args) {
		ITask task = new ITask() {
			public void run() {
				System.out.println("running task.");
			}
		};
		task.run();
	}
}

interface ITask {
	public void run();
}

