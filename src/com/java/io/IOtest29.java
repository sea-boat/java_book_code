package com.java.io;

import java.io.CharArrayWriter;
import java.io.IOException;

public class IOtest29 {
	public static void main(String[] args) {
		char[] arr = "��ӭ����Java���磡".toCharArray();
		CharArrayWriter caw = new CharArrayWriter(6);
		try {
			caw.write(arr);
			System.out.println(caw.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
