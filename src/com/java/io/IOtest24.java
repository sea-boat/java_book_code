package com.java.io;

import java.io.FileWriter;
import java.io.IOException;

public class IOtest24 {
	public static void main(String[] args) throws IOException {
		FileWriter fw = null;
		try {
			fw = new FileWriter("D:/test.txt", true);
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
