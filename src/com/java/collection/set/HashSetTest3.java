package com.java.collection.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest3 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("小明");
		set.add("小明");
		set.add("小明");
		set.add("小明");
		System.out.println(set);
	}

}
