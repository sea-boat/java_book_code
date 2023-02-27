package com.java.thread;

public class ThreadSynchronizedTest7 {
	public static void method(String name) {
		synchronized (ThreadSynchronizedTest7.class) {
			System.out.println(name + " gets the lock.");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
			}
			System.out.println(name + " releases the lock after 3s.");
		}
	}

	public static synchronized void method2(String name) {
		System.out.println(name + " gets the lock.");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		System.out.println(name + " releases the lock after 3s.");
	}

	public static void main(String[] args) throws InterruptedException {
		new Thread(() -> {
			method("thread1");
		}).start();
		new Thread(() -> {
			method2("thread2");
		}).start();
	}

}