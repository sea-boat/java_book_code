package com.java.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOtest38 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
		InputStreamReader isr = null;
		try {
			fis = new FileInputStream("D:/test.txt");
			isr = new InputStreamReader(fis, "UTF-8");
			int value = 0;
			while ((value = isr.read()) != -1) {
				System.out.print((char) value);
			}
		} finally {
			fis.close();
			isr.close();
		}
	}
}
