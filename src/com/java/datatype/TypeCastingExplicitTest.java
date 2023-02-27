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
		System.out.println("long 类型显式转为 byte 类型：" + long2byte);
		System.out.println("double 类型显式转为 char 类型：" + double2char);
		System.out.println("char 类型显式转为 short 类型：" + char2short);
		System.out.println("float 类型显式转为 int 类型：" + float2int);
		System.out.println("int 类型显式转为 char 类型：" + int2char);
	}
}