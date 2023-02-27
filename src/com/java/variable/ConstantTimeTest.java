package com.java.variable;

public class ConstantTimeTest {

	static int ONE_MINUTE = 60;//一分钟有 60 秒
	static int ONE_HOUR = 60;//一小时有 60 分钟
	static int ONE_DAY = 24;//一天有 24 小时

	public static void main(String[] args) {
		System.out.println(ONE_DAY * ONE_HOUR * ONE_MINUTE);
	}
}
