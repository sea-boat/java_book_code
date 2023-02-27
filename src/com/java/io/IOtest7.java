package com.java.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class IOtest7 {
	public static void main(String[] args) throws IOException {
		OutputStream os = null;
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("D:/test.txt");
			for (;;) {
				int value = fis.read();
				if (value == -1)
					break;
				System.out.print((char) value);
			}
			os = new FileOutputStream("D:/test.txt");
			os.write("hello".getBytes());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fis != null)
				fis.close();
			if (os != null)
				os.close();
		}
	}
}
