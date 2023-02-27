package com.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsTest6 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(20);
		list.add(10);
		list.add(50);
		list.add(30);
		list.add(5);
		System.out.println("Ìî³äÇ°£º" + list);
		Collections.fill(list, 100);
		System.out.println("Ìî³äºó£º" + list);
	}
}
