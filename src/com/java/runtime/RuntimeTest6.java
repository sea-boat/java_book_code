package com.java.runtime;

public class RuntimeTest6 {
	public static void main(String[] args) {
		Runtime runtime = Runtime.getRuntime();
		long freeMemory = runtime.freeMemory();
		long totalMemory = runtime.totalMemory();
		System.out.println("JVM空闲内存：" + freeMemory / 1024 / 1024 + "M");
		System.out.println("JVM总内存：" + totalMemory / 1024 / 1024 + "M");
		for (int i = 0; i < 100000; i++)
			new String("test" + i);
		freeMemory = runtime.freeMemory();
		totalMemory = runtime.totalMemory();
		System.out.println("JVM空闲内存：" + freeMemory / 1024 / 1024 + "M");
		System.out.println("JVM总内存：" + totalMemory / 1024 / 1024 + "M");
	}
}
