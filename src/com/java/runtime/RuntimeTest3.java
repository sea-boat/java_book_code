package com.java.runtime;

public class RuntimeTest3 {
	public static void main(String[] args) {
		System.out.println("��������");
		Runtime.getRuntime().addShutdownHook(new Thread() {
			public void run() {
				System.out.println("JVM�ر�ǰ��ִ��");
			}
		});
		System.out.println("�������");
	}
}
