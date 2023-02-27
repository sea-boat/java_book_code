package com.java.regex;

public class RegexTest12 {
	public static void main(String[] args) {
		String emailMatcher = "[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.com";
		System.out.println("abc@".matches(emailMatcher));
		System.out.println("abc@qq".matches(emailMatcher));
		System.out.println("12312312@163.com".matches(emailMatcher));
		System.out.println("abcde@sohu.com.cn".matches(emailMatcher));
	}
}
