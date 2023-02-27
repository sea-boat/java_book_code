package com.java.thread;

public class ThreadPriorityTest {

	public static void main(String[] args) {
		Thread t = new MyThread();
		t.setPriority(7);
		System.out.println("�߳����ȼ�Ϊ��" + t.getPriority());
		t.setPriority(Thread.MAX_PRIORITY);
		System.out.println("�߳����ȼ�Ϊ��" + t.getPriority());
		t.setPriority(Thread.MIN_PRIORITY);
		System.out.println("�߳����ȼ�Ϊ��" + t.getPriority());
	}

	static class MyThread extends Thread {
		public void run() {
			System.out.println("ִ��");
		}
	}
}
