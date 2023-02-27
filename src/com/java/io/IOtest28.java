package com.java.io;

import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

public class IOtest28 {
	public static void main(String[] args) {
		String str = "欢迎来到Java世界！";
		CharArrayWriter caw = new CharArrayWriter();
		try {
			FileWriter fw1 = new FileWriter("D:/test1.txt");
			FileWriter fw2 = new FileWriter("D:/test2.txt");
			FileWriter fw3 = new FileWriter("D:/test3.txt");
			caw.write(str);
			caw.writeTo(fw1);
			caw.writeTo(fw2);
			caw.writeTo(fw3);
			fw1.flush();
			fw2.flush();
			fw3.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			caw.close();
		}
	}
}
