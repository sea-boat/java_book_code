package com.java.io;

import java.io.FileWriter;
import java.io.IOException;

public class IOtest34 {
	public static void main(String[] args) throws IOException {
		FileWriter os = null;
		char[] buffer = new char[4];
		try {
			os = new FileWriter("D:/test.txt");
			buffer[0] = '��';
			buffer[1] = 'ӭ';
			buffer[2] = '��';
			buffer[3] = '��';
			os.write(buffer, 0, 4);
			buffer[0] = 'J';
			buffer[1] = 'a';
			buffer[2] = 'v';
			buffer[3] = 'a';
			os.write(buffer, 0, 4);
			buffer[0] = '��';
			buffer[1] = '��';
			os.write(buffer, 0, 2);
		} finally {
			os.close();
		}
	}
}
