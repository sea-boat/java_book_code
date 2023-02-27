package com.java.file;

import java.io.File;
import java.io.IOException;

public class FileTest2 {
	public static void main(String[] args) {
		File f = new File("D:/java/test.txt");
		try {
			f.createNewFile();
			f.delete();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
