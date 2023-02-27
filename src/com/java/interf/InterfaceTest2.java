package com.java.interf;


public class InterfaceTest2 implements RectangleShape {
	public float calcArea(float h, float w) {
		return h * w;
	}

	public int getSideNum() {
		return 4;
	}
}
