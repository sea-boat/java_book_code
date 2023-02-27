package com.java.collection.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest2 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("姓名", "小明");
		map.put("年龄", "20");
		map.put("身高", "175");
		map.put("性别", "男");
		System.out.println(map);
		System.out.println("获取 key=姓名的值：" + map.get("姓名"));
		System.out.println("是否包含年龄 key：" + map.containsKey("年龄"));
		System.out.println("是否包含小明 value：" + map.containsValue("小明"));
		map.remove("年龄");
		map.remove("身高");
		System.out.println(map);
	}

}
