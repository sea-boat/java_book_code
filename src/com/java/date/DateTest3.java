package com.java.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest3 {
	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("������yyyy��MM��dd�� HHʱmm��ss��");
		String str = sdf.format(date);
		System.out.println(str);
	}
}
