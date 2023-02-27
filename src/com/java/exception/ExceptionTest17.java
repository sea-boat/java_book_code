package com.java.exception;

import java.io.IOException;

public class ExceptionTest17 {

	public static void main(String[] args) {
		try {
			test();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void test() throws IOException {
		throw new IOException("IO“Ï≥£");
	}
}
