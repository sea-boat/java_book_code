package com.java.io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class IOtest16 {
	public static void main(String[] args) throws IOException {
		OutputStream os = null;
		BufferedOutputStream bos = null;
		try {
			os = new FileOutputStream("D:/test.txt");
			bos = new BufferedOutputStream(os, 4);
			bos.write("abcd".getBytes());
			bos.write("e123".getBytes());
			bos.write("45".getBytes());
			bos.flush();
		} finally {
			bos.close();
			os.close();
		}
	}
}
