package com.java.collection.list;

import java.util.Iterator;
import java.util.Stack;

public class StackTest2 {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.push("�й�");
		stack.push("����");
		stack.push("�¹�");
		stack.push("Ӣ��");
		Iterator<String> iterator = stack.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
