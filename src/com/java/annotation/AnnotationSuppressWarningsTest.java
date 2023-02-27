package com.java.annotation;

import java.util.ArrayList;
import java.util.List;

public class AnnotationSuppressWarningsTest {

	@SuppressWarnings("rawtypes")
	public static List createList() {
		List list = new ArrayList();
		return list;
	}
}
