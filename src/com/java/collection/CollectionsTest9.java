package com.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsTest9 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(20);
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(20);
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(0);
		list2.add(0);
		list2.add(0);
		list2.add(0);
		list2.add(0);
		System.out.println("复制前list2：" + list2);
		Collections.copy(list2, list);
		System.out.println("复制后list2：" + list2);
	}
}
