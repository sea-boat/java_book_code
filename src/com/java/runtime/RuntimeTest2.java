package com.java.runtime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class RuntimeTest2 {
	public static void main(String[] args) throws IOException {
		Process process = Runtime.getRuntime().exec("dir");
		InputStream fis = process.getInputStream();
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		String line;
		System.out.println("dir ÃüÁîÊä³ö£º");
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}

		process = Runtime.getRuntime().exec("cmd.exe /c echo %JAVA_HOME%");
		fis = process.getInputStream();
		isr = new InputStreamReader(fis);
		br = new BufferedReader(isr);
		System.out.println("cmd´°¿Ú´òÓ¡%JAVA_HOME%£º");
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
	}
}
