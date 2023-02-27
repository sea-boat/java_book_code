package com.java.collection.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetTest2 {

	public static void main(String[] args) {
		Set<People> set = new LinkedHashSet<People>();
		set.add(new People("С��", 12));
		set.add(new People("С��", 13));
		set.add(new People("С��", 14));
		set.add(new People("С��", 12));
		set.add(new People("С��", 12));
		Iterator<People> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next().name + " ");
		}
	}

}

class People {
	String name;
	int age;

	public People(String name, int age) {
		this.name = name;
		this.age = age;
	}
}