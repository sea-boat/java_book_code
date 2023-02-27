package com.java.reflect;

public class ReflectConstructorTest3 {
	public static void main(String[] args) {
		Class c = Book.class;
		try {
			Book book = (Book) c.newInstance();
			book.name = "¡¶Ë®ä°´«¡·";
			book.price = 88.0;
			System.out.println(book.name + " = " + book.price);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

