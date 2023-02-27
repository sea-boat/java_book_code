package com.java.exception;

public class ExceptionTest15 {
	public static String[] Names = { "Tom", "Lucy", "Sam", "Lily", "Ryan" };

	public static void main(String[] args) {
		System.out.println(getNameByIndex(0));
		System.out.println(getNameByIndex(-3));
		System.out.println(getNameByIndex(5));
	}

	public static String getNameByIndex(int index) {
		if (0 > index)
			throw new IndexOutOfBoundsException("index can't be a negative");
		if (index > (Names.length - 1))
			throw new IndexOutOfBoundsException("out of maximum index.");
		return Names[index];
	}
}
