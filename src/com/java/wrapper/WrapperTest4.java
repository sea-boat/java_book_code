package com.java.wrapper;

public class WrapperTest4 {
	public static void main(String[] args) {
		Byte byteB = Byte.parseByte("127");
		Integer intI = Integer.parseInt("10");
		System.out.println(Integer.toBinaryString(byteB));
		System.out.println(Integer.toOctalString(byteB));
		System.out.println(Integer.toHexString(byteB));
		System.out.println(Integer.toBinaryString(intI));
		System.out.println(Integer.toOctalString(intI));
		System.out.println(Integer.toHexString(intI));
	}
}
