package com.java.regex;

public class RegexTest {

	public static void main(String[] args) {
		System.out.println("A".matches("A"));
		System.out.println("A".matches("B"));
		System.out.println("Äã".matches("\u4f60"));
		System.out.println("	".matches("\\t"));
	}

}
