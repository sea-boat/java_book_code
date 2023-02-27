package com.java.operator;

public class OperatorLogicalOrTest3 {
	public static void main(String[] args) {
		if ((3 > 1) | (20 / 0 > 100))
			System.out.println("|不具有短路功能");
	}
}
