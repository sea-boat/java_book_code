package com.java.reflect;

public class ReflectClassTest {
	public static void main(String[] args) throws ClassNotFoundException {
		//��һ�֣�ͨ������.class���ķ�ʽ��ȡ
		Class c1 = String.class;

		//�ڶ��֣�ͨ��������.getClass()���ķ�ʽ��ȡ
		String s = "test";
		Class c2 = s.getClass();

		//�����֣�ͨ����Class.forName()���ķ�ʽ��ȡ
		Class c3 = Class.forName("java.lang.String");
	}
}
