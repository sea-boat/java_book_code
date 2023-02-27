package com.java.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest7 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
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
