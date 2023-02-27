package com.java.interf;

public class InterfaceTest3 {
	public static void main(String[] args) {
		Shape s1 = new Triangle();
		s1.print();
		s1 = new Rectangle();
		s1.print();
	}
}
