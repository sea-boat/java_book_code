package com.java.collection.list;

import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		Vector<String> vector = new Vector<String>();
		vector.add("�й�");
		vector.add("����");
		vector.addElement("�¹�");
		vector.addElement("Ӣ��");
		System.out.println("���ϣ�" + vector);
		System.out.println("��ȡ����Ϊ 1 ��Ԫ�أ�" + vector.get(1));
		System.out.println("��ȡ����Ϊ 1 ��Ԫ�أ�" + vector.elementAt(1));
		System.out.println("�޸�����Ϊ 1 ��Ԫ�أ�" + vector.set(1, "�ձ�"));
		vector.setElementAt("�ձ�", 1);
		System.out.println("ɾ������Ϊ 1 ��Ԫ�أ�" + vector.remove(1));
		vector.removeElementAt(1);
		System.out.println(vector);
	}

}
