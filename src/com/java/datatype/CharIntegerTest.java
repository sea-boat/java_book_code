package com.java.datatype;

public class CharIntegerTest {

	public static void main(String args[]) {
		char c = 'A';
		int i = c;
		int ii = i + 32;
		char cc = (char) ii;
		char ccc = 'Äã';
		int iii = ccc;
		char cccc = '0';
		int iiii = cccc;
		System.out.println("c = " + c);
		System.out.println("i = " + i);
		System.out.println("cc = " + cc);
		System.out.println("iii = " + iii);
		System.out.println("iiii = " + iiii);
	}

}
