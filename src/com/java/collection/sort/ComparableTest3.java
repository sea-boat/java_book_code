package com.java.collection.sort;

import java.util.Map;
import java.util.TreeMap;

public class ComparableTest3 {
	public static void main(String[] args) {
		Map<Book, String> map = new TreeMap<Book, String>();
		map.put(new Book("���»��ֵ䡷", 100.9f), "С��");
		map.put(new Book("�����", 300.0f), "С��");
		map.put(new Book("�����ӱ�����", 88.9f), "С��");
		System.out.println(map);
	}
}
