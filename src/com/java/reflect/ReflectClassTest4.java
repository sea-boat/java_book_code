package com.java.reflect;

public class ReflectClassTest4 {
	public static void main(String[] args) {
		Class c1 = int.class;
		Class c2 = double.class;
		Class c3 = char.class;
		Class c4 = boolean.class;
		System.out.println("int������" + c1.getName());
		System.out.println("int������" + c1.getPackageName());
		System.out.println("double������" + c2.getName());
		System.out.println("double������" + c2.getPackageName());
		System.out.println("char������" + c3.getName());
		System.out.println("char������" + c3.getPackageName());
		System.out.println("boolean������" + c4.getName());
		System.out.println("boolean������" + c4.getPackageName());
	}
}
