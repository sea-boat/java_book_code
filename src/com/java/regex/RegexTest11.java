package com.java.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest11 {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("(?<year>\\d{4})-(?<monthDay>(?<month>\\d{2})-(?<day>\\d{2}))");
		Matcher m = p.matcher("2022-10-01");
		if (m.find()) {
			System.out.println(m.group(0));
			System.out.println(m.group("year"));
			System.out.println(m.group("monthDay"));
			System.out.println(m.group("month"));
			System.out.println(m.group("day"));
		}
	}
}
