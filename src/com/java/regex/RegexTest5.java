package com.java.regex;

public class RegexTest5 {

	public static void main(String[] args) {
		System.out.println("CC".matches("[ABC]{2}"));
		System.out.println("CEE".matches("[A-E]{2,}"));
		System.out.println("XXYZ".matches("[^ABC]+"));
		System.out.println("ABA".matches("[A-F&&ABC]{3}"));
		System.out.println("AACXZ".matches("[ABC[XYZ]]+"));
	}

}
