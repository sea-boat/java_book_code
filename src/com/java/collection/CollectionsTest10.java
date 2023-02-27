package com.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsTest10 {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("小明", 20));
		list.add(new Student("小东", 19));
		list.add(new Student("小花", 21));
		list.add(new Student("小莉", 18));
		list.add(new Student("小红", 19));
		System.out.println("年龄最大的学生：" + Collections.max(list, new AgeComparator()));
	}
}

class Student {

	String name;
	int age;

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return name + "=" + age;
	}
}

class AgeComparator implements Comparator<Student> {

	public int compare(Student s1, Student s2) {
		if (s1.age > s2.age)
			return 1;
		else if (s1.age < s2.age)
			return -1;
		else
			return 0;
	}

}