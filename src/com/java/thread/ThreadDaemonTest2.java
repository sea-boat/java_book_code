package com.java.thread;

public class ThreadDaemonTest2 {
	public static void main(String[] args) {
		Thread t2 = new Thread(() -> {
			try {
				while (true) {
					Thread.sleep(3000);
				}
			} catch (InterruptedException e) {
			}
		});
		t2.setDaemon(true);
		t2.start();
		System.out.println("正常退出");
	}
}