package com.java.reflect;

import java.lang.reflect.Field;

public class ReflectFieldTest2 {
	public static void main(String[] args) {
		Worker worker = new Worker(23, "小明");
		Worker worker2 = new Worker(24, "小东");
		Class c = worker.getClass();
		try {
			Field nameField = c.getDeclaredField("name");
			Field ageField = c.getDeclaredField("age");
			System.out.println("worker的name属性值：" + nameField.get(worker));
			System.out.println("worker的age属性值：" + ageField.get(worker));
			System.out.println("worker2的name属性值：" + nameField.get(worker2));
			System.out.println("worker2的age属性值：" + ageField.get(worker2));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
