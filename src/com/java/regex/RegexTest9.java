package com.java.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest9 {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("(\\d{4})-((\\d{2})-(\\d{2}))");
		Matcher m = p.matcher("2022-10-01");
		if (m.find()) {
			System.out.println(m.group(0));
			System.out.println(m.group(1));
			System.out.println(m.group(2));
			System.out.println(m.group(3));
			System.out.println(m.group(4));
		}
	}
}
