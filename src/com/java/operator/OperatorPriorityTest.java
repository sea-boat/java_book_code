package com.java.operator;

public class OperatorPriorityTest {
	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		if (a + 1 == 1 && b == 0) {
			System.out.println("先执行 + 运算符 ");
			System.out.println("接着执行第一个  == 运算符 ");
			System.out.println("再执行第二个  == 运算符 ");
			System.out.println("最后执行  && 运算符 ");
		}
	}
}
