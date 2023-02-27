package com.java.collection.list;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.push("中国");
		stack.push("美国");
		stack.push("德国");
		stack.push("英国");
		System.out.println("堆栈：" + stack);
		System.out.println("堆栈大小：" + stack.size());
		System.out.println("指定元素索引：" + stack.search("德国"));
		stack.pop();
		System.out.println("堆栈：" + stack);
		System.out.println("获取栈顶元素：" + stack.peek());
		stack.pop();
		System.out.println("堆栈：" + stack);
	}

}
