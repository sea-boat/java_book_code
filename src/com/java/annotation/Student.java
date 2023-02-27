package com.java.annotation;

public class Student {

	@NotNull(message = "名字不能为空")
	private String name;

	@NotNull(message = "年龄不能为空")
	private Integer age;

	public Student(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

}
