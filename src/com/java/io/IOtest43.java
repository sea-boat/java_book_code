package com.java.io;

import java.io.CharArrayReader;
import java.io.IOException;
import java.io.PushbackReader;

public class IOtest43 {
	public static void main(String[] args) throws IOException {
		char ary[] = { 'a', '-', '-', 'b', '-', 'c', 'd', '-', '-', '-', 'e' };
		CharArrayReader car = new CharArrayReader(ary);
		PushbackReader pr = new PushbackReader(car);
		int i;
		while ((i = pr.read()) != -1) {
			if (i == '-') {
				int j;
				if ((j = pr.read()) == '-') {
					System.out.print("*");
				} else {
					pr.unread(j);
					System.out.print((char) i);
				}
			} else {
				System.out.print((char) i);
			}
		}
	}
}
