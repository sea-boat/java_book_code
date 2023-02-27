package com.java.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest22 {
	public static void main(String[] args) {
		String str = "13204000";
		Pattern p = Pattern.compile("\\d*?(0*)");
		Matcher m = p.matcher(str);
		if (m.matches()) {
			System.out.println(m.group(0));
			System.out.println(m.group(1));
		}
	}
}
