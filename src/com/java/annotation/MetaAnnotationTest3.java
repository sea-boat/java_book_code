package com.java.annotation;

@MyRetention(name = "hello")
public class MetaAnnotationTest3 {

	public static void main(String[] args) {
		MyRetention mr = MetaAnnotationTest3.class.getAnnotation(MyRetention.class);
		System.out.println("MyRetention注解的name属性值：" + mr.name());
	}

}
