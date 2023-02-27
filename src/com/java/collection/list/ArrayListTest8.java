package com.java.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListTest8 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("g");
		list.add("b");
		list.add("k");
		list.add("2");
		list.add("7");
		list.add("3");
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}

}
