package com.java.system;

import java.io.Console;

public class SystemTest7 {
	public static void main(String args[]) {
		Console console = System.console();
		if (console != null) {
			while (true) {
				console.printf("Please input a command => ");
				String str = console.readLine();
				if (str.equals("stop"))
					System.exit(1);
			}
		}
	}
}
