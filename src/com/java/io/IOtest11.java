package com.java.io;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class IOtest11 {
	public static void main(String[] args) {
		byte[] arr = { 'a', 'b', 'c', 'd', 'e', '1', '2', '3', '4', '5' };
		ByteArrayOutputStream baos = new ByteArrayOutputStream(6);
		try {
			baos.write(arr);
			System.out.println(baos.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
