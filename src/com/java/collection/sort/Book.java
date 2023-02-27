package com.java.collection.sort;

public class Book implements Comparable<Book> {
	String name;
	float price;

	public Book(String name, float price) {
		this.name = name;
		this.price = price;
	}

	public int compareTo(Book b) {
		if (this.price > b.price)
			return 1;
		else if (b.price > this.price)
			return -1;
		else
			return 0;
	}

	public String toString() {
		return name + "=" + price;
	}
}
