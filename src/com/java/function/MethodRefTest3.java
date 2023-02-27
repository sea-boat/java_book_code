package com.java.function;

import java.util.Arrays;

public class MethodRefTest3 {

	public static void main(String[] args) {
		String[] ss = new String[] { "monkey", "dog", "cat", "tiger", "fish" };
		Arrays.sort(ss, String::compareTo);
		System.out.println(Arrays.toString(ss));
	}

}
