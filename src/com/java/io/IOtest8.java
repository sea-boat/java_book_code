package com.java.io;

import java.io.ByteArrayInputStream;

public class IOtest8 {
	public static void main(String[] args) {
		byte[] arr = { 'a', 'b', 'c', 'd', 'e', '1', '2', '3', '4', '5' };
		ByteArrayInputStream bais = new ByteArrayInputStream(arr);
		int value = 0;
		while ((value = bais.read()) != -1) {
			System.out.println((char) value);
			System.out.println("跳过两个元素");
			bais.skip(2);
		}
	}
}
