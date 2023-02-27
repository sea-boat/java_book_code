package com.java.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializationTest2 {
	public static void main(String[] args) throws IOException {
		FileInputStream ins = null;
		ObjectInputStream ois = null;
		try {
			ins = new FileInputStream("D:/tmp.o");
			ois = new ObjectInputStream(ins);
			String str = (String) ois.readObject();
			A a = (A) ois.readObject();
			System.out.println(str);
			System.out.println(a.name + " " + a.age);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ins.close();
			ois.close();
		}
	}
}
