package com.java.collection.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTest2 {

	public static void main(String[] args) {
		Map<String, String> map = new LinkedHashMap<String, String>();
		map.put("姓名", "小明");
		map.put("性别", "男");
		map.put("年龄", "20");
		map.put("身高", "175");
		map.remove("年龄");
		System.out.println(map);
	}

}
