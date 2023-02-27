package com.java.collection.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		list.add("中国");
		list.add("美国");
		list.add("德国");
		list.add("英国");
		System.out.println("集合：" + list);
		System.out.println("获取索引为 1 的元素：" + list.get(1));
		System.out.println("修改索引为 1 的元素：" + list.set(1, "日本"));
		System.out.println("删除索引为 1 的元素：" + list.remove(1));
		System.out.println(list);
	}

}
