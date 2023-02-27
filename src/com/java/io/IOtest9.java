package com.java.io;

import java.io.ByteArrayInputStream;

public class IOtest9 {
	public static void main(String[] args) {
		byte[] arr = { 'a', 'b', 'c', 'd', 'e', '1', '2', '3', '4', '5' };
		ByteArrayInputStream bais = new ByteArrayInputStream(arr);
		int value = 0;
		int flag = 0;
		while ((value = bais.read()) != -1) {
			System.out.print((char) value);
			if (flag == 2)
				bais.mark(0);
			if (flag == 7)
				bais.reset();
			flag++;
		}
	}
}
