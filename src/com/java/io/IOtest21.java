package com.java.io;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.PushbackInputStream;

public class IOtest21 {
	public static void main(String[] args) throws IOException {
		ByteArrayInputStream bais = null;
		PushbackInputStream pis = null;
		byte[] bytes = { 'a', 'a', '@', '@', 'b', 'b', '@', 'c', 'c' };
		try {
			bais = new ByteArrayInputStream(bytes);
			pis = new PushbackInputStream(bais, 1);
			int value;
			while ((value = pis.read()) != -1) {
				if (value == (int) '@') {
					int next1 = pis.read();
					if (next1 == '@') {
						System.out.println();
					} else {
						pis.unread(next1);
						pis.unread(next1);
					}
				} else {
					System.out.print((char) value);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			bais.close();
			pis.close();
		}
	}
}
