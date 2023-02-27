package com.java.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class IOtest35 {
	public static void main(String[] args) throws IOException {
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter("D:/test.txt");
			bw = new BufferedWriter(fw);
			bw.write("你好");
			bw.write("欢迎来到");
			bw.write("Java世界");
			bw.flush();
		} finally {
			bw.close();
			fw.close();
		}
	}
}
