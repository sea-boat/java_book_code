package com.java.collection.sort;

import java.util.Map;
import java.util.TreeMap;

public class ComparableTest3 {
	public static void main(String[] args) {
		Map<Book, String> map = new TreeMap<Book, String>();
		map.put(new Book("《新华字典》", 100.9f), "小明");
		map.put(new Book("《论语》", 300.0f), "小东");
		map.put(new Book("《孙子兵法》", 88.9f), "小花");
		System.out.println(map);
	}
}
