package com.java.collection.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest3 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("姓名", "小明");
		map.put("年龄", "20");
		map.put("身高", "175");
		map.put("性别", "男");
		System.out.println(map);
		map.put("姓名", "小东");
		System.out.println(map);
	}

}
