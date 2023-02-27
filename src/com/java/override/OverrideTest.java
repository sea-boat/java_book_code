package com.java.override;

public class OverrideTest {
	public static void main(String[] args) {
		Circle c = new Circle(4);
		Triangle t = new Triangle(3, 4);
		Square s = new Square(3, 4);
		System.out.println(c.calcArea());
		System.out.println(t.calcArea());
		System.out.println(s.calcArea());
	}
}

class Shape {

	float calcArea() {
		return 0f;
	}

}

class Circle extends Shape {
	float radius;

	Circle(float radius) {
		this.radius = radius;
	}

	@Override
	float calcArea() {
		return (float) (3.14 * Math.pow(radius, 2));
	}
}

class Triangle extends Shape {
	float h;
	float w;

	Triangle(float h, float w) {
		this.h = h;
		this.w = w;
	}

	float calcArea() {
		return h * w / 2;
	}
}

class Square extends Shape {
	float h;
	float w;

	Square(float h, float w) {
		this.h = h;
		this.w = w;
	}

	float calcArea() {
		return h * w;
	}
}