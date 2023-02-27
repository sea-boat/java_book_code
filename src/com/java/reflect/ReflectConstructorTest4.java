package com.java.reflect;

import java.lang.reflect.Constructor;

public class ReflectConstructorTest4 {
	public static void main(String[] args) {
		Class c = Person.class;
		Constructor constructor;
		try {
			constructor = c.getDeclaredConstructor(String.class);
			constructor.setAccessible(true);
			Person person = (Person) constructor.newInstance("ะกร๗");
			System.out.println(person.getNmae());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class Person {
	private String name;

	private Person(String name) {
		this.name = name;
	}
	
	public String getNmae() {
		return name;
	}
}
