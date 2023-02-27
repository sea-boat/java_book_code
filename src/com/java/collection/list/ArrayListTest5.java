package com.java.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest5 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("中国");
		list.add("美国");
		list.add("德国");
		list.add("英国");
		System.out.println(list);
		list.remove(2);
		System.out.println(list);
	}

}
