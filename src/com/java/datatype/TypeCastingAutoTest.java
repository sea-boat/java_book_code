package com.java.datatype;

public class TypeCastingAutoTest {
	public static void main(String[] args) {
		byte b = (byte) 22;
		short s = (short) 33;
		char c = 'a';
		int i = 55;
		long l = 66L;
		float f = 77.0f;
		int byte2int = b;
		long short2long = s;
		long int2long = i;
		float long2float = l;
		int char2int = c;
		double float2double = f;
		System.out.println("byte 类型隐式转为 int 类型：" + byte2int);
		System.out.println("short 类型隐式转为 long 类型：" + short2long);
		System.out.println("int 类型隐式转为 long 类型：" + int2long);
		System.out.println("long 类型隐式转为 float 类型：" + long2float);
		System.out.println("char 类型隐式转为 int 类型：" + char2int);
		System.out.println("float 类型隐式转为 double 类型：" + float2double);
	}
}