package com.java.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class IOtest31 {
	public static void main(String[] args) throws IOException {
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader("D:/test.txt", StandardCharsets.UTF_8);
			br = new BufferedReader(fr, 4);
			int value = 0;
			while ((value = br.read()) != -1) {
				System.out.print((char) value);
			}
		} finally {
			fr.close();
			br.close();
		}
	}
}
