package com.java.thread;

public class ThreadInterruptTest {
	public static void main(String[] args) {
		Thread thread1 = new Thread(() -> {
			while (!Thread.currentThread().isInterrupted()) {
				System.out.println("running...");
			}
		});
		thread1.start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		thread1.interrupt();
	}
}
