package com.java.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest5 {
	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年");
		System.out.println(sdf.format(date));
		sdf = new SimpleDateFormat("MM月dd日");
		System.out.println(sdf.format(date));
		sdf = new SimpleDateFormat("HH小时mm分钟ss秒SS毫秒");
		System.out.println(sdf.format(date));
		sdf = new SimpleDateFormat("现在是上午还是下午？a");
		System.out.println(sdf.format(date));
		sdf = new SimpleDateFormat("当前的时区是Z");
		System.out.println(sdf.format(date));
		sdf = new SimpleDateFormat("今天是周几？E");
		System.out.println(sdf.format(date));
		sdf = new SimpleDateFormat("今天是一年中的第D天，第w周");
		System.out.println(sdf.format(date));
	}
}
