package com.java.variable;

public class VariableStaticTest {
	static int a = 10;

	public static void main(String[] args) {
		VariableStaticTest vs = new VariableStaticTest();//���� VariableStaticTest ����
		System.out.println(a);
		System.out.println(vs.a);//ͨ�� VariableStaticTest ������ʳ�Ա���� a
		System.out.println(VariableStaticTest.a);//ͨ�� VariableStaticTest ����ʳ�Ա���� a
	}
}
