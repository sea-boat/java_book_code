package com.java.collection.sort;

import java.util.Arrays;

public class ComparatorTest4 {
	public static void main(String[] args) {
		Student[] students = new Student[3];
		students[0] = new Student("小明", 20);
		students[1] = new Student("小东", 18);
		students[2] = new Student("小红", 19);
		System.out.println("排序前：" + Arrays.toString(students));
		Arrays.sort(students, new AgeComparator());
		System.out.println("排序后：" + Arrays.toString(students));
	}
}
