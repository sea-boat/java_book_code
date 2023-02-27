package com.java.reflect;

import java.lang.reflect.Constructor;

public class ReflectConstructorTest2 {
	public static void main(String[] args) {
		Class c = Book.class;
		Constructor constructor;
		try {
			constructor = c.getDeclaredConstructor(String.class, double.class);
			Book book = (Book) constructor.newInstance("¡¶Ë®ä°´«¡·", 88.0);
			System.out.println(book.name + " = " + book.price);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
