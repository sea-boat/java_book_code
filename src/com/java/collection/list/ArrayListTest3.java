package com.java.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest3 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("�й�");
		list.add("����");
		list.add("�¹�");
		list.add("Ӣ��");
		list.add("�ձ�");
		System.out.println(list.get(0));
		System.out.println(list.get(3));
	}

}
