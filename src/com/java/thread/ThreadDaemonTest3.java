package com.java.thread;

public class ThreadDaemonTest3 {
	public static void main(String[] args) {
		Thread t2 = new Thread(() -> {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
			}
		});
		t2.start();
		System.out.println("线程默认是否为守护线程：" + t2.isDaemon());
	}
}