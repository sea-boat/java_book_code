package com.java.io;

import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;
import java.nio.charset.StandardCharsets;

public class IOtest42 {
	public static void main(String[] args) throws IOException {
		FileReader fr = null;
		PushbackReader pr = null;
		try {
			fr = new FileReader("D:/test.txt", StandardCharsets.UTF_8);
			pr = new PushbackReader(fr, 2);
			int value;
			while ((value = pr.read()) != -1) {
				if (value == (int) '@') {
					int next1 = pr.read();
					int next2 = pr.read();
					if (next1 == '@' && next2 == '@') {
						System.out.println();
					} else {
						pr.unread(next2);
						pr.unread(next1);
					}
				} else {
					System.out.print((char) value);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			fr.close();
			pr.close();
		}
	}
}
