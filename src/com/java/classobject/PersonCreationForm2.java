package com.java.classobject;
public class PersonCreationForm2 {

	public static void main(String[] args) {
		Class c = Person.class;
		try {
			Person person = (Person) c.getDeclaredConstructor().newInstance();
			Person person2 = (Person) c.getDeclaredConstructor(String.class, int.class)
					.newInstance("ะกร๗", 6);
			person.introduceMyself();
			person2.introduceMyself();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
