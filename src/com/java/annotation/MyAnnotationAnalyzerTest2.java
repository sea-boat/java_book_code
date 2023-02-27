package com.java.annotation;

public class MyAnnotationAnalyzerTest2 {

	public static void main(String[] args) {
		Student s = new Student(null, 20);
		Util.validate(s);
		Student s2 = new Student("小明", null);
		Util.validate(s2);
		Student s3 = new Student("小明", 20);
		Util.validate(s3);
	}

}
