package com.java.collection.list;

import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		Vector<String> vector = new Vector<String>();
		vector.add("中国");
		vector.add("美国");
		vector.addElement("德国");
		vector.addElement("英国");
		System.out.println("集合：" + vector);
		System.out.println("获取索引为 1 的元素：" + vector.get(1));
		System.out.println("获取索引为 1 的元素：" + vector.elementAt(1));
		System.out.println("修改索引为 1 的元素：" + vector.set(1, "日本"));
		vector.setElementAt("日本", 1);
		System.out.println("删除索引为 1 的元素：" + vector.remove(1));
		vector.removeElementAt(1);
		System.out.println(vector);
	}

}
