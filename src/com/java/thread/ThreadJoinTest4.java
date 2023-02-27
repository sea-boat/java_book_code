package com.java.thread;

public class ThreadJoinTest4 {
	public static void main(String[] args) throws InterruptedException {
		Thread[] threads = new Thread[10];
		for (int i = 0; i < 10; i++) {
			threads[i] = new Thread(() -> {
				try {
					Thread.sleep(3000);
					System.out.println(Thread.currentThread().getName() + "执行完");
				} catch (InterruptedException e) {
				}
			});
			threads[i].start();
		}
		for (int i = 0; i < 10; i++) {
			threads[i].join();
		}
		System.out.println("十个线程全部执行完了");
	}
}
