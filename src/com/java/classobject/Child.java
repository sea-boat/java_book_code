package com.java.classobject;

public class Child {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age <= 0) {
			System.out.println("�������Ϊ����");
			return;
		}
		this.age = age;
	}

}
