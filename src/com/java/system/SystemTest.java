package com.java.system;

import java.io.Console;

public class SystemTest {
	public static void main(String args[]) {
		Console console = System.console();
		if (console != null) {
			console.printf("Enter your name: ");
			String name = console.readLine();
			System.out.println("Your name is: " + name);
		}
	}
}
