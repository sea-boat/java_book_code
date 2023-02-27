package com.java.generics;

public class GenericsTest6 {

	public static void main(String[] args) {
		print(10.11, "Double");
		print(10, "Integer");
		print("hello", "String");
	}

	public static <E> void print(E e, String s) {
		if (s.equals("Double"))
			System.out.println("E is a Double type : " + e);
		if (s.equals("Integer"))
			System.out.println("E is a Integer type : " + e);
		if (s.equals("String"))
			System.out.println("E is a String type : " + e);
	}

}
