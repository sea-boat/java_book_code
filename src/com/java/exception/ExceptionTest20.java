package com.java.exception;

import java.io.IOException;

public class ExceptionTest20 {

	public static void main(String[] args) {
		try {
			test2();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void test() throws IOException {
		throw new IOException("IO�쳣");
	}
	
	public static void test2() throws IOException {
		test();
	}
}
