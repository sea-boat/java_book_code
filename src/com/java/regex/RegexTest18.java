package com.java.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest18 {
	public static void main(String[] args) {
		String str = "��ã�13769607605���û���13564970805���û���13739858687���û�";
		Pattern p = Pattern.compile("\\S*(\\d{11})\\S*(\\d{11})\\S*(\\d{11})\\S*");
		Matcher m = p.matcher(str);
		while (m.find()) {
			System.out.println(m.group(0));
			System.out.println(m.group(1));
			System.out.println(m.group(2));
			System.out.println(m.group(3));
		}
	}
}
