package com.java.function;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MethodRefTest {

	public static void main(String[] args) {
		//�����ʵ����������
		Random random = new Random();
		Supplier<Integer> supplier = random::nextInt;
		System.out.println("��ȡ�������" + supplier.get());
		String s = "���";
		Predicate<String> predicate = s::equals;
		System.out.println("�Ƿ���ȣ�" + predicate.test("���"));
		Consumer<String> consumer = System.out::println;
		consumer.accept("hello world");

		//��ľ�̬��������
		Function<Integer, String> function = String::valueOf;
		System.out.println("intתΪ�ַ�������" + function.apply(5));

		//���ʵ����������
		Function<String, Integer> function2 = String::length;
		System.out.println("�����ַ������ȣ�" + function2.apply("hello"));

		//��Ĺ��췽������
		Function<String, String> function3 = String::new;
		System.out.println("�����ַ�����" + function3.apply("hello hello"));
	}

}
