package com.java.regex;

public class RegexTest6 {

	public static void main(String[] args) {
		System.out.println("AA123".matches("^AA\\d{3}"));
		System.out.println("AA123".matches("AA\\d{3}"));
		System.out.println("AA123".matches("AA\\d{3}$"));
		System.out.println("AA123".replaceAll("^A", "B"));
		System.out.println("AA123".replaceAll("A", "B"));
		System.out.println("AA123".replaceAll("\\d$", "N"));
		System.out.println("AA123".replaceAll("\\d", "N"));
	}

}
