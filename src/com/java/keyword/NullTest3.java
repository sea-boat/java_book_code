package com.java.keyword;

public class NullTest3 {
	public static String str1 = null;
	public static String str2 = null;
	public static NullTest3 nt = null;

	public static void main(String[] args) {
		if (str1 == null)
			System.out.println("str1 is null");
		if (str1 == str2)
			System.out.println("str1==str2 is true");
		System.out.println(null == null);
//		if (str1 == nt)
//			System.out.println("str1==str2 is true");
	}
}
