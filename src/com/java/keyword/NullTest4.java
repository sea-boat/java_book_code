package com.java.keyword;

public class NullTest4 {
	int a;
	int[] b;

	void test() {
		System.out.println("test");
	}

	public static void main(String[] args) {
		NullTest4 nt = null;
		nt.test();// NullPointerException�쳣
		System.out.println(nt.a);// NullPointerException�쳣
		nt = new NullTest4();
		int value = nt.b[0];// NullPointerException�쳣
		int length = nt.b.length;// NullPointerException�쳣
	}
}
