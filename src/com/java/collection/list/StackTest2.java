package com.java.collection.list;

import java.util.Iterator;
import java.util.Stack;

public class StackTest2 {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.push("中国");
		stack.push("美国");
		stack.push("德国");
		stack.push("英国");
		Iterator<String> iterator = stack.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
