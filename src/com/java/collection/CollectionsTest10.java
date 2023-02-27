package com.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsTest10 {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("С��", 20));
		list.add(new Student("С��", 19));
		list.add(new Student("С��", 21));
		list.add(new Student("С��", 18));
		list.add(new Student("С��", 19));
		System.out.println("��������ѧ����" + Collections.max(list, new AgeComparator()));
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