package com.java.collection.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {
		Map<String, String> map1 = new HashMap<String, String>();
		Map<String, String> map2 = new HashMap<String, String>(100);
		map2.put("����", "С��");
		map2.put("�Ա�", "��");
		Map<String, String> map3 = new HashMap<String, String>(map2);
		System.out.println(map3);
	}

}
