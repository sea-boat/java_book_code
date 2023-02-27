package com.java.io;

import java.io.CharArrayWriter;
import java.io.IOException;

public class IOtest29 {
	public static void main(String[] args) {
		char[] arr = "欢迎来到Java世界！".toCharArray();
		CharArrayWriter caw = new CharArrayWriter(6);
		try {
			caw.write(arr);
			System.out.println(caw.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
