package com.java.variable;

public class VariableGlobalTest {
	int a = 10;

	public static void main(String[] args) {
		VariableGlobalTest vg = new VariableGlobalTest();//创建 VariableGlobalTest 对象
		System.out.println(vg.a);//通过 VariableGlobalTest 对象访问成员变量 a
		vg = null;//销毁 VariableGlobalTest 对象
		System.out.println(vg.a);
	}
}
