package com.java.datatype;

public class TypeCastingExplicitTest {
	public static void main(String[] args) {
		char c = 'a';
		int i = 55;
		long l = 66L;
		float f = 77.0f;
		double d = 65.0;
		byte long2byte = (byte) l;
		char double2char = (char) d;
		short char2short = (short) c;
		int float2int = (int) f;
		char int2char = (char) i;
		System.out.println("long ������ʽתΪ byte ���ͣ�" + long2byte);
		System.out.println("double ������ʽתΪ char ���ͣ�" + double2char);
		System.out.println("char ������ʽתΪ short ���ͣ�" + char2short);
		System.out.println("float ������ʽתΪ int ���ͣ�" + float2int);
		System.out.println("int ������ʽתΪ char ���ͣ�" + int2char);
	}
}