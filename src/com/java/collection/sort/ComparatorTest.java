package com.java.collection.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorTest {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("С��", 20));
		list.add(new Student("С��", 18));
		list.add(new Student("С��", 19));
		System.out.println("����ǰ��" + list);
		Collections.sort(list, new AgeComparator());
		System.out.println("�����" + list);
	}
}
