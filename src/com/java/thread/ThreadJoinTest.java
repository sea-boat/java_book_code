package com.java.thread;

public class ThreadJoinTest {

	public static void main(String[] args) {
		Thread t2 = new Thread(() -> {
			try {
				//模拟耗时计算
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		t2.start();
		try {
			t2.join();
			System.out.println("get t2's result.");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
