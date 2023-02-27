package com.java.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class ReflectFieldTest {
	public static void main(String[] args) {
		Worker worker = new Worker(23, "小明");
		Class c = worker.getClass();
		Field[] fields = c.getDeclaredFields();
		for (Field field : fields) {
			System.out.println("类属性：" + field.getName());
			System.out.println("属性类型：" + field.getType().getName());
			System.out.println("属性修饰符：" + Modifier.toString(field.getModifiers()));
			System.out.println("===================");
		}
	}
}

class Worker {
	public int age;
	public String name;

	public Worker(int age, String name) {
		this.age = age;
		this.name = name;
	}
}