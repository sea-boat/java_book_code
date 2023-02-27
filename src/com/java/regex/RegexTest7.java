package com.java.regex;

public class RegexTest7 {

	public static void main(String[] args) {
		System.out.println("AA".matches("AA|BB"));
		System.out.println("BB".matches("AA|BB"));
		System.out.println("AB".matches("AA|BB"));
		System.out.println("02".matches("[0-5]{2}|[a-e]{3}"));
		System.out.println("020".matches("[0-5]{2}|[a-e]{3}"));
		System.out.println("abc".matches("[0-5]{2}|[a-e]{3}"));
		System.out.println("abcde".matches("[0-5]{2}|[a-e]{3}"));
	}

}
