package com.java.collection.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableTest {
	public static void main(String[] args) {
		List<Book> list = new ArrayList<Book>();
		list.add(new Book("���»��ֵ䡷", 100.9f));
		list.add(new Book("�����", 300.0f));
		list.add(new Book("�����ӱ�����", 88.9f));
		System.out.println("����ǰ��" + list);
		Collections.sort(list);
		System.out.println("�����" + list);
	}
}
