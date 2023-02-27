package com.java.annotation;

import java.util.List;

public class AnnotationSuppressWarningsTest4 {
	@SuppressWarnings("null")
	public static void select(String s) {
		List<String> list = null;
		if (list == null)
			System.out.println("error");
		list.add(s);
	}
}
