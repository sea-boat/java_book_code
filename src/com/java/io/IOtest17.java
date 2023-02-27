package com.java.io;

import java.io.BufferedOutputStream;
import java.io.IOException;

public class IOtest17 {
	public static void main(String[] args) throws IOException {
		BufferedOutputStream bos = null;
		try {
			bos = new BufferedOutputStream(System.out, 4);
			bos.write("abcde12345".getBytes());
			bos.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (bos != null)
				bos.close();
		}
	}
}
