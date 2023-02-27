package com.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionsTest5 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(20);
		list.add(10);
		list.add(50);
		list.add(30);
		list.add(5);
		System.out.println("List中最小的元素：" + Collections.min(list));
		Set<Integer> set = new HashSet<Integer>(list);
		System.out.println("Set中最小的元素：" + Collections.min(set));
	}
}
