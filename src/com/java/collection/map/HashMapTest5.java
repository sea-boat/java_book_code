package com.java.collection.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest5 {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(10000, "С��");
		map.put(10001, "С��");
		map.put(10002, "С��");
		map.put(10003, "С��");
		System.out.println(map);
	}

}
