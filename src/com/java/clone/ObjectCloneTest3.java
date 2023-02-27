package com.java.clone;

public class ObjectCloneTest3 {

	public static void main(String[] args) {
		Person p1 = new Person("ะกร๗", 16);
		Person p1Copy = p1;
	}

}

class Dog implements Cloneable{
	public Object clone() {
		try {
			return super.clone();
		} catch (Exception e) {
			return null;
		}
	}
}