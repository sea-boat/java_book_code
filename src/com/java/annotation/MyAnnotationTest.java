package com.java.annotation;

@MyAnnotation(messages = { "类信息1", "类信息2" }, value = 0)
public class MyAnnotationTest {

	@MyAnnotation(messages = { "方法消息" }, value = 10, name = "test方法")
	public void test() {
	}

	@MyAnnotation(messages = { "方法消息2" }, value = 20, name = "test2方法")
	public void test2() {
	}

}
