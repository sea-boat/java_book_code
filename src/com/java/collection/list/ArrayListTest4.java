package com.java.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest4 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("�й�");
		list.add("����");
		list.add("�¹�");
		System.out.println(list);
		list.set(2, "����");
		System.out.println(list);
	}

}
