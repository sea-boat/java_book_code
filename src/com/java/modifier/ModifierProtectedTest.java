package com.java.modifier;

import com.seaboat.Ball;

public class ModifierProtectedTest extends Ball {
	public static void main(String[] args) {
		ModifierProtectedTest ball = new ModifierProtectedTest();
		System.out.println(ball.name);
		ball.play();
	}
}
