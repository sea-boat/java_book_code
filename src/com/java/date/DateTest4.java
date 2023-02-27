package com.java.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest4 {
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = null;
		try {
			date = sdf.parse("2022-08-23 20:30:30");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(date);
	}
}
