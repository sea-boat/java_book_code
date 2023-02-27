package com.java.scanner;

import java.util.Scanner;

public class ScannerTest3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("请输入字符串：");
		while (true) {
			String line = s.nextLine();
			if (line.equals("exit"))
				break;
			System.out.println(">>>" + line);
		}
	}
}
