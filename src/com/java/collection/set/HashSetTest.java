package com.java.collection.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		Set<String> set1 = new HashSet<String>();
		Set<String> set2 = new HashSet<String>(100);
		ArrayList<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("java");
		Set<String> set3 = new HashSet<String>(list);
		System.out.println(set3);
	}

}
