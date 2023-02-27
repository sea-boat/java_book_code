package com.java.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest17 {
	public static void main(String[] args) {
		String str = "��ã�13769607605���û���13564970805���û���13739858687���û�";
		Pattern p = Pattern.compile("\\d{11}");
		Matcher m = p.matcher(str);
		while (m.find()) {
			System.out.println(m.group());
		}
	}
}
