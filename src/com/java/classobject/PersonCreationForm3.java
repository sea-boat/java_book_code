package com.java.classobject;
public class PersonCreationForm3 {

	public static void main(String[] args) {
		Person person = new Person("ะกร๗", 6);
		Person clone_person = (Person) person.clone();
		person.introduceMyself();
		clone_person.introduceMyself();
	}
}
