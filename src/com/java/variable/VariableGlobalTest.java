package com.java.variable;

public class VariableGlobalTest {
	int a = 10;

	public static void main(String[] args) {
		VariableGlobalTest vg = new VariableGlobalTest();//���� VariableGlobalTest ����
		System.out.println(vg.a);//ͨ�� VariableGlobalTest ������ʳ�Ա���� a
		vg = null;//���� VariableGlobalTest ����
		System.out.println(vg.a);
	}
}
