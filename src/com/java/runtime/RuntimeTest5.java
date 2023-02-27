package com.java.runtime;

public class RuntimeTest5 {
	public static void main(String[] args) {
		System.out.println("程序启动");
		Runtime.getRuntime().addShutdownHook(new Thread() {
			public void run() {
				System.out.println("JVM关闭前会执行");
			}
		});
		System.out.println("程序结束");
		Runtime.getRuntime().exit(1);
	}
}
