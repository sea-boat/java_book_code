package com.java.random;

import java.util.Random;

public class RandomTest2 {
	public static void main(String[] args) {
		Random r = new Random();
		for(int i=0;i<8;i++) {
			System.out.print(r.nextInt(10));
		}
	}
}
