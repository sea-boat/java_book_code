package com.java.keyword;

public class InstanceofTest4 {
	public static void main(String[] args) {
		Woman w = new Woman();
		WomanTeacher wt = new WomanTeacher();
		System.out.println(w instanceof Person);
		System.out.println(wt instanceof Woman);
		System.out.println(wt instanceof Person);
	}
}

class WomanTeacher extends Woman {
}
