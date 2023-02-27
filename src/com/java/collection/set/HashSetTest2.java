package com.java.collection.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest2 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("小明");
		set.add("小东");
		set.add("小花");
		set.add("小林");
		System.out.println(set);
		set.remove("小东");
		set.remove("小林");
		System.out.println(set);
	}

}
