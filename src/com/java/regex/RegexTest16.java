package com.java.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest16 {
	public static void main(String[] args) {
		String str = "welcome to java world";
		Matcher m = Pattern.compile("\\w+").matcher(str);
		while (m.find()) {
			System.out.println(m.group() + "->[" + m.start() + ":" + m.end() + "]");
		}
	}
}
