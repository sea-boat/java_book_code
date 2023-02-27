package com.java.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOtest32 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = null;
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			br = new BufferedReader(isr);
			String str = "";
			while (!str.equals("exit")) {
				str = br.readLine();
				System.out.println(str);
			}
		} finally {
			br.close();
		}
	}
}
