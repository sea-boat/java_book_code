package com.java.override;

public class OverrideTest4 {
	public static void main(String[] args) {
		AA aa = new BB();
		aa.test();
	}
}

class AA {
	public void test() {
		System.out.println("AA");
	}
}

class BB extends AA {
	public void test() {
		super.test();
		System.out.println("BB");
	}
}
