package com.java.collection.set;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetTest2 {

	public static void main(String[] args) {
		TreeSet<Book> set = new TreeSet<Book>(new PriceComparator());
		set.add(new Book("ˮ䰴�", 50.5));
		set.add(new Book("���μ�", 45.8));
		set.add(new Book("��������", 100.8));
		set.add(new Book("��¥��", 88.8));
		System.out.println(set);
	}

}

class PriceComparator implements Comparator<Book> {
	public int compare(Book s1, Book s2) {
		if (s1.price == s2.price)
			return 0;
		else if (s1.price > s2.price)
			return 1;
		else
			return -1;
	}
}

class Book {
	String name;
	double price;

	public Book(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String toString() {
		return this.name + "=" + this.price;
	}
}
