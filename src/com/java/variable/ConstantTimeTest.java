package com.java.variable;

public class ConstantTimeTest {

	static int ONE_MINUTE = 60;//һ������ 60 ��
	static int ONE_HOUR = 60;//һСʱ�� 60 ����
	static int ONE_DAY = 24;//һ���� 24 Сʱ

	public static void main(String[] args) {
		System.out.println(ONE_DAY * ONE_HOUR * ONE_MINUTE);
	}
}
