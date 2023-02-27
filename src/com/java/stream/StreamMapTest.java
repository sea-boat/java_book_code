package com.java.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class StreamMapTest {
	public static void main(String[] args) {
		List<String> list = new ArrayList();
		list.add("red");
		list.add("black");
		list.add("white");
		list.add("yellow");
		Function<String, String> f = (s) -> s.toUpperCase();
		Stream<String> stream = list.stream().map(f);
		System.out.println(Arrays.toString(stream.toArray()));
	}
}
