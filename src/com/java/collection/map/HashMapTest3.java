package com.java.collection.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest3 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("����", "С��");
		map.put("����", "20");
		map.put("���", "175");
		map.put("�Ա�", "��");
		System.out.println(map);
		map.put("����", "С��");
		System.out.println(map);
	}

}
