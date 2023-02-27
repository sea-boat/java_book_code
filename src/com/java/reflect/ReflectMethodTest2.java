package com.java.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflectMethodTest2 {
	public static void main(String[] args) {
		try {
			Constructor constructor = Human.class.getDeclaredConstructor(String.class, int.class);
			Object o = constructor.newInstance("小明", 20);
			//调用 private 非静态方法
			Method m1 = Human.class.getDeclaredMethod("eat", String.class, int.class);
			m1.setAccessible(true);
			m1.invoke(o, "苹果", 3);
			//调用 public 非静态方法
			Method m2 = Human.class.getDeclaredMethod("introduceMyself");
			m2.invoke(o);
			//调用静态方法
			Method m3 = Human.class.getDeclaredMethod("sleep", int.class);
			m3.invoke(null, 8);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
