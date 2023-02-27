package com.java.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest21 {
	public static void main(String[] args) {
		String str = "aaabbb";
		Pattern p = Pattern.compile("a{1,3}?");
		Matcher m = p.matcher(str);
		while (m.find()) {
			System.out.println(m.group());
		}
	}
}
