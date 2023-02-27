package com.java.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest8 {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("(A)((B(C))(D))");
		Matcher m = p.matcher("ABCD");
		if (m.find()) {
			System.out.println(m.group(0));
			System.out.println(m.group(1));
			System.out.println(m.group(2));
			System.out.println(m.group(3));
			System.out.println(m.group(4));
			System.out.println(m.group(5));
		}
	}
}
