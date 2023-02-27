package com.java.reflect;

public class ReflectClassTest4 {
	public static void main(String[] args) {
		Class c1 = int.class;
		Class c2 = double.class;
		Class c3 = char.class;
		Class c4 = boolean.class;
		System.out.println("int类名：" + c1.getName());
		System.out.println("int包名：" + c1.getPackageName());
		System.out.println("double类名：" + c2.getName());
		System.out.println("double包名：" + c2.getPackageName());
		System.out.println("char类名：" + c3.getName());
		System.out.println("char包名：" + c3.getPackageName());
		System.out.println("boolean类名：" + c4.getName());
		System.out.println("boolean包名：" + c4.getPackageName());
	}
}
