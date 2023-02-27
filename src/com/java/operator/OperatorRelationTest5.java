package com.java.operator;

public class OperatorRelationTest5 {
	public static void main(String[] args) {
		int age = 28;
		if ((0 <= age) && (age <= 6))
			System.out.println("童年");
		if ((7 <= age) && (age <= 17))
			System.out.println("少年");
		if ((18 <= age) && (age <= 40))
			System.out.println("青年");
		if ((41 <= age) && (age <= 65))
			System.out.println("中年");
		if (66 <= age)
			System.out.println("童年");
	}
}
