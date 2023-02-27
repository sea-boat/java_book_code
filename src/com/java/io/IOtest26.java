package com.java.io;

import java.io.CharArrayReader;
import java.io.IOException;

public class IOtest26 {
	public static void main(String[] args) throws IOException {
		char[] arr = "��ӭ����Java����".toCharArray();
		CharArrayReader car = new CharArrayReader(arr);
		int value = 0;
		while ((value = car.read()) != -1) {
			System.out.print((char) value);
			car.skip(1);
		}
	}
}
