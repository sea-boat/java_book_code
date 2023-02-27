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
			bw.write("��ӭ����Java����");
			bw.newLine();
			bw.write("�ݰ�");
		} finally {
			bw.close();
		}
	}
}
