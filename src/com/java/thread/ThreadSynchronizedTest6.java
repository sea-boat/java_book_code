package com.java.thread;

public class ThreadSynchronizedTest6 {
	int count = 0;
	int count2 = 0;

	public void add() {
		synchronized (this) {
			count++;
		}
	}

	public synchronized void add2() {
		count2++;
	}

	public static void main(String[] args) throws InterruptedException {
		ThreadSynchronizedTest6 test = new ThreadSynchronizedTest6();
		for (int i = 0; i < 10; i++)
			new Thread(() -> {
				for (int j = 0; j < 10000; j++)
					test.add();
			}).start();
		for (int i = 0; i < 10; i++)
			new Thread(() -> {
				for (int j = 0; j < 10000; j++)
					test.add2();
			}).start();
		Thread.sleep(3000);
		System.out.println("count = " + test.count);
		System.out.println("count2 = " + test.count2);
	}

}