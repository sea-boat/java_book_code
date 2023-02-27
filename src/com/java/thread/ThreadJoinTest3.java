package com.java.thread;

public class ThreadJoinTest3 {
	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		Thread t2 = new Thread(() -> {
			try {
				//模拟耗时计算
				Thread.sleep(60000);
			} catch (InterruptedException e) {
			}
		});
		Thread t3 = new Thread(() -> {
			try {
				Thread.sleep(3000);
				mainThread.interrupt();
			} catch (InterruptedException e) {
			}
		});
//		t2.setDaemon(true);
		t2.start();
		t3.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			System.out.println("t3 has interrupted main thread.");
		}
	}
}
