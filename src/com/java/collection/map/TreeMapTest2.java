package com.java.collection.map;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapTest2 {

	public static void main(String[] args) {
		TreeMap<Book, String> map = new TreeMap<Book, String>(new PriceComparator());
		map.put(new Book("水浒传", 50.5), "小明");
		map.put(new Book("西游记", 45.8), "小东");
		map.put(new Book("三国演义", 100.8), "小红");
		map.put(new Book("红楼梦", 88.8), "小莉");
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
