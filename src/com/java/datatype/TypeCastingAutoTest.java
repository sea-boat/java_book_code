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
		System.out.println("byte ������ʽתΪ int ���ͣ�" + byte2int);
		System.out.println("short ������ʽתΪ long ���ͣ�" + short2long);
		System.out.println("int ������ʽתΪ long ���ͣ�" + int2long);
		System.out.println("long ������ʽתΪ float ���ͣ�" + long2float);
		System.out.println("char ������ʽתΪ int ���ͣ�" + char2int);
		System.out.println("float ������ʽתΪ double ���ͣ�" + float2double);
	}
}