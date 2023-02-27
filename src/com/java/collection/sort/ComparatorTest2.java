package com.java.collection.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ComparatorTest2 {
	public static void main(String[] args) {
		Set<Student> set = new HashSet<Student>();
		set.add(new Student("С��", 20));
		set.add(new Student("С��", 18));
		set.add(new Student("С��", 19));
		System.out.println("����ǰ��" + set);
		List<Student> books = new ArrayList<Student>(set);
		Collections.sort(books, new AgeComparator());
		System.out.println("�����" + books);
	}
}
