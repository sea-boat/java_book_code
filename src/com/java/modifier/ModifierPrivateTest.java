package com.java.modifier;

public class ModifierPrivateTest {
	public static void main(String[] args) {
		Box2 box = new Box2();
//		System.out.println(box.name);
//		box.open();
	}
}

class Box2 {
	private String name;

	private void open() {
		System.out.println("open box");
	}
}