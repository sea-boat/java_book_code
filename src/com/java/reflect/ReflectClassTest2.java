package com.java.reflect;

import java.lang.reflect.Modifier;
import java.util.Arrays;

public class ReflectClassTest2 {
	public static void main(String[] args) {
		Integer s = 0;
		Integer i = 10;
		Class c = s.getClass();
		System.out.println("��ȫ����" + c.getName());
		System.out.println("������" + c.getPackageName());
		System.out.println("ʵ���жϣ�" + c.isInstance(i));
		System.out.println("ͬ������жϣ�" + c.isAssignableFrom(i.getClass()));
		System.out.println("�Ƿ�Ϊ�ӿڣ�" + c.isInterface());
		System.out.println("�Ƿ�Ϊ�������ͣ�" + c.isArray());
		System.out.println("�Ƿ�Ϊö�����ͣ�" + c.isEnum());
		System.out.println("���ࣺ" + c.getSuperclass().getName());
		System.out.println("���η���" + Modifier.toString(c.getModifiers()));
		System.out.println("���нӿڣ�" + Arrays.toString(c.getInterfaces()));
		System.out.println("����public���ԣ�" + Arrays.toString(c.getFields()));
		System.out.println("����public���췽����" + Arrays.toString(c.getConstructors()));
	}
}
