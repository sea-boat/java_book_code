package com.java.collection.sort;

import java.util.Map;
import java.util.TreeMap;

public class ComparatorTest3 {
	public static void main(String[] args) {
		Map<Student, String> map = new TreeMap<Student, String>(new AgeComparator());
		map.put(new Student("小明", 20), "小明");
		map.put(new Student("小东", 18), "小东");
		map.put(new Student("小红", 19), "小花");
		System.out.println(map);
	}
}
