package com.java.thread;

public class ThreadTest {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		new MyThread().start();
		new Thread(new MyThread2()).start();
	}
}

class MyThread extends Thread {
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}

class MyThread2 implements Runnable {
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}