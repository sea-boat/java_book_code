package com.java.collection.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTest2 {

	public static void main(String[] args) {
		Map<String, String> map = new LinkedHashMap<String, String>();
		map.put("����", "С��");
		map.put("�Ա�", "��");
		map.put("����", "20");
		map.put("���", "175");
		map.remove("����");
		System.out.println(map);
	}

}
