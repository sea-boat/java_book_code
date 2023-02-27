package com.java.thread;

public class ThreadTest2 {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		new Thread(() -> {
			System.out.println(Thread.currentThread().getName());
		}).start();
	}
}
