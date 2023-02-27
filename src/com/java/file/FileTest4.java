package com.java.file;

import java.io.File;
import java.io.IOException;

public class FileTest4 {
	public static void main(String[] args) throws IOException {
		File f = new File(".");
		File[] fs = f.listFiles();
		for (File file : fs) {
			System.out.println(file.getName());
		}
	}
}
