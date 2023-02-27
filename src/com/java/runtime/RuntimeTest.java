package com.java.runtime;

public class RuntimeTest {
	public static void main(String[] args) {
		Runtime runtime = Runtime.getRuntime();
		int processors = runtime.availableProcessors();
		long freeMemory = runtime.freeMemory();
		long maxMemory = runtime.maxMemory();
		long totalMemory = runtime.totalMemory();
		System.out.println("JVM����������" + processors);
		System.out.println("JVM�����ڴ棺" + freeMemory / 1024 / 1024 + "M");
		System.out.println("JVM���ڴ棺" + totalMemory / 1024 / 1024 + "M");
		System.out.println("JVM����ڴ棺" + maxMemory / 1024 / 1024 + "M");
	}
}
