package com.java.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest7 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("中国");
		list.add("美国");
		list.add("德国");
		//第一种遍历方式
		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));
		//第二种遍历方式
		for (String s : list)
			System.out.println(s);
		//第三种遍历方式
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
