package com.java.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListTest9 {

	public static void main(String[] args) {
		List<Book> list = new ArrayList<Book>();
		list.add(new Book("���»��ֵ䡷", 100.9f));
		list.add(new Book("�����", 300.0f));
		list.add(new Book("�����ӱ�����", 88.9f));
		System.out.println("���ϣ�" + list);
		Collections.sort(list);
		System.out.println(list);
		System.out.println("��ȡ����Ϊ 1 ��Ԫ�أ�" + list.get(1));
		System.out.println("�޸�����Ϊ 1 ��Ԫ�أ�" + list.set(1, new Book("��ʫ����", 110.0f)));
		System.out.println("ɾ������Ϊ 1 ��Ԫ�أ�" + list.remove(1));
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
