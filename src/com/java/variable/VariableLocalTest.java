package com.java.variable;

public class VariableLocalTest {
	public static void main(String[] args) {
		int a = 10;
		{
			int b = 11;
			System.out.println(a);
			System.out.println(b);
		}
		System.out.println(a);
		//System.out.println(b);//�ѳ������� b �����÷�Χ�����´���
	}
}
