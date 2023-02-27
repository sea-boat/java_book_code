package com.java.io;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class IOtest25 {
	public static void main(String[] args) throws IOException {
		FileWriter fw = null;
		try {
			fw = new FileWriter("D:/test.txt", StandardCharsets.UTF_8);
			fw.write("欢迎来到Java世界");
			fw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			fw.close();
		}
	}
}
