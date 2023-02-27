package com.java.reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class ReflectMethodTest {
	public static void main(String[] args) {
		Class c = Human.class;
		Method[] methods = c.getDeclaredMethods();
		for (Method m : methods) {
			System.out.println("��������" + m.getName());
			System.out.println("��������������" + m.getParameterCount());
			System.out.println("�����������ͣ�" + Arrays.toString(m.getParameterTypes()));
			System.out.println("�����������ͣ�" + m.getReturnType());
			System.out.println("�������η���" + Modifier.toString(m.getModifiers()));
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
		System.out.println("����" + num + "��" + food);
		return true;
	}

	static String sleep(int hour) {
		System.out.println("˯��" + hour + "��Сʱ");
		return "sleep";
	}

	public void introduceMyself() {
		System.out.println("my name is " + name + ", " + age + " years old.");
	}
}
