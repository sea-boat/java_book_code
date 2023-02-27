package com.java.collection.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest5 {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(10000, "小明");
		map.put(10001, "小红");
		map.put(10002, "小东");
		map.put(10003, "小莉");
		System.out.println(map);
	}

}
