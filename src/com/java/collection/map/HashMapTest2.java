package com.java.collection.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest2 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("����", "С��");
		map.put("����", "20");
		map.put("���", "175");
		map.put("�Ա�", "��");
		System.out.println(map);
		System.out.println("��ȡ key=������ֵ��" + map.get("����"));
		System.out.println("�Ƿ�������� key��" + map.containsKey("����"));
		System.out.println("�Ƿ����С�� value��" + map.containsValue("С��"));
		map.remove("����");
		map.remove("���");
		System.out.println(map);
	}

}
