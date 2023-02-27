package com.java.reflect;

public class ReflectClassTest3 {
	public static void main(String[] args) {
		String[] strs = new String[10];
		Integer[] ints = new Integer[10];
		Float[] flts = new Float[10];
		System.out.println(strs.getClass().getName());
		System.out.println(ints.getClass().getName());
		System.out.println(flts.getClass().getName());
	}
}
