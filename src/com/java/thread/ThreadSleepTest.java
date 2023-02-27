package com.java.thread;

public class ThreadSleepTest {

	public static void main(String[] args) {
		System.out.println("当前线程睡眠3000ms");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("睡眠结束");
	}
}
