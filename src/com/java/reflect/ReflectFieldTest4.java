package com.java.reflect;

import java.lang.reflect.Field;

public class ReflectFieldTest4 {
	public static void main(String[] args) {
		Student student = new Student("С��");
		Class c = student.getClass();
		try {
			Field nameField = c.getDeclaredField("name");
			nameField.setAccessible(true);
			System.out.println("student��name����ֵ��" + nameField.get(student));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class Student {
	private String name;

	public Student(String name) {
		this.name = name;
	}
}