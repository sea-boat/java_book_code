package com.java.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IOtest12 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
		byte[] buffer = new byte[4];
		try {
			fis = new FileInputStream("D:/test.txt");
			int n = 0;
			while ((n = fis.read(buffer)) != -1) {
				for (int i = 0; i < n; i++) {
					System.out.print((char) buffer[i]);
				}
				System.out.println();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fis != null)
				fis.close();
		}
	}
}
