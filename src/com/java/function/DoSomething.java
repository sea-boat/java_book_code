package com.java.function;

@FunctionalInterface
public interface DoSomething {

	public abstract void start();

	public default void test() {
		System.out.println("test");
	}

	public static void test2() {
		System.out.println("test2");
	}

}
