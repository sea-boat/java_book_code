package com.java.thread;

public class ThreadSynchronizedTest8 {
	static int ticketNum = 6;

	public  static void getTicket() {
		if (ticketNum > 0) {
			ticketNum--;
			System.out.println(Thread.currentThread().getName() + " 抢到票！");
		} else {
			System.out.println(Thread.currentThread().getName() + " 没抢到票！");
		}
	}

	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			new Thread(() -> {
				getTicket();
			}).start();
		}
	}
}