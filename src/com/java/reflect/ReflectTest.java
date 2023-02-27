package com.java.reflect;

import java.lang.reflect.Method;
import java.util.Scanner;

public class ReflectTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String className = scanner.nextLine();
		String methodName = scanner.nextLine();
		try {
			Class c = Class.forName(className);
			Method m = c.getDeclaredMethod(methodName);
			Object o = c.newInstance();
			m.invoke(o);
		} catch (Exception e) {
			System.out.println("·´Éä²Ù×÷´íÎó");
		}
	}
}

class Teacher {
	public void hello() {
		System.out.println("hello");
	}
}
