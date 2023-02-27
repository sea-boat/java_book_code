package com.java.variable;

public class ConstantTest {
	final int CONSTANT_A = 10;//成员常量
	final static int CONSTANT_B = 11;//静态常量

	public static void main(String[] args) {
		final int CONSTANT_C = 12;//局部常量
		ConstantTest ct = new ConstantTest();//创建 ConstantTest 对象
		{
			final int CONSTANT_D = 13;//局部常量
			System.out.println(ct.CONSTANT_A);//通过 ConstantTest 对象成员变量 CONSTANT_A 
			System.out.println(CONSTANT_B);
			System.out.println(CONSTANT_C);
			System.out.println(CONSTANT_D);
		}
		System.out.println(ct.CONSTANT_A);//通过 ConstantTest 对象成员变量 CONSTANT_A 
		System.out.println(CONSTANT_B);
		System.out.println(CONSTANT_C);
		//System.out.println(CONSTANT_D);//已超出变量 CONSTANT_D 的作用范围，导致错误
	}
}
