package com.java.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PushbackInputStream;

public class IOtest20 {
	public static void main(String[] args) throws IOException {
		FileInputStream ins = null;
		PushbackInputStream pis = null;
		try {
			ins = new FileInputStream("D:/test.txt");
			pis = new PushbackInputStream(ins, 2);
			int value;
			while ((value = pis.read()) != -1) {
				if (value == (int) '@') {
					int next1 = pis.read();
					int next2 = pis.read();
					if (next1 == '@' && next2 == '@') {
						System.out.println();
					} else {
						pis.unread(next2);
						pis.unread(next1);
						System.out.print((char)value);
					}
				} else {
					System.out.print((char) value);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ins.close();
			pis.close();
		}
	}
}
