package com.java.collection.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ComparableTest2 {
	public static void main(String[] args) {
		Set<Book> set = new HashSet<Book>();
		set.add(new Book("���»��ֵ䡷", 100.9f));
		set.add(new Book("�����", 300.0f));
		set.add(new Book("�����ӱ�����", 88.9f));
		System.out.println("����ǰ��" + set);
		List<Book> books = new ArrayList<Book>(set);
		Collections.sort(books);
		System.out.println("�����" + books);
	}
}
