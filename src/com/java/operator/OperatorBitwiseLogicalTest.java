package com.java.operator;

public class OperatorBitwiseLogicalTest {
	public static void main(String[] args) {
		int a = 7;
		int b = 15;
		byte c = 3;
		byte d = 4;
		char e = 'a';
		char f = 'b';
		System.out.println(a & b);
		System.out.println(a | b);
		System.out.println(a ^ b);
		System.out.println(~a);
		System.out.println(c & d);
		System.out.println(e & f);
	}
}
