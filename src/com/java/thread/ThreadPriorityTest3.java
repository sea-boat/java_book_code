package com.java.thread;

public class ThreadPriorityTest3 {

	public static void main(String[] args) {
		Thread t = new MyThread();
		System.out.println("默认优先级为：" + t.getPriority());
	}

	static class MyThread extends Thread {
		public void run() {
			System.out.println("执行");
		}
	}
}
