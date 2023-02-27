package com.java.annotation;

import java.util.ArrayList;
import java.util.List;

public class AnnotationSuppressWarningsTest3 {

	@SuppressWarnings("all")
	public static List createList(String s) {
		List list = new ArrayList();
		list.add(s);
		return list;
	}
}
