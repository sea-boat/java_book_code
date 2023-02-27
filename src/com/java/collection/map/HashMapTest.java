package com.java.collection.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {
		Map<String, String> map1 = new HashMap<String, String>();
		Map<String, String> map2 = new HashMap<String, String>(100);
		map2.put("姓名", "小明");
		map2.put("性别", "男");
		Map<String, String> map3 = new HashMap<String, String>(map2);
		System.out.println(map3);
	}

}
