package com.java.collection.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorTest {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("小明", 20));
		list.add(new Student("小东", 18));
		list.add(new Student("小红", 19));
		System.out.println("排序前：" + list);
		Collections.sort(list, new AgeComparator());
		System.out.println("排序后：" + list);
	}
}
