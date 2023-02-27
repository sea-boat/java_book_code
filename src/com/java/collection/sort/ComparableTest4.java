package com.java.collection.sort;

import java.util.Arrays;

public class ComparableTest4 {
	public static void main(String[] args) {
		Book[] books = new Book[3];
		books[0] = new Book("《新华字典》", 100.9f);
		books[1] = new Book("《论语》", 300.0f);
		books[2] = new Book("《孙子兵法》", 88.9f);
		System.out.println("排序前：" + Arrays.toString(books));
		Arrays.sort(books);
		System.out.println("排序后：" + Arrays.toString(books));
	}
}
