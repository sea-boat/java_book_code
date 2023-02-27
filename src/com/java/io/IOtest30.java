package com.java.io;

import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class IOtest30 {
	public static void main(String[] args) throws IOException {
		FileReader fr = null;
		char[] buffer = new char[4];
		try {
			fr = new FileReader("D:/test.txt", StandardCharsets.UTF_8);
			int n = 0;
			while ((n = fr.read(buffer)) != -1) {
				for (int i = 0; i < n; i++) {
					System.out.print((char) buffer[i]);
				}
				System.out.println();
			}
		} finally {
			fr.close();
		}
	}
}
