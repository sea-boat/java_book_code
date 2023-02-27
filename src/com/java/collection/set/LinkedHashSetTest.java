package com.java.collection.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetTest {

	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<String>();
		set.add("小明");
		set.add("小东");
		set.add("小花");
		set.add("小胡");
		set.add("tom");
		set.add("jim");
		set.add("lucy");
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
	}

}
