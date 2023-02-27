package com.java.io;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class IOtest37 {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = null;
		try {
			OutputStreamWriter osw = new OutputStreamWriter(System.out);
			bw = new BufferedWriter(osw);
			bw.write("欢迎来到Java世界");
			bw.newLine();
			bw.write("拜拜");
		} finally {
			bw.close();
		}
	}
}
