package com.java.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest20 {
	public static void main(String[] args) {
		String str = "aaabbb";
		Pattern p = Pattern.compile("(\\w+?)(b*)");
		Matcher m = p.matcher(str);
		if (m.matches()) {
			System.out.println("Ë÷Òý0£º" + m.group(0));
			System.out.println("Ë÷Òý1£º" + m.group(1));
			System.out.println("Ë÷Òý2£º" + m.group(2));
		}
	}
}
