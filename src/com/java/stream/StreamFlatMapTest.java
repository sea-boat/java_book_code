package com.java.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class StreamFlatMapTest {
	public static void main(String[] args) {
		List<String[]> list = new ArrayList();
		list.add(new String[] { "A", "B", "C" });
		list.add(new String[] { "D" });
		list.add(new String[] { "E", "F", "G", "H" });
		Function<String[], Stream<String>> f = (s) -> Arrays.asList(s).stream();
		Stream<String> stream = list.stream().flatMap(f);
		System.out.println(Arrays.toString(stream.toArray()));
	}
}
