package com.java.abstraction;

public class AbstractTest2 {
	public static void main(String[] args) {
		Shape s1 = new Triangle();
		System.out.println(s1.calcArea(10, 10));
		s1 = new Rectangle();
		System.out.println(s1.calcArea(10, 10));
	}
}

abstract class Shape {
	abstract float calcArea(float h, float w); 
}

class Triangle extends Shape {
	float calcArea(float h, float w) {
		return h * w / 2;
	}
}

class Rectangle extends Shape {
	float calcArea(float h, float w) {
		return h * w;
	}
}
