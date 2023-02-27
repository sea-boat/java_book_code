package com.java.classobject;

class Human {

	String name;
	int age;

	Human() {
		System.out.println("Human() ������");
	}

	Human(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("Human(String name,int age) ������");
	}

	void eat() {
		System.out.println("�Զ���");
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
		System.out.println("Լ��");
		super.eat();
	}

	public static void main(String[] args) {
		Man man = new Man();
		Man xiaoming = new Man("С��", 18, true);
		xiaoming.introduceMyself();
		xiaoming.date();
	}
}
