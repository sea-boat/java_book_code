package com.java.thread;

import java.util.concurrent.locks.LockSupport;

public class ThreadWaitTest4 {
	public static void main(String[] args) {
		Thread thread1 = new Thread(() -> {
			System.out.println("第一次park");
			LockSupport.park();
			System.out.println("第二次park");
			LockSupport.park();
			System.out.println("第三次park");
			LockSupport.park();
		});
		thread1.start();
		LockSupport.unpark(thread1);
	}
}
