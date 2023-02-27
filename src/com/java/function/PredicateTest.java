package com.java.function;

import java.util.function.Predicate;

public class PredicateTest {
	public static void main(String[] args) {
		Predicate<String> predicate = (s) -> {
			if (s.equals("test"))
				return true;
			else
				return false;
		};
		Predicate<Integer> predicate2 = (i) -> i > 10;
		System.out.println(predicate.test("test"));
		System.out.println(predicate.test("aaaa"));
		System.out.println(predicate2.test(20));
		System.out.println(predicate2.test(2));
	}
}
