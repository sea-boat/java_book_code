package com.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsTest {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(20);
		list.add(10);
		list.add(50);
		list.add(30);
		list.add(5);
		System.out.println("排序前：" + list);
		Collections.sort(list);
		System.out.println("正向排序后：" + list);
		Collections.reverse(list);
		System.out.println("逆向排序后：" + list);
		Collections.shuffle(list);
		System.out.println("随机排序：" + list);
		Collections.sort(list, new MyComparator());
		System.out.println("自定义比较器排序：" + list);
	}
}

class MyComparator implements Comparator<Integer> {
	public int compare(Integer s1, Integer s2) {
		if (s1 > s2)
			return 1;
		else if (s1 < s2)
			return -1;
		else
			return 0;
	}
}
