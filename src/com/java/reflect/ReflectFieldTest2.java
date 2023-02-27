package com.java.reflect;

import java.lang.reflect.Field;

public class ReflectFieldTest2 {
	public static void main(String[] args) {
		Worker worker = new Worker(23, "С��");
		Worker worker2 = new Worker(24, "С��");
		Class c = worker.getClass();
		try {
			Field nameField = c.getDeclaredField("name");
			Field ageField = c.getDeclaredField("age");
			System.out.println("worker��name����ֵ��" + nameField.get(worker));
			System.out.println("worker��age����ֵ��" + ageField.get(worker));
			System.out.println("worker2��name����ֵ��" + nameField.get(worker2));
			System.out.println("worker2��age����ֵ��" + ageField.get(worker2));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
