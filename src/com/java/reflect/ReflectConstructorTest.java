package com.java.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class ReflectConstructorTest {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		Class c = Book.class;
		Constructor constructor = c.getDeclaredConstructor();
		Constructor constructor2 = c.getDeclaredConstructor(String.class, double.class);
		System.out.println("���췽������" + constructor.getName());
		System.out.println("���췽������������" + constructor.getParameterCount());
		System.out.println("���췽���������ͣ�" + Arrays.toString(constructor.getParameterTypes()));
		System.out.println("���췽�����η���" + Modifier.toString(constructor.getModifiers()));
		System.out.println("===================");
		System.out.println("���췽������" + constructor2.getName());
		System.out.println("���췽������������" + constructor2.getParameterCount());
		System.out.println("���췽���������ͣ�" + Arrays.toString(constructor2.getParameterTypes()));
		System.out.println("���췽�����η���" + Modifier.toString(constructor2.getModifiers()));
		System.out.println("===================");
	}
}

class Book {
	public String name;
	public double price;

	public Book() {
	}

	public Book(String name, double price) {
		this.name = name;
		this.price = price;
	}
}