package com.java.collection.sort;

import java.util.Map;
import java.util.TreeMap;

public class ComparatorTest3 {
	public static void main(String[] args) {
		Map<Student, String> map = new TreeMap<Student, String>(new AgeComparator());
		map.put(new Student("С��", 20), "С��");
		map.put(new Student("С��", 18), "С��");
		map.put(new Student("С��", 19), "С��");
		System.out.println(map);
	}
}
