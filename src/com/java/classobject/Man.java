package com.java.classobject;

class Human {

	String name;
	int age;

	Human() {
		System.out.println("Human() 被调用");
	}

	Human(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("Human(String name,int age) 被调用");
	}

	void eat() {
		System.out.println("吃东西");
	}
}

class Man extends Human {
	boolean hasGirlfriend;

	Man() {
		super();
	}

	Man(String name, int age, boolean hasGirlfriend) {
		super(name, age);
		this.hasGirlfriend = hasGirlfriend;
	}

	void introduceMyself() {
		System.out.println("my name is " + super.name + ", " + super.age + " years old.");
	}

	void date() {
		System.out.println("约会");
		super.eat();
	}

	public static void main(String[] args) {
		Man man = new Man();
		Man xiaoming = new Man("小明", 18, true);
		xiaoming.introduceMyself();
		xiaoming.date();
	}
}
