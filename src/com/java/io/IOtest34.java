package com.java.io;

import java.io.FileWriter;
import java.io.IOException;

public class IOtest34 {
	public static void main(String[] args) throws IOException {
		FileWriter os = null;
		char[] buffer = new char[4];
		try {
			os = new FileWriter("D:/test.txt");
			buffer[0] = '欢';
			buffer[1] = '迎';
			buffer[2] = '来';
			buffer[3] = '到';
			os.write(buffer, 0, 4);
			buffer[0] = 'J';
			buffer[1] = 'a';
			buffer[2] = 'v';
			buffer[3] = 'a';
			os.write(buffer, 0, 4);
			buffer[0] = '世';
			buffer[1] = '界';
			os.write(buffer, 0, 2);
		} finally {
			os.close();
		}
	}
}
