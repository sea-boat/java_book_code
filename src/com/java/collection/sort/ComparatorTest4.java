package com.java.collection.sort;

import java.util.Arrays;

public class ComparatorTest4 {
	public static void main(String[] args) {
		Student[] students = new Student[3];
		students[0] = new Student("С��", 20);
		students[1] = new Student("С��", 18);
		students[2] = new Student("С��", 19);
		System.out.println("����ǰ��" + Arrays.toString(students));
		Arrays.sort(students, new AgeComparator());
		System.out.println("�����" + Arrays.toString(students));
	}
}
