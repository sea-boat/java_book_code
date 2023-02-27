package com.java.collection.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTest {

	public static void main(String[] args) {
		Map<String, String> map = new LinkedHashMap<String, String>();
		map.put("����", "С��");
		map.put("�Ա�", "��");
		map.put("����", "20");
		map.put("���", "175");
		for (Map.Entry<String, String> m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}

}
