package com.java.random;

import java.util.Random;

public class RandomTest {
	public static void main(String[] args) {
		long seed = 1000;
		Random r = new Random();
		Random r2 = new Random(seed);
		System.out.println("����int�ͷ�Χ�����������" + r.nextInt());
		System.out.println("����[0,100)��Χ�����������" + r.nextInt(100));
		System.out.println("����long�ͷ�Χ�����������" + r.nextLong());
		System.out.println("�������true��false��" + r.nextBoolean());
		System.out.println("����float�ͷ�Χ�������������" + r.nextFloat());
		System.out.println("����double�ͷ�Χ�������������" + r.nextDouble());
		System.out.println("������̬�ֲ��������������" + r.nextGaussian());
	}
}
