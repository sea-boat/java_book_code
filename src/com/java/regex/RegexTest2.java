package com.java.regex;

public class RegexTest2 {

	public static void main(String[] args) {
		System.out.println("^".matches("^"));
		System.out.println("^".matches("\\^"));
		System.out.println("$".matches("$"));
		System.out.println("$".matches("\\$"));
		System.out.println("(".matches("\\("));
		System.out.println(")".matches("\\)"));
		System.out.println("[".matches("\\["));
		System.out.println("]".matches("\\]"));
		System.out.println("{".matches("\\{"));
		System.out.println("}".matches("\\}"));
		System.out.println("*".matches("\\*"));
		System.out.println("+".matches("\\+"));
		System.out.println("?".matches("\\?"));
		System.out.println(".".matches("\\."));
		System.out.println("\\".matches("\\\\"));
		System.out.println("|".matches("\\|"));
	}

}
