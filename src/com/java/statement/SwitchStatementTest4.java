package com.java.statement;

public class SwitchStatementTest4 {
	public static void main(String[] args) {
		int id = 36;
		switch (id % 10) {
		case 3:
			System.out.println("礼物套餐一");
			break;
		case 6:
			System.out.println("礼物套餐二");
			break;
		case 9:
			System.out.println("礼物套餐三");
			break;
		default:
			System.out.println("没中奖");
			break;
		}
	}
}
