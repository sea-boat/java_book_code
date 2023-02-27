package com.java.thread;

import java.util.concurrent.locks.LockSupport;

public class ThreadWaitTest3 {
	private static String message;

	public static void main(String[] args) {
		Thread thread1 = new Thread(() -> {
			LockSupport.park();
			System.out.println(message);
		});
		Thread thread2 = new Thread(() -> {
			message = "i am thread2";
			LockSupport.unpark(thread1);
		});
		thread1.start();
		thread2.start();
	}
}
