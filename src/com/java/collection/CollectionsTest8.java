package com.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsTest8 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(20);
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(20);
		System.out.println("�滻ǰ��" + list);
		Collections.replaceAll(list, 20, 100);
		System.out.println("�滻��" + list);
	}
}
