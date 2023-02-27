package com.java.thread;

public class ThreadDaemonTest {
	public static void main(String[] args) {
		Thread t2 = new Thread(() -> {
			try {
				while (true) {
					Thread.sleep(3000);
				}
			} catch (InterruptedException e) {
			}
		});
		t2.start();
		System.out.println("永远退出不了");
	}
}