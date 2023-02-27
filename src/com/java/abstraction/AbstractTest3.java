package com.java.abstraction;

public class AbstractTest3 {

	public static void main(String[] args) {
		Animal a = new Dog(15);
		a.eat();
	}
}

abstract class Animal {
	float weight;

	public Animal(float weight) {
		this.weight = weight;
	}

	float getWeight() {
		return weight;
	}

	abstract void eat();
}

class Dog extends Animal {

	public Dog(float weight) {
		super(weight);
	}

	void eat() {
		System.out.println("³Ô¹ÇÍ·");
	}

}