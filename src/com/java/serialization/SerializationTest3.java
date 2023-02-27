package com.java.serialization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Date;

public class SerializationTest3 implements Externalizable {
	public String value = "test";

	public SerializationTest3() {
	}

	public void writeExternal(ObjectOutput out) throws IOException {
		Date d = new Date();
		out.writeObject(d);
		out.writeObject(value);
	}

	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		Date d = (Date) in.readObject();
		System.out.println(d);
		System.out.println((String) in.readObject());
	}

}
