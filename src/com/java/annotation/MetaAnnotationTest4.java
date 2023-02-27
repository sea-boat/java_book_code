package com.java.annotation;

public class MetaAnnotationTest4 {

	public static void main(String[] args) {
		System.out.println(A.class.getAnnotation(MyInherited.class));
		System.out.println(B.class.getAnnotation(MyInherited.class));
		System.out.println(C.class.getAnnotation(MyInherited.class));
	}

}

@MyInherited(name = "hello")
class A {
}

class B extends A {
}

class C extends B {
}