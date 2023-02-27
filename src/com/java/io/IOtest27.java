package com.java.io;

import java.io.CharArrayReader;
import java.io.IOException;

public class IOtest27 {
	public static void main(String[] args) throws IOException {
		char[] arr = "欢迎来到Java世界".toCharArray();
		CharArrayReader car = new CharArrayReader(arr);
		int value = 0;
		int flag = 0;
		while ((value = car.read()) != -1) {
			System.out.print((char) value);
			if (flag == 2)
				car.mark(0);
			if (flag == 7)
				car.reset();
			flag++;
		}
	}
}
