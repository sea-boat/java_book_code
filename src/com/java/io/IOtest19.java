package com.java.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class IOtest19 {
	public static void main(String[] args) throws IOException {
		FileInputStream ins = null;
		ObjectInputStream ois = null;
		try {
			ins = new FileInputStream("D:/student.o");
			ois = new ObjectInputStream(ins);
			Student student = (Student) ois.readObject();
			System.out.println(student.id + " " + student.name);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ins.close();
			ois.close();
		}
	}
}
