package com.java.reflect;

import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectMethodTest3 {
	public static void main(String[] args) {
		try {
			String[] str = { "one", "two", "three" };
			Object[] o = new Object[1];
			o[0] = str;
			Method m = AAA.class.getDeclaredMethod("test", String[].class);
			m.invoke(null, o);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class AAA {
	public static void test(String[] str) {
		System.out.println(Arrays.toString(str));
	}
}
