package com.java.collection.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableTest {
	public static void main(String[] args) {
		List<Book> list = new ArrayList<Book>();
		list.add(new Book("《新华字典》", 100.9f));
		list.add(new Book("《论语》", 300.0f));
		list.add(new Book("《孙子兵法》", 88.9f));
		System.out.println("排序前：" + list);
		Collections.sort(list);
		System.out.println("排序后：" + list);
	}
}
