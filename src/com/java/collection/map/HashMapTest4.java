package com.java.collection.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest4 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("����", "С��");
		map.put("����", "20");
		map.put("���", "175");
		map.put("�Ա�", "��");
		for (Map.Entry<String, String> m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}

}
