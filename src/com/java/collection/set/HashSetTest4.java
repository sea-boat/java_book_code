package com.java.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest4 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("С��");
		set.add("С��");
		set.add("С��");
		set.add("С��");
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
