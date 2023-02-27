package com.java.thread;

public class ThreadSleepTest2 {

	public static void main(String[] args) {
		try {
			Thread.sleep(-1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
