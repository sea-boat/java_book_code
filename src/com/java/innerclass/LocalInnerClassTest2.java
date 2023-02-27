package com.java.innerclass;

public class LocalInnerClassTest2 {

	{
		class LocalInnerClass {
			public void hello() {
				System.out.println("hello local inner class in block.");
			}
		}
		LocalInnerClass lic = new LocalInnerClass();
		lic.hello();
	}

	public static void main(String[] args) {
		new LocalInnerClassTest2();
	}
}
