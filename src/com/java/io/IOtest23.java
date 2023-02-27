package com.java.io;

import java.io.FileWriter;
import java.io.IOException;

public class IOtest23 {
	public static void main(String[] args) throws IOException {
		FileWriter fw = null;
		try {
			fw = new FileWriter("D:/test.txt");
			fw.write('��');
			fw.write('��');
			fw.write("����Ա");
			fw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			fw.close();
		}
	}
}
