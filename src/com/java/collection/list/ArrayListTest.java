package com.java.collection.list;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		ArrayList<Integer> list2 = new ArrayList<Integer>(20);
		ArrayList<String> list3 = new ArrayList<String>();
		list3.add("hello");
		list3.add("java");
		ArrayList<String> list4 = new ArrayList<String>(list3);
		System.out.println(list4);
	}

}
