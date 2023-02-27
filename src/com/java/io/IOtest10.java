package com.java.io;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOtest10 {
	public static void main(String[] args) throws IOException {
		byte[] arr = { 'a', 'b', 'c', 'd', 'e', '1', '2', '3', '4', '5' };
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		try {
			FileOutputStream fos1 = new FileOutputStream("D:/test1.txt");
			FileOutputStream fos2 = new FileOutputStream("D:/test2.txt");
			FileOutputStream fos3 = new FileOutputStream("D:/test3.txt");
			baos.write(arr);
			baos.writeTo(fos1);
			baos.writeTo(fos2);
			baos.writeTo(fos3);
			baos.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			baos.close();
		}
	}
}
