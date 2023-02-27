package com.java.io;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOtest39 {
	public static void main(String[] args) throws IOException {
		ByteArrayInputStream abis = null;
		InputStreamReader isr = null;
		byte[] bytes = { (byte) 228, (byte) 189, (byte) 160, (byte) 229, (byte) 165, (byte) 189 };
		try {
			abis = new ByteArrayInputStream(bytes);
			isr = new InputStreamReader(abis, "UTF-8");
			int value = 0;
			while ((value = isr.read()) != -1) {
				System.out.print((char) value);
			}
		} finally {
			abis.close();
			isr.close();
		}
	}
}
