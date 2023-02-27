package com.java.thread;

public class ThreadInterrupteTest2 {
	public static void main(String[] args) {
		Thread thread1 = new Thread(() -> {
			try {
				System.out.println("thread1 is running...");
				Thread.sleep(200000);
			} catch (InterruptedException e) {
				System.out.println("thread1 has stoped!");
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
