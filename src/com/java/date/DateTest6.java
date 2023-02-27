package com.java.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest6 {
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = null;
		Date date2 = null;
		try {
			date = sdf.parse("2023-10-13 08:10:10");
			date2 = sdf.parse("2023-10-10 20:30:30");
			System.out.println(date.getTime() - date2.getTime());
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
