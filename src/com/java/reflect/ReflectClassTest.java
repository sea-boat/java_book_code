package com.java.reflect;

public class ReflectClassTest {
	public static void main(String[] args) throws ClassNotFoundException {
		//第一种，通过“类.class”的方式获取
		Class c1 = String.class;

		//第二种，通过“对象.getClass()”的方式获取
		String s = "test";
		Class c2 = s.getClass();

		//第三种，通过“Class.forName()”的方式获取
		Class c3 = Class.forName("java.lang.String");
	}
}
