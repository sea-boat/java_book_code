package com.java.generics;

import java.util.Arrays;

public class GenericsTest9 {

	public static void main(String[] args) {
		new MyImplement().test("hello");
		new MyImplement2().test(new int[] { 1, 2, 3, 4, 5 });
	}

}

interface MyInterface<T> {

	public abstract void test(T t);

}

class MyImplement implements MyInterface<String> {

	public void test(String s) {
		System.out.println(s);
	}

}

class MyImplement2 implements MyInterface<int[]> {

	public void test(int[] arr) {
		System.out.println(Arrays.toString(arr));
	}

}