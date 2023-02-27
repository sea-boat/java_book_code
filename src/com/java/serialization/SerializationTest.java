package com.java.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationTest {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			A a = new A();
			a.name = "seaboat";
			a.age = 20;
			fos = new FileOutputStream("D:/tmp.o");
			oos = new ObjectOutputStream(fos);
			oos.writeObject("test");
			oos.writeObject(a);
			oos.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			oos.close();
			fos.close();
		}
	}
}

class A implements Serializable {
	String name;
	int age;
}