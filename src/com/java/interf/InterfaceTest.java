package com.java.interf;

public class InterfaceTest {
	public static void main(String[] args) {
		Shape s1 = new Triangle();
		System.out.println(s1.calcArea(10, 10));
		s1 = new Rectangle();
		System.out.println(s1.calcArea(10, 10));
	}
}

class Triangle implements Shape {
	public float calcArea(float h, float w) {
		return h * w / 2;
	}
	
	public void print() {
		System.out.println("triangle method");
	}
}

class Rectangle implements Shape {
	public float calcArea(float h, float w) {
		return h * w;
	}
}
