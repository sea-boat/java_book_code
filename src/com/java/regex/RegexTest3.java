package com.java.regex;

public class RegexTest3 {

	public static void main(String[] args) {
		System.out.println("ABC".matches("A.C"));
		System.out.println("ABC".matches("A.."));
		System.out.println("@@".matches(".."));
		System.out.println("1-1".matches("\\d-\\d"));
		System.out.println("110".matches("\\d\\d\\d"));
		System.out.println("1A".matches("\\d\\D"));
		System.out.println("Ee".matches("\\D\\D"));
		System.out.println(" ".matches("\\s"));
		System.out.println("	".matches("\\s"));
		System.out.println("FFF".matches("\\S\\S\\S"));
		System.out.println("G1 ".matches("\\S\\d\\s"));
		System.out.println("w_j".matches("\\w\\w\\w"));
		System.out.println("zzx".matches("zz\\w"));
		System.out.println("#1#".matches("\\W\\w\\W"));
		System.out.println("@#%".matches("\\W\\W\\W"));
	}

}
