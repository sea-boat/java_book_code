package com.java.annotation;

public class Student {

	@NotNull(message = "���ֲ���Ϊ��")
	private String name;

	@NotNull(message = "���䲻��Ϊ��")
	private Integer age;

	public Student(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

}
