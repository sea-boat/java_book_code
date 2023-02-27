package com.java.collection.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest3 {

	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(10004, "小明");
		map.put(10002, "小东");
		map.put(10000, "小红");
		map.put(10001, "小莉");
		map.put(10003, "小花");
		for (Map.Entry<Integer, String> m : map.descendingMap().entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}

}
