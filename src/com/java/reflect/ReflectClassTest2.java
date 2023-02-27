package com.java.reflect;

import java.lang.reflect.Modifier;
import java.util.Arrays;

public class ReflectClassTest2 {
	public static void main(String[] args) {
		Integer s = 0;
		Integer i = 10;
		Class c = s.getClass();
		System.out.println("类全名：" + c.getName());
		System.out.println("包名：" + c.getPackageName());
		System.out.println("实例判断：" + c.isInstance(i));
		System.out.println("同类或父类判断：" + c.isAssignableFrom(i.getClass()));
		System.out.println("是否为接口：" + c.isInterface());
		System.out.println("是否为数组类型：" + c.isArray());
		System.out.println("是否为枚举类型：" + c.isEnum());
		System.out.println("父类：" + c.getSuperclass().getName());
		System.out.println("修饰符：" + Modifier.toString(c.getModifiers()));
		System.out.println("所有接口：" + Arrays.toString(c.getInterfaces()));
		System.out.println("所有public属性：" + Arrays.toString(c.getFields()));
		System.out.println("所有public构造方法：" + Arrays.toString(c.getConstructors()));
	}
}
