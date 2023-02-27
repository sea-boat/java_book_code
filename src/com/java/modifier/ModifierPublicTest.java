package com.java.modifier;

import com.seaboat.Car;

public class ModifierPublicTest {
	public static void main(String[] args) {
		Car car = new Car();
		System.out.println(car.name);
		car.drive();
	}
}
