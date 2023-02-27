package com.java.math;

public class MathTest2 {
	public static void main(String[] args) {
		double degree_90 = 90.0;
		double degree_45 = 45.0;
		double degree_60 = 60.0;
		double degree_0 = 0;
		double radian_90 = Math.toRadians(degree_90);
		double radian_60 = Math.toRadians(degree_60);
		double radian_45 = Math.toRadians(degree_45);
		double radian_0 = Math.toRadians(degree_0);
		double degree_pi = Math.toDegrees(Math.PI);
		double degree_half_pi = Math.toDegrees(Math.PI / 2);
		System.out.println("90�ȵĻ���ֵ��" + radian_90);
		System.out.println("45�ȵĻ���ֵ��" + radian_45);
		System.out.println("0�ȵĻ���ֵ��" + radian_0);
		System.out.println("�л��ȵĽǶ�ֵ��" + degree_pi);
		System.out.println("��/2���ȵĽǶ�ֵ��" + degree_half_pi);
		System.out.println("90�ȵ�����ֵ��" + Math.sin(radian_90));
		System.out.println("45�ȵ�����ֵ��" + Math.sin(radian_45));
		System.out.println("0�ȵ�����ֵ��" + Math.cos(radian_0));
		System.out.println("45�ȵ�����ֵ��" + Math.cos(radian_45));
		System.out.println("60�ȵ�����ֵ��" + Math.tan(radian_60));
		System.out.println("45�ȵ�����ֵ��" + Math.tan(radian_45));
		System.out.println("45�ȷ�����ֵ�� " + Math.asin(Math.sin(radian_45)));
		System.out.println("60�ȷ�����ֵ�� " + Math.acos(Math.cos(radian_60)));
		System.out.println("90�ȷ�����ֵ�� " + Math.atan(Math.tan(radian_90)));
	}
}
