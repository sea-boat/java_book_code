package com.java.io;

import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IOtest14 {
	public static void main(String[] args) throws IOException {
		BufferedInputStream bis = null;
		try {
			bis = new BufferedInputStream(System.in, 4);
			int value = 0;
			while ((value = bis.read()) != -1) {
				System.out.print((char) value);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (bis != null)
				bis.close();
		}
	}
}
