package com.java.str;

public class StringTest3 {
	public static void main(String[] args) {
		String s1 = new String("Hello World");
		for (int i = 0; i < s1.length(); i++)
			System.out.print(s1.charAt(i)+",");
	}
}
