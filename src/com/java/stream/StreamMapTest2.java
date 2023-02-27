package com.java.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamMapTest2 {
	public static void main(String[] args) {
		List<String> list = new ArrayList();
		list.add("red");
		list.add("black");
		list.add("white");
		list.add("yellow");
		for (int i = 0; i < list.size(); i++) {
			String us = list.get(i).toUpperCase();
			list.set(i, us);
		}
		System.out.println(Arrays.toString(list.toArray()));
	}
}
