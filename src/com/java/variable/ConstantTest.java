package com.java.variable;

public class ConstantTest {
	final int CONSTANT_A = 10;//��Ա����
	final static int CONSTANT_B = 11;//��̬����

	public static void main(String[] args) {
		final int CONSTANT_C = 12;//�ֲ�����
		ConstantTest ct = new ConstantTest();//���� ConstantTest ����
		{
			final int CONSTANT_D = 13;//�ֲ�����
			System.out.println(ct.CONSTANT_A);//ͨ�� ConstantTest �����Ա���� CONSTANT_A 
			System.out.println(CONSTANT_B);
			System.out.println(CONSTANT_C);
			System.out.println(CONSTANT_D);
		}
		System.out.println(ct.CONSTANT_A);//ͨ�� ConstantTest �����Ա���� CONSTANT_A 
		System.out.println(CONSTANT_B);
		System.out.println(CONSTANT_C);
		//System.out.println(CONSTANT_D);//�ѳ������� CONSTANT_D �����÷�Χ�����´���
	}
}
