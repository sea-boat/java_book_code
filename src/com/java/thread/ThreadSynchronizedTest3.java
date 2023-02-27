package com.java.thread;

public class ThreadSynchronizedTest3 {
	public synchronized void method(String name) {
		System.out.println(name + " gets the lock.");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		System.out.println(name + " releases the lock after 3s.");
	}

	public synchronized void method2(String name) {
		System.out.println(name + " gets the lock.");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		System.out.println(name + " releases the lock after 3s.");
	}

	public static void main(String[] args) throws InterruptedException {
		ThreadSynchronizedTest3 test = new ThreadSynchronizedTest3();
		new Thread(() -> {
			test.method("thread1");
		}).start();
		new Thread(() -> {
			test.method2("thread2");
		}).start();
	}

}