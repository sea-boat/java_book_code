package com.java.collection.sort;

import java.util.Arrays;

public class ComparableTest4 {
	public static void main(String[] args) {
		Book[] books = new Book[3];
		books[0] = new Book("���»��ֵ䡷", 100.9f);
		books[1] = new Book("�����", 300.0f);
		books[2] = new Book("�����ӱ�����", 88.9f);
		System.out.println("����ǰ��" + Arrays.toString(books));
		Arrays.sort(books);
		System.out.println("�����" + Arrays.toString(books));
	}
}
