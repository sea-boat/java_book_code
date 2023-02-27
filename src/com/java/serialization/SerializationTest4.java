package com.java.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationTest4 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		FileInputStream ins = null;
		ObjectInputStream ois = null;
		try {
			fos = new FileOutputStream("D:/student.o");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(new Student(1, "ะกร๗"));
			oos.flush();
			ins = new FileInputStream("D:/student.o");
			ois = new ObjectInputStream(ins);
			Student student = (Student) ois.readObject();
			System.out.println(student.id + " " + student.name);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			oos.close();
			fos.close();
		}
	}
}

class Student implements Serializable {
	int id;
	String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
}