package com.java.regex;

import java.util.regex.Pattern;

public class RegexTest14 {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("\\s");
		System.out.println(p.pattern());
		System.out.println(Pattern.matches("\\d*", "1231"));
		System.out.println(Pattern.matches("\\d*", "1231d"));
		String[] strs = p.split("123 342 243 32");
		for (String s : strs)
			System.out.println(s);
	}
}
