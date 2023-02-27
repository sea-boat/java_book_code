package com.java.thread;

public class ThreadSynchronizedTest {
	public static void main(String[] args) {
		ThreadSynchronizedTest test = new ThreadSynchronizedTest();
		new Thread(() -> {
			test.method("thread1");
		}).start();
		new Thread(() -> {
			test.method("thread2");
		}).start();
	}

	public synchronized void method(String name) {
		System.out.println(name + " gets the lock.");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		System.out.println(name + " releases the lock after 3s.");
	}
}