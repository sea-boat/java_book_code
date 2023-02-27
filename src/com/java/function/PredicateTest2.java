package com.java.function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest2 {
	public static void main(String[] args) {
		Integer[] nums = new Integer[] { 4, 6, 2, 8, 1, 6, 3, 2 };
		List<Integer> list = Arrays.asList(nums);
		List<Integer> result = filter(list, (n) -> n > 4);
		System.out.println(Arrays.toString(result.toArray()));
	}

	public static <E> List<E> filter(List<E> elements, Predicate<E> pred) {
		List<E> list = new ArrayList<>();
		for (E e : elements) {
			if (pred.test(e)) {
				list.add(e);
			}
		}
		return list;
	}
}
