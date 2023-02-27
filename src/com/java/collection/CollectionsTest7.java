package com.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsTest7 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(20);
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(20);
		System.out.println("元素20出现的次数：" + Collections.frequency(list, 20));
	}
}
