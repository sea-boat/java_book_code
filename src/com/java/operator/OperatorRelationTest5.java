package com.java.operator;

public class OperatorRelationTest5 {
	public static void main(String[] args) {
		int age = 28;
		if ((0 <= age) && (age <= 6))
			System.out.println("ͯ��");
		if ((7 <= age) && (age <= 17))
			System.out.println("����");
		if ((18 <= age) && (age <= 40))
			System.out.println("����");
		if ((41 <= age) && (age <= 65))
			System.out.println("����");
		if (66 <= age)
			System.out.println("ͯ��");
	}
}
