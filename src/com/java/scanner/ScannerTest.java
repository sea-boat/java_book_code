package com.java.scanner;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		String text = "java c++ python nodejs";
		Scanner s = new Scanner(text);
		while (s.hasNext()) {
			System.out.println(s.next());
		}
	}
}
