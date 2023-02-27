package com.java.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflectMethodTest2 {
	public static void main(String[] args) {
		try {
			Constructor constructor = Human.class.getDeclaredConstructor(String.class, int.class);
			Object o = constructor.newInstance("С��", 20);
			//���� private �Ǿ�̬����
			Method m1 = Human.class.getDeclaredMethod("eat", String.class, int.class);
			m1.setAccessible(true);
			m1.invoke(o, "ƻ��", 3);
			//���� public �Ǿ�̬����
			Method m2 = Human.class.getDeclaredMethod("introduceMyself");
			m2.invoke(o);
			//���þ�̬����
			Method m3 = Human.class.getDeclaredMethod("sleep", int.class);
			m3.invoke(null, 8);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
