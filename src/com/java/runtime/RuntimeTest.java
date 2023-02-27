package com.java.runtime;

public class RuntimeTest {
	public static void main(String[] args) {
		Runtime runtime = Runtime.getRuntime();
		int processors = runtime.availableProcessors();
		long freeMemory = runtime.freeMemory();
		long maxMemory = runtime.maxMemory();
		long totalMemory = runtime.totalMemory();
		System.out.println("JVM处理器数：" + processors);
		System.out.println("JVM空闲内存：" + freeMemory / 1024 / 1024 + "M");
		System.out.println("JVM总内存：" + totalMemory / 1024 / 1024 + "M");
		System.out.println("JVM最大内存：" + maxMemory / 1024 / 1024 + "M");
	}
}
