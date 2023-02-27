package com.java.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class IOtest15 {
	public static void main(String[] args) throws IOException {
		OutputStream os = null;
		byte[] buffer = new byte[4];
		try {
			os = new FileOutputStream("D:/test.txt");
			buffer[0] = 'a';
			buffer[1] = 'b';
			buffer[2] = 'c';
			buffer[3] = 'd';
			os.write(buffer, 0, 4);
			buffer[0] = 'e';
			buffer[1] = '1';
			buffer[2] = '2';
			buffer[3] = '3';
			os.write(buffer, 0, 4);
			buffer[0] = '4';
			buffer[1] = '5';
			os.write(buffer, 0, 2);
		} finally {
			os.close();
		}
	}
}
