package com.java.inheritance;

public class Woman extends Person {

	boolean isDelivered;

	Woman(String name, int age, boolean isDelivered) {
		super(name, age);
		this.isDelivered = isDelivered;
	}

	public void deliver() {
		System.out.println("…˙–°∫¢");
		this.isDelivered = true;
	}

	public void printAge() {
		System.out.println(super.age);
	}

	public static void main(String[] args) {
		Woman w = new Woman("–°¿Ú", 25, false);
		w.eat();
		w.deliver();
		w.printAge();
		System.out.println(w.name + " " + w.age + " " + w.isDelivered);
	}

}
