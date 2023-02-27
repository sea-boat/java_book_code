package com.java.interf;

public class BlackRectangle implements Shape, Color {

	public String getColor() {
		return "black";
	}

	public float calcArea(float h, float w) {
		return h * w;
	}

}
