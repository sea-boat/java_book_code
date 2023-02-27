package com.java.override;

public class OverrideTest3 {
	public static void main(String[] args) {
		Shape s = new Circle(4);
		System.out.println(s.calcArea());
		s = new Triangle(3, 4);
		System.out.println(s.calcArea());
		s = new Square(3, 4);
		System.out.println(s.calcArea());
	}
}
