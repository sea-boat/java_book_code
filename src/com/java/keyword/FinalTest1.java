package com.java.keyword;

public class FinalTest1 {
	final int a;
	final int b = 20;
	static final int c;
	static final int d = 40;

	static {
		c = 30;
	}

	FinalTest1() {
		this.a = 10;
	}

	public static void main(String[] args) {
		FinalTest1 ft = new FinalTest1();
//		ft.a = 20;
	}
}
