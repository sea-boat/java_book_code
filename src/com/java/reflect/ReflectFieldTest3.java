package com.java.reflect;

import java.lang.reflect.Field;

public class ReflectFieldTest3 {
	public static void main(String[] args) {
		Worker worker = new Worker(23, "小明");
		Worker worker2 = new Worker(24, "小东");
		Class c = worker.getClass();
		try {
			Field nameField = c.getDeclaredField("name");
			Field ageField = c.getDeclaredField("age");
			nameField.set(worker, "小明明");
			ageField.set(worker, 25);
			nameField.set(worker2, "小东东");
			ageField.set(worker2, 25);
			System.out.println("worker的name属性值：" + nameField.get(worker));
			System.out.println("worker的age属性值：" + ageField.get(worker));
			System.out.println("worker2的name属性值：" + nameField.get(worker2));
			System.out.println("worker2的age属性值：" + ageField.get(worker2));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
