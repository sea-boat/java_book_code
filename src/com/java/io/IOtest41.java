package com.java.io;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class IOtest41 {
	public static void main(String[] args) throws IOException {
		ByteArrayOutputStream baos = null;
		OutputStreamWriter osw = null;
		String str = "ÄãºÃ";
		try {
			baos = new ByteArrayOutputStream();
			osw = new OutputStreamWriter(baos, "UTF-8");
			osw.write(str);
			osw.flush();
			byte[] bytes = baos.toByteArray();
			for (byte b : bytes) {
				System.out.print(" " + (0xff & b));
			}
		} finally {
			baos.close();
			osw.close();
		}
	}
}
