package com.java.scanner;

import java.util.Scanner;

public class ScannerTest2 {
	public static void main(String[] args) {
		String text = "java,c++;python:nodejs";
		Scanner s = new Scanner(text);
		s.useDelimiter(",|;|:");
		while (s.hasNext()) {
			System.out.println(s.next());
		}
	}
}
