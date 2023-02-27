package com.java.thread;

public class ThreadPriorityTest2 {

	public static void main(String[] args) {
		Thread t = new MyThread();
		t.setPriority(10);
		t.setName("线程一");
		Thread t2 = new MyThread();
		t2.setPriority(5);
		t2.setName("线程二");
		t.start();
		t2.start();
	}

	static class MyThread extends Thread {
		public void run() {
			System.out.print(this.getName());
		}
	}
}
