package com.java.thread;

public class ThreadYieldTest {

	public static void main(String[] args) {
		MyThread3 mt = new MyThread3();
		mt.setDaemon(true);
		mt.start();
		for (int i = 0; i < 100; i++) {
			System.out.println("主线程");
		}
	}
}

class MyThread3 extends Thread {
	public void run() {
		while (true) {
			System.out.println("让出线程CPU时间");
			Thread.yield();
		}
	}
}