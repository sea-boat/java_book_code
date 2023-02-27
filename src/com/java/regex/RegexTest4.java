package com.java.regex;

public class RegexTest4 {

	public static void main(String[] args) {
		System.out.println("ABC".matches("ABC\\d*"));
		System.out.println("ABC1".matches("ABC\\d*"));
		System.out.println("ABC123".matches("ABC\\d*"));
		System.out.println("ABC".matches("ABC\\d+"));
		System.out.println("ABC1".matches("ABC\\d+"));
		System.out.println("ABC123".matches("ABC\\d+"));
		System.out.println("ABC".matches("ABC\\d?"));
		System.out.println("ABC1".matches("ABC\\d?"));
		System.out.println("ABC123".matches("ABC\\d?"));
		System.out.println("ABC".matches("ABC\\d{3}"));
		System.out.println("ABC1".matches("ABC\\d{3}"));
		System.out.println("ABC123".matches("ABC\\d{3}"));
		System.out.println("ABC".matches("ABC\\d{3}"));
		System.out.println("ABC1".matches("ABC\\d{3}"));
		System.out.println("ABC123".matches("ABC\\d{3}"));
		System.out.println("ABC".matches("ABC\\d{2,}"));
		System.out.println("ABC12".matches("ABC\\d{2,}"));
		System.out.println("ABC123".matches("ABC\\d{2,}"));
		System.out.println("ABC".matches("ABC\\d{2,3}"));
		System.out.println("ABC12".matches("ABC\\d{2,3}"));
		System.out.println("ABC123".matches("ABC\\d{2,3}"));
	}

}
