package com.java.annotation;

@MyAnnotation(messages = { "����Ϣ1", "����Ϣ2" }, value = 0)
public class MyAnnotationTest {

	@MyAnnotation(messages = { "������Ϣ" }, value = 10, name = "test����")
	public void test() {
	}

	@MyAnnotation(messages = { "������Ϣ2" }, value = 20, name = "test2����")
	public void test2() {
	}

}
