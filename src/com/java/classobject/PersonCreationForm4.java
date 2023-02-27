package com.java.classobject;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class PersonCreationForm4 {

	public static void main(String[] args) {
		Person person = new Person("ะกร๗", 6);
		ObjectOutputStream objOut;
		try {
			objOut = new ObjectOutputStream(new FileOutputStream("person.obj"));
			objOut.writeObject(person);
			ObjectInputStream objIn = new ObjectInputStream(new FileInputStream("person.obj"));
			Person person2 = (Person) objIn.readObject();
			person2.introduceMyself();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
