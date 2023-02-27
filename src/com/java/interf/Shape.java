package com.java.interf;

public interface Shape {
	public float calcArea(float h, float w); 
	
	public default void print() {
		System.out.println("this is a default method");
	}
}
