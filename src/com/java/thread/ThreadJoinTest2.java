package com.java.thread;

public class ThreadJoinTest2 {
	public static void main(String[] args) {
		Thread t2 = new Thread(() -> {
			try {
				//模拟耗时计算
				Thread.sleep(60000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		t2.setDaemon(true);
		t2.start();
		try {
			t2.join(3000);
			System.out.println("join timeout.");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
