package com.java.thread;

public class ThreadTest3 {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		new Thread() {
			public void run() {
				System.out.println(Thread.currentThread().getName());
			}
		}.start();;
	}
}
