package com.java.collection.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(46);
		set.add(23);
		set.add(69);
		set.add(10);
		set.add(20);
		set.add(50);
		System.out.println(set);
		System.out.println(set.descendingSet());
		Iterator<Integer> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		System.out.println();
		Iterator<Integer> itr2 = set.descendingIterator();
		while (itr2.hasNext()) {
			System.out.print(itr2.next() + " ");
		}
	}

}
