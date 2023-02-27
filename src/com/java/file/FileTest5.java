package com.java.file;

import java.io.File;
import java.io.IOException;

public class FileTest5 {
	public static void main(String[] args) throws IOException {
		File dir1 = new File("D:/test1");
		dir1.mkdir();
		File f = new File("D:/test1/文件1.txt");
		File f2 = new File("D:/test1/文件2.txt");
		f.createNewFile();
		f2.createNewFile();
		File dir2 = new File("D:/test2");
		dir2.mkdir();
	}
}
