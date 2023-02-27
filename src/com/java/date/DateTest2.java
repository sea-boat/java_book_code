package com.java.date;

import java.util.Date;

public class DateTest2 {
	public static void main(String[] args) throws InterruptedException {
		Date date = new Date();
		Thread.sleep(3000);
		Date date2 = new Date();
		System.out.println(date.after(date2));
		System.out.println(date.before(date2));
		System.out.println(date.getTime());
	}
}
