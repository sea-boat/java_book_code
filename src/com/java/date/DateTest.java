package com.java.date;

import java.util.Date;

public class DateTest {
	public static void main(String[] args) {
		Date date = new Date();
		Date date2 = new Date(1000000);
		System.out.println(date);
		System.out.println(date2);
	}
}
