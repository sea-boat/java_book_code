package com.java.variable;

public class VariableStaticTest {
	static int a = 10;

	public static void main(String[] args) {
		VariableStaticTest vs = new VariableStaticTest();//创建 VariableStaticTest 对象
		System.out.println(a);
		System.out.println(vs.a);//通过 VariableStaticTest 对象访问成员变量 a
		System.out.println(VariableStaticTest.a);//通过 VariableStaticTest 类访问成员变量 a
	}
}
