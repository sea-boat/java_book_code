package com.java.thread;

public class ThreadWaitTest2 {
	private static String message;

	public static void main(String[] args) {
		Thread thread1 = new Thread(() -> {
			while (message == null) {
			}
			System.out.println(message);
		});
		Thread thread2 = new Thread(() -> {
			message = "i am thread2";
		});
		thread1.start();
		thread2.start();
	}
}
