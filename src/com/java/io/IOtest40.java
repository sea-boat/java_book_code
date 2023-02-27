package com.java.io;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class IOtest40 {
	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("D:/test.txt");
			OutputStreamWriter osw = new OutputStreamWriter(fos, "GBK");
			osw.write("ÄãºÃJava");
			osw.flush();
			osw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
