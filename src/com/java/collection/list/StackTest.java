package com.java.collection.list;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.push("�й�");
		stack.push("����");
		stack.push("�¹�");
		stack.push("Ӣ��");
		System.out.println("��ջ��" + stack);
		System.out.println("��ջ��С��" + stack.size());
		System.out.println("ָ��Ԫ��������" + stack.search("�¹�"));
		stack.pop();
		System.out.println("��ջ��" + stack);
		System.out.println("��ȡջ��Ԫ�أ�" + stack.peek());
		stack.pop();
		System.out.println("��ջ��" + stack);
	}

}
