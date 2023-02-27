package com.java.reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class ReflectMethodTest {
	public static void main(String[] args) {
		Class c = Human.class;
		Method[] methods = c.getDeclaredMethods();
		for (Method m : methods) {
			System.out.println("方法名：" + m.getName());
			System.out.println("方法参数个数：" + m.getParameterCount());
			System.out.println("方法参数类型：" + Arrays.toString(m.getParameterTypes()));
			System.out.println("方法返回类型：" + m.getReturnType());
			System.out.println("方法修饰符：" + Modifier.toString(m.getModifiers()));
			System.out.println("===================================");
		}
	}
}

class Human {

	String name;
	int age;

	Human(String name, int age) {
		this.name = name;
		this.age = age;
	}

	private boolean eat(String food, int num) {
		System.out.println("吃了" + num + "个" + food);
		return true;
	}

	static String sleep(int hour) {
		System.out.println("睡眠" + hour + "个小时");
		return "sleep";
	}

	public void introduceMyself() {
		System.out.println("my name is " + name + ", " + age + " years old.");
	}
}
