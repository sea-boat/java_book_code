package com.java.collection.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest3 {

	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(10004, "С��");
		map.put(10002, "С��");
		map.put(10000, "С��");
		map.put(10001, "С��");
		map.put(10003, "С��");
		for (Map.Entry<Integer, String> m : map.descendingMap().entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}

}
