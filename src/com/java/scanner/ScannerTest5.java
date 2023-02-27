package com.java.scanner;

import java.util.Scanner;

public class ScannerTest5 {
	public static void main(String[] args) {
		String text = "哈哈;呵呵;嘻嘻";
		Scanner s = new Scanner(text);
		s.useDelimiter(";");
		while (s.hasNext()) {
			System.out.println(s.next());
		}
	}
}
