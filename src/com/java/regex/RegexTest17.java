package com.java.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest17 {
	public static void main(String[] args) {
		String str = "你好，13769607605的用户，13564970805的用户，13739858687的用户";
		Pattern p = Pattern.compile("\\d{11}");
		Matcher m = p.matcher(str);
		while (m.find()) {
			System.out.println(m.group());
		}
	}
}
