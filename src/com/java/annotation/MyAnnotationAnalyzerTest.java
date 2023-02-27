package com.java.annotation;

public class MyAnnotationAnalyzerTest {

	public static void main(String[] args) throws Exception {
		System.out.println(CCC.class.isAnnotationPresent(MyAn.class));
		System.out.println(CCC.class.getField("num").isAnnotationPresent(MyAn.class));
		System.out.println(CCC.class.getConstructor().isAnnotationPresent(MyAn.class));
		System.out.println(CCC.class.getDeclaredMethod("test").isAnnotationPresent(MyAn.class));
	}

}

@MyAn(name = "ccc")
class CCC {
	public int num;

	public CCC() {
	}

	@MyAn(name = "ccctest")
	public void test() {
	}
}
