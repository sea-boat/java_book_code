package com.java.keyword;

public class InstanceofTest5 {
	public static void main(String[] args) {
		Bike b = new Bike();
		System.out.println(b instanceof Vehicle);
	}
}

interface Vehicle {
}

class Bike implements Vehicle {
}
