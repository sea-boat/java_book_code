package com.java.collection.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest2 {

	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		list.add("�й�");
		list.add("����");
		list.add("�¹�");
		//��һ�ֱ�����ʽ
		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));
		//�ڶ��ֱ�����ʽ
		for (String s : list)
			System.out.println(s);
		//�����ֱ�����ʽ
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
