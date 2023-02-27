package com.java.enumerate;

public class EnumTest4 {

	public static void main(String[] args) {
		printSeason(Season.SPRING);
		printSeason(Season.SUMMER);
		printSeason(Season.AUTUMN);
		printSeason(Season.WINTER);
	}

	static void printSeason(Season s) {
		switch (s) {
		case SPRING:
			System.out.println("春天");
			break;
		case SUMMER:
			System.out.println("夏天");
			break;
		case AUTUMN:
			System.out.println("秋天");
			break;
		case WINTER:
			System.out.println("冬天");
			break;
		}
	}

}
