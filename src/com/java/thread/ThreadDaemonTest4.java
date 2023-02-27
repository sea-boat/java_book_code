package com.java.thread;

public class ThreadDaemonTest4 {
	public static void main(String[] args) {
		Thread t2 = new Thread(() -> {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
			}
		});
		t2.start();
		t2.setDaemon(true);
	}
}