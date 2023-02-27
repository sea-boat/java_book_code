package com.java.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest15 {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("\\d+");
		Matcher m = p.matcher("22aa33");
		System.out.println(m.matches());
		Matcher m2 = p.matcher("2233");
		System.out.println(m2.matches() + "->[" + m2.start() + ":" + m2.end() + "]");
		Matcher m3 = p.matcher("aa2233");
		System.out.println(m3.lookingAt());
		Matcher m4 = p.matcher("22aa33");
		System.out.println(m4.lookingAt() + "->[" + m4.start() + ":" + m4.end() + "]");
		Matcher m5 = p.matcher("22bb33");
		System.out.println(m5.find() + "->[" + m5.start() + ":" + m5.end() + "]");
		System.out.println(m5.find() + "->[" + m5.start() + ":" + m5.end() + "]");
		Matcher m6 = p.matcher("aa2233");
		System.out.println(m6.find() + "->[" + m6.start() + ":" + m6.end() + "]");
		Matcher m7 = p.matcher("aabb");
		System.out.println(m7.find());
	}
}
