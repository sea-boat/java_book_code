package com.java.collection.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		list.add("�й�");
		list.add("����");
		list.add("�¹�");
		list.add("Ӣ��");
		System.out.println("���ϣ�" + list);
		System.out.println("��ȡ����Ϊ 1 ��Ԫ�أ�" + list.get(1));
		System.out.println("�޸�����Ϊ 1 ��Ԫ�أ�" + list.set(1, "�ձ�"));
		System.out.println("ɾ������Ϊ 1 ��Ԫ�أ�" + list.remove(1));
		System.out.println(list);
	}

}
