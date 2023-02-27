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
		System.out.println("90度的弧度值：" + radian_90);
		System.out.println("45度的弧度值：" + radian_45);
		System.out.println("0度的弧度值：" + radian_0);
		System.out.println("π弧度的角度值：" + degree_pi);
		System.out.println("π/2弧度的角度值：" + degree_half_pi);
		System.out.println("90度的正弦值：" + Math.sin(radian_90));
		System.out.println("45度的正弦值：" + Math.sin(radian_45));
		System.out.println("0度的余弦值：" + Math.cos(radian_0));
		System.out.println("45度的余弦值：" + Math.cos(radian_45));
		System.out.println("60度的正切值：" + Math.tan(radian_60));
		System.out.println("45度的正切值：" + Math.tan(radian_45));
		System.out.println("45度反正弦值： " + Math.asin(Math.sin(radian_45)));
		System.out.println("60度反余弦值： " + Math.acos(Math.cos(radian_60)));
		System.out.println("90度反正切值： " + Math.atan(Math.tan(radian_90)));
	}
}
