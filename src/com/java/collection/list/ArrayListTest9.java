package com.java.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListTest9 {

	public static void main(String[] args) {
		List<Book> list = new ArrayList<Book>();
		list.add(new Book("《新华字典》", 100.9f));
		list.add(new Book("《论语》", 300.0f));
		list.add(new Book("《孙子兵法》", 88.9f));
		System.out.println("集合：" + list);
		Collections.sort(list);
		System.out.println(list);
		System.out.println("获取索引为 1 的元素：" + list.get(1));
		System.out.println("修改索引为 1 的元素：" + list.set(1, new Book("《诗经》", 110.0f)));
		System.out.println("删除索引为 1 的元素：" + list.remove(1));
		System.out.println(list);
	}

}

class Book implements Comparable<Book> {
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
		return name + "-" + price;
	}
}
