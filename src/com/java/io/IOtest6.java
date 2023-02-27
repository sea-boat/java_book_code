package com.java.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class IOtest6 {
	public static void main(String[] args) throws IOException {
		OutputStream os = null;
		try {
			os = new FileOutputStream("D:/test.txt");
			os.write("abc123".getBytes());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			os.close();
		}
	}
}
