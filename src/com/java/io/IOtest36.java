package com.java.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class IOtest36 {
	public static void main(String[] args) throws IOException {
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter("D:/test.txt");
			bw = new BufferedWriter(fw);
			bw.write("���");
			bw.newLine();
			bw.write("��ӭ����");
			bw.newLine();
			bw.write("Java����");
			bw.newLine();
			bw.flush();
		} finally {
			bw.close();
			fw.close();
		}
	}
}
