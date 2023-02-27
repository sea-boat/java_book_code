package com.java.scanner;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class ScannerTest4 {
	public static void main(String[] args) throws FileNotFoundException {
		InputStream in = new FileInputStream(new File("test.txt"));
		Scanner s = new Scanner(in);
		s.useDelimiter(",");
		while (s.hasNext()) {
			System.out.println(s.next());
		}
	}
}
