package com.java.file;

import java.io.File;

public class FileTest {

	public static void main(String[] args) {
		File f = new File("D:/java/test.txt");
		File f2 = new File("D://java//test.txt");
		File f3 = new File("D:\\java\\test.txt");
//		File f4 = new File("D:\java\test.txt");
	}
}
