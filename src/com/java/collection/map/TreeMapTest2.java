package com.java.collection.map;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapTest2 {

	public static void main(String[] args) {
		TreeMap<Book, String> map = new TreeMap<Book, String>(new PriceComparator());
		map.put(new Book("ˮ䰴�", 50.5), "С��");
		map.put(new Book("���μ�", 45.8), "С��");
		map.put(new Book("��������", 100.8), "С��");
		map.put(new Book("��¥��", 88.8), "С��");
		System.out.println(map);
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
		return this.name + "(" + this.price + ")";
	}
}
