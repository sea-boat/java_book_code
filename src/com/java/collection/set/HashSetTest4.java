package com.java.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest4 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("小明");
		set.add("小东");
		set.add("小花");
		set.add("小胡");
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
