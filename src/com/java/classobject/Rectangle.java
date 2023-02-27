package com.java.classobject;

class Rectangle {
	int length;
	int width;

	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	int calcArea() {
		return length * width;
	}

	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle(2, 3);
		Rectangle rect2 = new Rectangle(5, 4);
		System.out.println(rect1.calcArea());
		System.out.println(rect2.calcArea());
	}
}
