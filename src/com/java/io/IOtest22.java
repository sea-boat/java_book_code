package com.java.io;

import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class IOtest22 {
	public static void main(String[] args) throws IOException {
		FileReader fr = null;
		try {
			fr = new FileReader("D:/test.txt", StandardCharsets.UTF_8);
			int value;
			while ((value = fr.read()) != -1) {
				System.out.print((char) value);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			fr.close();
		}
	}
}
